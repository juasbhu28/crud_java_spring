package com.colfondos.crudjava.controller;

import com.colfondos.crudjava.model.Customer;

import com.colfondos.crudjava.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @RequestMapping(value="/list", method= RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("customer_list");
        List<Customer> customerList = customerService.getAllCustomers();
        model.addObject("customerList", customerList);

        return model;
    }



    @RequestMapping(value="/addCustomer/", method=RequestMethod.GET)
    public ModelAndView addCustomer() {

        ModelAndView model = new ModelAndView();
        Customer customer = new Customer();
        model.addObject("customerForm", customer);
        model.setViewName("customer_form");

        return model;
    }



    @RequestMapping(value="/editCustomer/{id}", method=RequestMethod.GET)
    public ModelAndView editCustomer(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Customer customer = customerService.getCustomerById(id);
        model.addObject("customerForm", customer);
        model.setViewName("customer_form");

        return model;
    }


    @RequestMapping(value="/addCustomer", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("customerForm") Customer customer) {

        customerService.addCustomer(customer);
        return new ModelAndView("redirect:/customer/list");

    }

    @RequestMapping(value="/deleteCustomer/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        customerService.deleteCustomer(id);
        return new ModelAndView("redirect:/customer/list");

    }

}
