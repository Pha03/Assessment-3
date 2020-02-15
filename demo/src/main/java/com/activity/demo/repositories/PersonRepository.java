package com.activity.demo.repositories;

import com.activity.demo.domain.CreditAgency;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {
    private static final List<CreditAgency> agency = new ArrayList<>();

    static{
        agency.add(new CreditAgency("112-23-3445","true"));
        agency.add(new CreditAgency("987-42-9857","false"));
        agency.add(new CreditAgency("636-64-5284","true"));
        agency.add(new CreditAgency("453-82-7493","true"));
    }
    public CreditAgency find(final String ssn){
        return agency
                .stream()
                .filter(CreditAgency->CreditAgency.getSsn().equals(ssn))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

    }

}
