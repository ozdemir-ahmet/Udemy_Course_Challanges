package com.ozdemir;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://moktok.javawebdev.com:33306/ahmet","ahmet","ahmet2020");

//        String sql = "SELECT * FROM Brewers";

        String sql = "SELECT * FROM message WHERE user_id = ? AND message LIKE ?";
        PreparedStatement statement  = connection.prepareStatement(sql);
        statement.setInt(1,1);
        statement.setString(2,"%data%");
        ResultSet rs = statement.executeQuery();

        while (rs.next()){
            System.out.println(rs.getString("message"));
        }
//        String sql = "INSERT INTO message (message, user_id, receiver_id) VALUES ('Hello Database', 1, 2)";
//        Statement statement = connection.createStatement();
//        int rowsInserted = statement.executeUpdate(sql);
//        System.out.println(rowsInserted);


//        ResultSet rs = statement.executeQuery(sql);

//        ArrayList<Brewer> brewers = new ArrayList<>();
//
//        while (rs.next()) {
//            Brewer b = new Brewer();
//            b.setId(rs.getInt("Id"));
//            b.setName(rs.getString("Name"));
//            brewers.add(b);
//        }
//        brewers.forEach(System.out::println);
    }
}
