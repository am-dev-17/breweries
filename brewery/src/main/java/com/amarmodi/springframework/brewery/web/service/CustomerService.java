package com.amarmodi.springframework.brewery.web.service;

import com.amarmodi.springframework.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customer);

    void deleteById(UUID customerId);

}
