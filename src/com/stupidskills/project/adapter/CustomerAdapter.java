package com.stupidskills.project.adapter;

import com.stupidskills.project.entity.UserEntity;
import com.stupidskills.project.model.Customer;

public class CustomerAdapter {


  public UserEntity convertCustomerToEntity(Customer customer) {
    UserEntity entity = new UserEntity();
    entity.setFullName(customer.getName());
    entity.setEmail(customer.getMail());
    entity.setUsername(customer.getMail());
    entity.setPassword(customer.getPassword());
    return entity;
  }

  public Customer convertEntityToCustomer(UserEntity entity) {
    //todo
    //create a new Customer pojo and convert the entity to pojo
    return null;
  }
}
