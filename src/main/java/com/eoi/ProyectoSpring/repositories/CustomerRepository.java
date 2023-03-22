package com.eoi.ProyectoSpring.repositories;

import com.eoi.ProyectoSpring.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
