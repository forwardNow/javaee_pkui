package net.pkusoft.websocket;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.pkusoft.framework.util.JsonUtils;

public class LocationEncoder implements Encoder.Text<Location> {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init( EndpointConfig arg0 ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String encode( Location location ) throws EncodeException {
		return JsonUtils.beanToJson( location );
	}

}
