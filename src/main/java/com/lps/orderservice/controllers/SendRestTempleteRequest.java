package com.lps.orderservice.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Slf4j
public class SendRestTempleteRequest {

    private final static String URL = "http://localhost:8989/getresponse/";
    private final RestTemplate templete;


    @GetMapping
    public String sendRequest() {
        log.info("Sending request to {}", URL);
        return templete.getForObject(URL + "1", String.class);
    }
}
