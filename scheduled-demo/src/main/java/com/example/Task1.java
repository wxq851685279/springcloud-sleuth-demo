package com.example;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@EnableScheduling
public class Task1 {

	@Scheduled(fixedRate = 10000L)
	public void task1() {
		log.info("task1========");
	}
}
