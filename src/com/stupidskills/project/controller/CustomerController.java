package com.stupidskills.project.controller;

import com.stupidskills.project.model.Customer;
import com.stupidskills.project.service.CustomerServiceImpl;
import com.stupidskills.project.service.ICustomerService;

public class CustomerController {

  private ICustomerService service;

  public CustomerController() {
    service = new CustomerServiceImpl();
  }

  public void createCustomer (Customer customer) {
    service.createCustomer(customer);
  }

  public void editCustomer ( Customer customer) {
     boolean flag = service.editCustomer(customer);
  }

  public void deleteCustomer( String userId) {
    boolean flag = service.deleteCustomer(userId);
  }

  public void getCustomer (String userId) {
    Customer customer = service.getCustomer(userId);

  }
}
