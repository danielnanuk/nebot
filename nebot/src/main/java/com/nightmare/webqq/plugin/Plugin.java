package com.nightmare.webqq.plugin;

public interface Plugin {
	
	boolean isMatch(String message);
	String handleMessage(String message);
}
