package com.activity.demo.services;

import com.activity.demo.domain.CreditAgency;
import com.activity.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CreditAgencyServices implements CreditAgencyServiceImpl{

    @Autowired
    private  PersonRepository personRepository;

    public  String getEligible(String credit)
    {
        CreditAgency creditAgency = personRepository.find(credit);
        String eligible = creditAgency.getEligible();
        return eligible;
    }

}
