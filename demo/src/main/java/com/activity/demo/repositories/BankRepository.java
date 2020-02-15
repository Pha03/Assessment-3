package com.activity.demo.repositories;

import com.activity.demo.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository {
    public Bank getBySsn(String ssn);
}
