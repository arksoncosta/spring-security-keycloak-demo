package com.arkson.keycloakdemo.controller;

import com.arkson.keycloakdemo.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @GetMapping
    public List<Customer> getAll() {
        return
                List.of(
                        Customer
                                .builder()
                                .id(UUID.randomUUID().toString())
                                .firstName("Arkson")
                                .lastName("Costa")
                                .email("email@email.com")
                                .build()
                );
    }

}
