package com.nightmare.webqq.robot;

public class WebQQRobot {

	private static WebQQRobot robot;

	private boolean isConnected = false;

	private RobotContext context;

	public WebQQRobot(RobotContext context) {
		this.setContext(context);
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

	public boolean logout() {
		return false;
	}

	public RobotContext getContext() {
		return context;
	}

	public void setContext(RobotContext context) {
		this.context = context;
	}
}
