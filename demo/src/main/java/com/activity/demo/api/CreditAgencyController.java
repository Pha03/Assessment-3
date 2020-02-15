package com.activity.demo.api;

import com.activity.demo.domain.CreditAgency;
import com.activity.demo.services.CreditAgencyServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/CreditAgency")
public class CreditAgencyController {


    @Autowired
    CreditAgencyServices creditAgencyServices;
    CreditAgency credit;

    @GetMapping("/creditCheck/{id}")
    public ResponseEntity<String>create(@PathVariable String id) throws JsonProcessingException{
        RestTemplate restTemplate=new RestTemplate();

        String getEligible = creditAgencyServices.getEligible(id);
        return ResponseEntity.ok("Status is" + getEligible);
    }
}
