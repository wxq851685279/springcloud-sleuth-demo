package com.example;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageOutputChannel {
	
	String OUTPUT = "message";
	
	@Output(MessageOutputChannel.OUTPUT)
	MessageChannel output();
}
