package com.stupidskills.project.service;

import com.stupidskills.project.model.Customer;

public interface ICustomerService {
  /*

   */
  void createCustomer(Customer customer);

  boolean editCustomer(Customer customer);

  boolean deleteCustomer(String userId);

  Customer getCustomer(String userId);
}
