package net.pkusoft.websocket;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.pkusoft.framework.util.JsonUtils;

@ServerEndpoint( 
		value= "/noauth/websocket/getPosition",
//		configurator = LocationServerEndpoint.class,
		encoders={LocationEncoder.class},
	    decoders={LocationDecoder.class}
)
public class LocationServerEndpoint {
	/** 记录所有的人员 */
	private Map<String, Location> personsMap = new HashMap<String, Location>();
	private Setting setting = new Setting(
				/* interval */ 16, 
				/* personNum */ 1, 
				/* xVelocity */ 10, 
				/* yVelocity */ 10, 
				/* minX */ 319708 / 10, 
				/* maxX */ 353835 / 10, 
				/* minY */ -359941 / 10, 
				/* maxY */ -311213 / 10 
			);
	
	@OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException, EncodeException {
		Basic basicRemote = session.getBasicRemote();
		
        // Print the client message for testing purposes
		System.out.println( "Received: " + message );
		
		// 如果接收到的消息包含 "personNum" ，则设置人数
		if ( message != null ) {
			Setting _settting = JsonUtils.jsonToBean( message, Setting.class );
			if ( _settting.getInterval() > 0 ) {
				this.setting.setInterval( _settting.getInterval() );
			}
			if ( _settting.getPersonNum() > 0 ) {
				this.setting.setPersonNum( _settting.getPersonNum() );
			}
			if ( _settting.getxVelocity() > 0 ) {
				this.setting.setxVelocity( _settting.getxVelocity() );
			}
			if ( _settting.getyVelocity() > 0 ) {
				this.setting.setyVelocity( _settting.getyVelocity() );
			}
			if ( _settting.getMinX() > 0 ) {
				this.setting.setMinX( _settting.getMinX() );
			}
			if ( _settting.getMaxX() > 0 ) {
				this.setting.setMaxX( _settting.getMaxX() );
			}
			if ( -_settting.getMinY() > 0 ) {
				this.setting.setMinY( _settting.getMinY() );
			}
			if ( -_settting.getMaxY() > 0 ) {
				this.setting.setMaxY( _settting.getMaxY() );
			}
		}


		while ( true ) {
			
			Thread.sleep( this.setting.getInterval() );
			
			for ( int id = 1, len = this.setting.getPersonNum(); id <= len; id++ ) {
				basicRemote.sendObject( this.getData( id + "" ) );
			}
        }

    }

	private String getCurrentTime() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/**
	 * 
	 * @param id
	 * @return
	 * {
	 * 		cmd: 2,
	 * 		id: "56789",
	 * 		x: 0,
	 * 		y: 0
	 * }
	 */
	private Location getData( String id ) {
		Location location = this.personsMap.get( id );
		int x; 
		int y;
		int vx;
		int vy;
		
		// 如果没有，则创建
		if ( location == null ) {
			location = new Location();
			// 在给定范围里取一个随机坐标点
			location.setId( id );
			location.setX( this.getRandomValue( this.setting.getMinX(), this.setting.getMaxX() ) );
			location.setY( -this.getRandomValue( -this.setting.getMaxY(), -this.setting.getMinY() ) );
			location.setVx( this.setting.getxVelocity() );
			location.setVy( this.setting.getyVelocity() );
			this.personsMap.put( id, location );
		} 
		
		x = location.getX();
		y = location.getY(); 
		vx = location.getVx();
		vy = location.getVy();
		
		if ( x < this.setting.getMinX() ) {
			location.setVx( this.setting.getxVelocity() );
		}
		if ( x > this.setting.getMaxX() ) {
			location.setVx( -this.setting.getxVelocity() );
		}
		if ( y < this.setting.getMinY() ) {
			location.setVy( this.setting.getyVelocity() );
		}
		if ( y > this.setting.getMaxY() ) {
			location.setVy( -this.setting.getyVelocity() );
		}
			
		location.setX( x + vx );
		location.setY( y + vy );
		
		return location;
	}
	
	/**
	 * 获取随机数
	 * @param min
	 * @param max
	 * @return
	 */
	private int getRandomValue(int min, int max) {
		return new Random().nextInt( max ) % ( max - min + 1 ) + min;
	}
	
    @OnOpen
    public void onOpen( Session session ) throws IOException {
    	String msg = "Client connected on " + this.getCurrentTime();
    	session.getBasicRemote().sendText( msg );
        System.out.println( msg );
    }

    @OnClose
	public void onClose( Session session ) throws IOException {
    	String msg = "Connection closed on " + this.getCurrentTime();
    	session.getBasicRemote().sendText( msg );
        System.out.println( msg );
    }
}
