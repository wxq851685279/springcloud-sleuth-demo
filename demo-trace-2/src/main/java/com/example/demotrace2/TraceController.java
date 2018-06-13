package com.example.demotrace2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TraceController {
    @GetMapping(value="/trace2")
    public String trace() {
        log.info("======<call trace 2>=======");
        return "trance-2";
    }
}
