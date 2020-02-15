package com.activity.demo.services;

import com.activity.demo.domain.Bank;
import com.activity.demo.repositories.BankRepository;
import org.springframework.stereotype.Service;

@Service
public class BankServices {
    private static BankRepository repo;

    public BankServices(BankRepository repo) {
        this.repo = repo;
    }
    public static Bank getBank(String ssn){
        return repo.getBySsn(ssn);
    }

}

