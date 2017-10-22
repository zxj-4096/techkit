package org.techkit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techkit.database.baen.User;
import com.techkit.database.dao.impl.UserDaoImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		 UserDaoImpl udi = new UserDaoImpl();
		 List<User> lst = new ArrayList<User>();
		 lst = udi.queryByUser(null);
		 for(User u:lst){
		     System.out.println(u.getId() + ",,," + u.getName());
		 }
	}
}
