package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "identification")
    private Long identification;
    private Long employeeId;
    private String addressLine1;
    private String addressLine2;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zip;
    private String zipPlusFour;
    private String county;
    private String country;

    @OneToOne(mappedBy = "address")
    private Employee employee;

    public Address() {
    }

    public Address(Long employeeId, String addressLine1, String addressLine2,
            String apartmentNumber, String city, String state, String zip, String zipPlusFour, String county,
            String country) {
        this.employeeId = employeeId;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.zipPlusFour = zipPlusFour;
        this.county = county;
        this.country = country;
    }

    public Long getIdentification() {
        return identification;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getZipPlusFour() {
        return zipPlusFour;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "identification=" + identification +
                ", employeeId='" + employeeId + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", zipPlusFour='" + zipPlusFour + '\'' +
                ", county='" + county + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}

