package com.spi.github;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@RequestMapping("/message")
	public String getMessage() {
		
		return "Github Action Demo!!";
	}

}
