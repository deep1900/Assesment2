package com.bank.app.service;


import com.bank.app.model.Customer;
import com.bank.app.model.Response;
import com.bank.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CustomerService
{

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestTemplate restTemplate;
    public static  final  String URL = "http://localhost:8095/creditCheck";

    public String creditService(Customer customer)
    {

        long ssn = customer.getSsn();
        Customer customer1 = customerRepository.findCustomerBySsn(ssn);
        System.out.println(customer1);
        if(customer.getCreditCardNo() != customer1.getCreditCardNo())
        {
            return ResponseEntity.notFound().build().toString();
        }

        if(!(customer.getFirstName().equalsIgnoreCase(customer1.getFirstName())))
        {
            return ResponseEntity.notFound().build().getStatusCode().toString();
        }
        if (!(customer.getLastName().equalsIgnoreCase(customer1.getLastName()))){
            return ResponseEntity.notFound().build().getStatusCode().toString();
        }
        else
        {
            System.out.println("Customr is " + customer1);
            ResponseEntity<Response> res = restTemplate.getForEntity(URL+"/"+customer.getSsn(),Response.class);
             Response response =   res.getBody();
            System.out.println(response);
            return ResponseEntity.ok().build().getStatusCode().toString();

        }

    }
}
