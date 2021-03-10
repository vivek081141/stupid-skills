package com.stupidskills.project.controller;

import static org.junit.jupiter.api.Assertions.*;
import com.stupidskills.project.model.Customer;
import org.junit.jupiter.api.Test;

class CustomerControllerTest {

  CustomerController controller = new CustomerController();
  @Test
  void createCustomer() {
    Customer customer = new Customer(null, "Mr Senthil", 40, "senthil@gmail.com",
            "8951152580", "12345", null );
    controller.createCustomer(customer);
  }
}