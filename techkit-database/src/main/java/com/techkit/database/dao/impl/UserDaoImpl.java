package com.techkit.database.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techkit.database.baen.User;
import com.techkit.database.dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    Connection conn;
    Statement stmt;
    public UserDaoImpl(){
        try {
            Class.forName("org.h2.Driver");
             conn = DriverManager.getConnection("jdbc:h2:D:\\project\\java\\MyTestPrj\\db\\test", "sa", "sa");
             stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM TEST ");
//            while (rs.next()) {
//                System.out.println(rs.getInt("ID") + "," + rs.getString("NAME"));
//            }
//            conn.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // D:\project\java\MyTestPrj\db
    }
    public boolean insert(User user) {
        //DC.execuse(database,'insert into user ()');
        return false;
    }

    public boolean delete(User user) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean update(User user) {
        // TODO Auto-generated method stub
        return false;
    }

    public List<User> queryByUser(User user) {
        
        List<User> lst = new ArrayList<User>();
        ResultSet rs;
        try {
            rs = stmt.executeQuery("SELECT * FROM TEST ");
            while (rs.next()) {
                

                User u = new User();
                u.setId(String.valueOf(rs.getInt("ID")));
                u.setName(rs.getString("NAME"));
                lst.add(u);
            }
            conn.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return lst;
    }

}
