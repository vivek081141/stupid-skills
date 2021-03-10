package com.stupidskills.project.service;

import com.stupidskills.project.adapter.CustomerAdapter;
import com.stupidskills.project.dao.CustomerDaoImpl;
import com.stupidskills.project.dao.ICustomerDao;
import com.stupidskills.project.entity.UserEntity;
import com.stupidskills.project.model.Customer;
import com.stupidskills.project.validators.CustomerValidator;
import java.sql.SQLException;

public class CustomerServiceImpl implements ICustomerService {

  private CustomerAdapter adapter;
  private CustomerValidator validator;
  private ICustomerDao customerDao;

  public CustomerServiceImpl() {
    this.adapter = new CustomerAdapter();
    this.validator = new CustomerValidator();
    this.customerDao = new CustomerDaoImpl();
  }

  @Override
  public void createCustomer(Customer customer) {
    if (!validator.validate(customer)) {
      throw new IllegalStateException();
    }

    UserEntity userEntity = adapter.convertCustomerToEntity(customer);
    this.customerDao.save(userEntity);
  }

  @Override
  public boolean editCustomer(Customer customer) {
    boolean flag = false;
    if (!validator.validate(customer)) {
      throw new IllegalStateException();
    }

    UserEntity userEntity = adapter.convertCustomerToEntity(customer);

    try {
      flag =  this.customerDao.update(userEntity);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    return flag;
  }


  @Override
  public boolean deleteCustomer(String userId) {
    boolean flag = false;

    try {
      flag =  this.customerDao.delete(userId);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    return flag;
  }

  @Override
  public Customer getCustomer(String userId) {
    UserEntity entity = null;

    try {
      entity =  this.customerDao.readData(userId);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }

    return adapter.convertEntityToCustomer(entity);
  }

}
