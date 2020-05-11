package com.example.service1.boundary;

import com.example.service1.control.CustomerRepository;
import com.example.service1.entity.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CustomerEndpoint {
    private final CustomerRepository repository;

    @GetMapping("/customers")
    public List<Customer> findAll() {
        log.info("Customers requested");
        return repository.findAll();
    }
}
