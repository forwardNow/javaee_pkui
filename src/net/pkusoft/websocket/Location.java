package net.pkusoft.websocket;

public class Location {
	private String id;
	private int cmd = 2;
	private int x = 0;
	private int y = 0;
	
	private int vx = 10;
	private int vy = 10;
	
	public String getId() {
		return id;
	}
	public void setId( String id ) {
		this.id = id;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd( int cmd ) {
		this.cmd = cmd;
	}
	public int getX() {
		return x;
	}
	public void setX( int x ) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY( int y ) {
		this.y = y;
	}
	public int getVx() {
		return vx;
	}
	public void setVx( int vx ) {
		this.vx = vx;
	}
	public int getVy() {
		return vy;
	}
	public void setVy( int vy ) {
		this.vy = vy;
	}
	
	
}
