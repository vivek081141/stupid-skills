package com.stupidskills.project.connection;

import com.stupidskills.project.entity.UserEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ConnectionHandler {


  public static final String MYSQL = "jdbc:mysql://localhost:3306/mysql";
  public static final String ROOT = "root";
  public static final String PASSWORD = "India@01";

  public  Connection getConnection() {
    Connection con = null;
    try {
     // Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(MYSQL, ROOT, PASSWORD);
    } catch (  SQLException e) {
      e.printStackTrace();
    }
    return con;
  }



  public void writeData(List<UserEntity> users) {
    String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

    Connection connection = getConnection();
    try {
      connection.setAutoCommit(false);
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1, "bill");
      statement.setString(2, "secretpass");
      statement.setString(3, "Bill Gates");
      statement.setString(4, "bill.gates@microsoft.com");
      int rowsInserted = statement.executeUpdate();
      if (rowsInserted > 0) {
        System.out.println("A new user was inserted successfully!");
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }




}
