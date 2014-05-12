package com.nightmare.webqq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AppController {
	@ResponseBody
	@RequestMapping
	public String hello() {
		return "Hello!";
	}

	@RequestMapping("/manage")
	public String manage() {
		return null;
	}

	@RequestMapping("/manage/broadcast")
	public String broadcast() {
		return null;
	}

	@RequestMapping("/manage/broadcast")
	public String broadcast(String msg) {
		return null;
	}

	@RequestMapping("/manage/groups")
	public String groups() {
		return null;
	}

	@RequestMapping("/manage/groups/${groupId}")
	public String group(@PathVariable("groupId") Integer groupId) {

		return null;
	}

	@RequestMapping("/manage/groups/${groupId}/switch")
	public String switchgroup(@PathVariable("groupId") Integer groupId) {
		return null;
	}

	@RequestMapping("/manage/groups/${groupId}/plugins")
	public String groupPlugins(@PathVariable("groupId") Integer groupId) {
		return null;
	}

	@RequestMapping("/manage/groups/${groupId}/plugins/${pluginId}")
	public String groupPlugin(@PathVariable("groupId") Integer groupId,
			@PathVariable("pluginId") Integer pluginId) {

		return null;
	}

	@RequestMapping("/manage/groups/${groupId}/plugins/{pluginId}/switch")
	public String groupPluginSwitch(@PathVariable("groupId") Integer groupId,
			@PathVariable("pluginId") Integer pluginId) {
		return null;
	}

	@RequestMapping("/manage/plugins")
	public String plugins() {
		return null;
	}

}
