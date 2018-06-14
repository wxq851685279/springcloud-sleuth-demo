package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.http.MediaType;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(MessageOutputChannel.class)
public class SendMessage {
	
	@Autowired
	@Output(MessageOutputChannel.OUTPUT)
	private MessageChannel messageChannel;

	public boolean send() {

		Message<String> message = MessageBuilder.withPayload("{\"data\":\"message\"}")
				.setHeader(MessageHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).build();
		return messageChannel.send(message);
	}

}
