package com.hibernate.ejercicio.service.impl;

import com.hibernate.ejercicio.model.Customer;
import com.hibernate.ejercicio.repository.CustomerRepository;
import com.hibernate.ejercicio.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public Customer delete(Customer customer) {
        return null;
    }
}
