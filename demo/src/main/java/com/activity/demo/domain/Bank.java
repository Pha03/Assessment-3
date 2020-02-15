package com.activity.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bank {
    private String firstName;
    private String lastName;
    private String zipCode;
    @Id
    private String ssn;
    private String creditcardno;

    public Bank(String firstName, String lastName, String zipCode, String ssn, String creditCardNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.ssn = ssn;
        this.creditcardno = creditCardNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreditCardNo() {
        return creditcardno;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditcardno = creditCardNo;
    }
}
