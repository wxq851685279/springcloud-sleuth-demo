package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
	
	@Autowired
	private SendMessage sendMessage;	
	
	@GetMapping("/send")
	public boolean send() {
		boolean result = sendMessage.send();
		return result;
	}
}
