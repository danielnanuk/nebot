package com.nightmare.webqq.robot;

public class WebQQRobot {

	private static WebQQRobot robot;

	private boolean isConnected = false;
	
	
	
	public WebQQRobot(RobotContext context) {
		// TODO Auto-generated constructor stub
	}

	public boolean connect() {
		return false;
	}

	public static WebQQRobot newInstance(RobotContext context) {
		if (robot == null) {
			robot = new WebQQRobot(context);
		}
		return robot;
	}

	public boolean isConnected() {
		return isConnected;
	}
	public boolean logout(){
		return false;
	}
}
