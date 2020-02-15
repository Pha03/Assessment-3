package com.activity.demo.api;

import com.activity.demo.services.BankServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping
public class BankController {
    @Autowired
    private BankServices service;





    @PostMapping("/ApprovalEligibility/{ssn}/")
    public ResponseEntity<String> gettingEligibility(@PathVariable String ssn)throws JsonProcessingException
    {
        RestTemplate restTemplate=new RestTemplate();
        String S = restTemplate.getForEntity(URI.create("localhost:1234/ssnCheck/"+ssn),String.class).getBody();
        String Eligible = restTemplate.getForEntity(URI.create("localhost:1234/creditCheck/"+ssn),String.class).getBody();
        return ResponseEntity.ok(Eligible);

    }
}
