package com.hibernate.ejercicio.repository;

import com.hibernate.ejercicio.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
