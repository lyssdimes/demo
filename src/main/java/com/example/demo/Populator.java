package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.models.Address;
import com.example.demo.models.Employee;
import com.example.demo.repositories.AddressRepository;
import com.example.demo.repositories.EmployeeRepository;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        final Logger logger = LoggerFactory.getLogger(Populator.class);

        // Create and save sample employees
        Employee employee1 = new Employee("John", "Jacob", "Jingleheimer", "I");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Emily", "Rose", "Clark", "II");
        employeeRepository.save(employee2);

        logger.info("Saved employee: {}", employee1);
        logger.info("Saved employee: {}", employee2);

        Address address1 = new Address(employee1.getId(), "262 N Highland", "East Landing", "Apt #4", "Toledo", "OH", "44674", "44674-1111", "Lemon", "USA");
        addressRepository.save(address1);

        Address address2 = new Address(employee2.getId(), "123 Happy Road", "Sunset Circle", "Apt #1", "San Diego", "CA", "91872", "91872-5555", "Sunny", "USA");
        addressRepository.save(address2);

        logger.info("Saved address: {}", address1);
        logger.info("Saved address: {}", address2);

    }

}

