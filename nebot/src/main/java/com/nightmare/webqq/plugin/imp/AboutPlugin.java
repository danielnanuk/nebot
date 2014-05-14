package com.nightmare.webqq.plugin.imp;

import com.nightmare.webqq.plugin.Plugin;

public class AboutPlugin implements Plugin {

	private String aboutMsg = "None:\nAuthor: Nightmare\nE-mail: danielnanuk@gmail.com\nProject:http://";

	public AboutPlugin(String aboutMsg) {
		if (aboutMsg != null)
			this.aboutMsg = aboutMsg;
	}

	@Override
	public String handleMessage(String message) {
		return aboutMsg;
	}

	@Override
	public boolean isMatch(String message) {
		return "about".equalsIgnoreCase(message);
	}

}
