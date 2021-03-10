package com.stupidskills.project.dao;

import com.stupidskills.project.entity.UserEntity;
import java.sql.SQLException;

public interface ICustomerDao {

  void save(UserEntity userEntity);

  boolean update(UserEntity entity) throws SQLException;

  boolean delete(String userName) throws SQLException;

  UserEntity readData(String userId) throws SQLException;
}
