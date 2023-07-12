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
        Employee employee1 = new Employee("John", "Jacob", "Jingleheimer");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Emily", "Rose", "Clark");
        employeeRepository.save(employee2);

        logger.info("Saved employee: {}", employee1);
        logger.info("Saved employee: {}", employee2);

        Address address1 = new Address(1L, "street", "sample", "next", "4323", "2342", "fef", "lemon");
        addressRepository.save(address1);

        Address address2 = new Address(2L, "road", "simple", "first", "6345", "3434", "fsef", "orange");
        addressRepository.save(address2);

        logger.info("Saved address: {}", address1);
        logger.info("Saved address: {}", address2);

    }

}
