package com.hibernate.ejercicio.service;

import com.hibernate.ejercicio.model.Customer;

public interface CustomerService {

    Customer save(Customer customer);
    Customer findById(Long id);
    Customer delete(Customer customer);
}
