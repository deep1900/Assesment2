package com.bank.app.repository;

import com.bank.app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    @Query("select c from Customer c where c.ssn=?1")
    public Customer findCustomerBySsn(long id);
}
