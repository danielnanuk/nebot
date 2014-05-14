package com.nightmare.webqq.robot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.log4j.Logger;

public class Hub {

	private static Logger logger = Logger.getLogger(Hub.class);
	private HttpClient client;

	public Hub() {
		List<Header> headers = new ArrayList<Header>();
		logger.info(" initializing HttpClient ");
		headers.add(new BasicHeader("Accept-Charset", "UTF-8,*;q=0.5"));
		client = HttpClientBuilder
				.create()
				.setUserAgent(
						"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36"
								+ " (KHTML, like Gecko) Ubuntu Chromium/28.0.1500.71"
								+ "Chrome/28.0.1500.71 Safari/537.36")
				.setDefaultHeaders(headers).build();

	}

	public HttpResponse execute(HttpUriRequest request) throws IOException {
		return client.execute(request);
	}
}
