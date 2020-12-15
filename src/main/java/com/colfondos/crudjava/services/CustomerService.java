package com.colfondos.crudjava.services;

import com.colfondos.crudjava.model.Customer;
import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(int id);

    public void addCustomer(Customer student);

    public void deleteCustomer(int id);
}

