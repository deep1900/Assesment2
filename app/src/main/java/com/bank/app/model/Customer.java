package com.bank.app.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @JsonProperty
    private long id;


    @Column(name = "FirstName", length = 25)
    @JsonProperty
    private String firstName;


    @Column(name = "LastName", length = 25)
    @JsonProperty
    private String lastName;


    @JsonProperty
    @Column(name = "SSN", length = 9)
    private long ssn;


    @JsonProperty
    @Column(name = "CreditCardNo", length = 16)
    private long creditCardNo;

    public Customer() {
    }

    public Customer(long id, String firstName, String lastName, long ssn, long creditCardNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.creditCardNo = creditCardNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(long creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", creditCardNo='" + creditCardNo + '\'' +
                '}';
    }
}
