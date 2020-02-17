package com.credit.check.repository;

import com.credit.check.model.CreditCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCheckRepository extends JpaRepository<CreditCheck,Long >
{
    @Query("select c.status from CreditCheck c where c.ssn=?1")
    public boolean getStatusbySsn(long ssn);
}
