package com.credit.check.controller;

import com.credit.check.model.CreditCheck;
import com.credit.check.repository.CreditCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/creditCheck")
public class CreditCheckController
{
    @Autowired
    CreditCheckRepository repository;

    @GetMapping("/{id}")
    public boolean checkbyId(@PathVariable long id)
    {
        boolean b =  repository.getStatusbySsn(id);
        System.out.println(b);
        return b;

    }

    @PostMapping("/add")
    public void add(@RequestBody List<CreditCheck> credit){
        repository.saveAll(credit);

    }
}
