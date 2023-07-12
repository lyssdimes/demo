package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Address;
import com.example.demo.repositories.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @PostMapping("/new")
    public Address createAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }
}
