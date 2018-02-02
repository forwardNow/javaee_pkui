package net.pkusoft.websocket;

public class Setting {

	/** 坐标的推送间隔时间（毫秒数） */
	private Integer interval/* = 16 */;
	
	/** 人数 */	
	private Integer personNum/* = 1 */;
	/** X轴方向的速度 */
	private Integer xVelocity/* = 10  */;
	/** Y轴方向的速度 */
	private Integer yVelocity/* = 10  */;
	
	/** 最小X坐标值 */
	private Integer minX/* = 319708 / 10  */;
	/** 最大X坐标值 */
	private Integer maxX/* = 353835 / 10  */;
	/** 最小Y坐标值 */
	private Integer minY/* = -359941 / 10  */;
	/** 最大Y坐标值 */
	private Integer maxY/* = -311213 / 10  */;
	
	
	public Setting( Integer interval, Integer personNum, Integer xVelocity, Integer yVelocity, Integer minX, Integer maxX, Integer minY, Integer maxY ) {
		super();
		this.interval = interval;
		this.personNum = personNum;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}


	public Setting() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getInterval() {
		return interval;
	}


	public void setInterval( Integer interval ) {
		this.interval = interval;
	}


	public Integer getPersonNum() {
		return personNum;
	}


	public void setPersonNum( Integer personNum ) {
		this.personNum = personNum;
	}


	public Integer getxVelocity() {
		return xVelocity;
	}


	public void setxVelocity( Integer xVelocity ) {
		this.xVelocity = xVelocity;
	}


	public Integer getyVelocity() {
		return yVelocity;
	}


	public void setyVelocity( Integer yVelocity ) {
		this.yVelocity = yVelocity;
	}


	public Integer getMinX() {
		return minX;
	}


	public void setMinX( Integer minX ) {
		this.minX = minX;
	}


	public Integer getMaxX() {
		return maxX;
	}


	public void setMaxX( Integer maxX ) {
		this.maxX = maxX;
	}


	public Integer getMinY() {
		return minY;
	}


	public void setMinY( Integer minY ) {
		this.minY = minY;
	}


	public Integer getMaxY() {
		return maxY;
	}


	public void setMaxY( Integer maxY ) {
		this.maxY = maxY;
	}
	
	
	
}
