package com.credit.check.model;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name = "CreditCheck")
public class CreditCheck {

    @Column(name="Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "SSN")
    private long ssn;
    @Column(name = "status")
    private boolean status;

    public CreditCheck() {
    }

    public CreditCheck(long id, long ssn, boolean status) {
        this.id = id;
        this.ssn = ssn;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
