package com.lps.orderservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor
public class RestClientController {

    private final RestClient restClient;


    @GetMapping("/rest-client")
    public String callUsingRestClient() {
        return restClient.get()
                .uri("/consumer/provider/message")
                .retrieve()
                .body(String.class);
    }
}