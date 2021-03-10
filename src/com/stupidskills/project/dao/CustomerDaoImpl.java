package com.stupidskills.project.dao;

import com.stupidskills.project.connection.ConnectionHandler;
import com.stupidskills.project.entity.UserEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements ICustomerDao {

  private ConnectionHandler connectionHandler = new ConnectionHandler();

  @Override
  public void save(UserEntity userEntity) {
    String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

    Connection connection = connectionHandler.getConnection();
    try {
      connection.setAutoCommit(false);

      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1, userEntity.getUsername());
      statement.setString(2, userEntity.getPassword());
      statement.setString(3, userEntity.getFullName());
      statement.setString(4, userEntity.getEmail());
      int rowsInserted = statement.executeUpdate();
      if (rowsInserted > 0) {
        System.out.println("A new user was inserted successfully!");
      }

      connection.commit();

    } catch (SQLException exception) {
      exception.printStackTrace();
      //
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException exception) {
          exception.printStackTrace();
        }
      }
    }
  }


  @Override
  public boolean update(UserEntity entity) throws SQLException {
    boolean flag = false;
    String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
    Connection connection = connectionHandler.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, entity.getPassword());
    statement.setString(2, entity.getFullName());
    statement.setString(3, entity.getEmail());
    statement.setString(4, entity.getUsername());

    int rowsUpdated = statement.executeUpdate();
    if (rowsUpdated > 0) {
      flag = true;
      System.out.println("An existing user was updated successfully!");
    }

    return flag;
  }

  @Override
  public boolean delete(String userName) throws SQLException {
    boolean flag = false;

    String sql = "DELETE FROM Users WHERE username=?";
    Connection connection = connectionHandler.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, userName);

    int rowsDeleted = statement.executeUpdate();
    if (rowsDeleted > 0) {
      flag = true;
      System.out.println("A user was deleted successfully!");
    }
    return flag;
  }



  @Override
  public UserEntity readData(String userId) throws SQLException {
    UserEntity entity = new UserEntity();
    ResultSet resultSet = null;
    //SELECT user_id, username, password, fullname, email FROM Users WHERE user_id = '12' OR 1=1'
    String sql = "SELECT user_id, username, password, fullname, email FROM Users WHERE user_id = "
            +  "'" + userId + "'";
    Connection connection = connectionHandler.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1, userId);
      resultSet = statement.executeQuery();
    } catch (SQLException exception) {
      exception.printStackTrace();
    }finally {
      if (connection != null){
        connection.close();
      }
    }

    /**
     * resultset 2
     */
    while (resultSet.next()) {
      Integer id = resultSet.getInt("user_id");

      String name = resultSet.getString(2);
      String pass = resultSet.getString(3);
      String fullname = resultSet.getString("fullname");
      String email = resultSet.getString("email");

      entity.setFullName(fullname);
      entity.setPassword(pass);
      entity.setUserId(id);
      entity.setEmail(email);
      entity.setUsername(name);

    }
    return  entity;
  }
}
