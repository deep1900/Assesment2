package com.bank.app.controller;

import com.bank.app.model.Customer;
import com.bank.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;

    @GetMapping("/test")
    public String test(){
        return "Test";
    }

    @PostMapping("/creditCheck")
    public ResponseEntity<String> creditCheck(@RequestBody Customer customer){
        String customer1 = customerService.creditService(customer);
        return ResponseEntity.ok(customer1);
    }
}
