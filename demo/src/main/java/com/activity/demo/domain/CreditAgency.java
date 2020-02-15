package com.activity.demo.domain;

import javax.persistence.Entity;

@Entity
public class CreditAgency {
   private String ssn;
   private String eligible;

    public CreditAgency(String ssn, String eligible) {
        this.ssn = ssn;
        this.eligible = eligible;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEligible() {
        return eligible;
    }

    public void setEligible(String eligible) {
        this.eligible = eligible;
    }
}
