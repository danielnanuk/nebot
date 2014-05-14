package com.nightmare.webqq.test;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.junit.Before;
import org.junit.Test;

import com.nightmare.webqq.robot.Hub;

public class HubTest {
	private Hub hub;

	@Before
	public void init() {
		hub = new Hub();
	}

	@Test
	public void textExecute() {
		HttpGet get = new HttpGet("http://www.baidu.com");
		try {
			HttpResponse response = hub.execute(get);
			if (response.getStatusLine().getStatusCode() == 200) {
				for (String line : IOUtils.readLines(response.getEntity()
						.getContent())) {
					System.out.println(line);
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
