package com.colfondos.crudjava.repository;

import com.colfondos.crudjava.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
