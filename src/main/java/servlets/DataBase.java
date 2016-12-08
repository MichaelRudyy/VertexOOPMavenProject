package servlets;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by nick on 20.11.16.
 */
public class DataBase {

    // JDBC driver name and database URL
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://mysql303.1gb.ua/gbua_pivasik";

    //  Database credentials
    final static String USER = "gbua_pivasik";
    final static String PASS = "86aa4a52cnm1";

    public static ArrayList getProducts() {


        ArrayList<Product> products = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database to get products...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement - for products...");
            stmt = conn.createStatement();
            String sql = "SELECT `ID`,`TITLE`,`DESCRIPTION`,`PRICE`,`IMG_URL` FROM products";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String title = rs.getString("TITLE");
                String description = rs.getString("DESCRIPTION");
                Double price = rs.getDouble("PRICE");
                String imgUrl = rs.getString("IMG_URL");

                products.add(new Product(id, title, description, price, imgUrl));

//                    //Display values
//                    System.out.print("ID: " + id);
//                    //System.out.print(", Age: " + age);
//                    System.out.print(", First: " + first);
//                    System.out.println(", Last: " + last);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");

        return products;
    }

    public static ArrayList getUsers(){

        ArrayList<User> users = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database to get users...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql =  "SELECT `ID`,`FIRST NAME`,`LAST NAME`,`EMAIL`,`PASSWORD` FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String firstName = rs.getString("FIRST NAME");
                String lastName = rs.getString("LAST NAME");
                String email = rs.getString("EMAIL");
                String password = rs.getString("PASSWORD");

                users.add(new User(id, firstName, lastName, email, password));

//                    //Display values
//                    System.out.print("ID: " + id);
//                    //System.out.print(", Age: " + age);
//                    System.out.print(", First: " + first);
//                    System.out.println(", Last: " + last);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");

        return users;
    }

    public static void addUser(User user){
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");


            //getting the biggest existing ID
            ArrayList<User> users =  DataBase.getUsers();
            int id = 0;

            for (User user1:users
                 ) {
                if (user1.getId() >id) id = user1.getId();
            }
            id = id+1;

            //STEP 3: Open a connection

            System.out.println("Connecting to database to get users...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "INSERT INTO users (`ID`,`FIRST NAME`,`LAST NAME`,`EMAIL`,`PASSWORD`) VALUES("
                    +id+","
                    +"'"+user.getFirstName()+"'"+","
                    +"'"+user.getLastName()+"'"+","
                    +"'"+user.getEmail()+"'"+","
                    +"'"+user.getPassword()+"'"+")"+";"
                    ;

            System.out.println(sql);

            //executing update query
            stmt.executeUpdate(sql);

            //STEP 6: Clean-up environmentstmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }


}
