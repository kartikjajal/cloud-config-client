package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageSourceFromServer {

	@Value("${message:Default Hello}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}
}
