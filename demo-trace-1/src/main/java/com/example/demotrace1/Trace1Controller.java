package com.example.demotrace1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class Trace1Controller {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value="/trace1")
    public String trace1() {
        log.info("======<call trace 1>=======");
        ResponseEntity<String> result = restTemplate.getForEntity("http://TRACE-2/trace2", String.class);
        log.info("result==>{}",result.getStatusCode());
        return "ok";
    }

}
