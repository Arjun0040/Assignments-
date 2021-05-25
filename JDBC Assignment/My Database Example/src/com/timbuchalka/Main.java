package com.timbuchalka;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Database Concept\\Employees.db");
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Employee" +
                    "(emp_id INTEGER, name TEXT, designation TEXT, age INTEGER, salary INTEGER)");

//            statement.execute("INSERT INTO Employee " +
//                    "VALUES(1, 'Arjun', 'Rapper', 23, 800)");
//            statement.execute("INSERT INTO Employee " +
//                    "VALUES(2, 'Tom', 'Parkour', 30, 700)");
//            statement.execute("INSERT INTO Employee " +
//                    "VALUES(3, 'Jon Snow', 'Swordsman', 44, 300)");
//            statement.execute("INSERT INTO Employee " +
//                    "VALUES(4, 'Josh', 'Cyclist', 53, 100)");
//            statement.execute("INSERT INTO Employee " +
//                    "VALUES(5, 'Jim', 'Artist', 52, 800)");
//            statement.execute("INSERT INTO Employee " +
//                    "VALUES(6, 'Tim', 'Chef', 60, 800)");

            statement.execute("UPDATE Employee SET designation = 'Lord Commander' WHERE age > 40");
            statement.execute("SELECT * FROM Employee");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("emp_id") + " "
                        + resultSet.getString("name") + " "
                        + resultSet.getString("designation") + " "
                        + resultSet.getInt("age") + " "
                        + resultSet.getInt("salary"));
            }

            resultSet.close();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
