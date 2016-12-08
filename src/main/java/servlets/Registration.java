package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by nick on 19.11.16.
 */
public class Registration extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("FirstName") != "" && req.getParameter("LastName") != "" && req.getParameter("Email") != "" && req.getParameter("Pass") != "") {
            String firstName = req.getParameter("FirstName");
            String lastName = req.getParameter("LastName");

            String email = req.getParameter("Email");
            String password = req.getParameter("Pass");

            ArrayList<User> users = DataBase.getUsers();

            for (User user:users
                 ) {
                if (!user.getFirstName().equalsIgnoreCase(firstName) && !user.getLastName().equalsIgnoreCase(lastName)
                        && !user.getEmail().equalsIgnoreCase(email)
                        && !user.getPassword().equalsIgnoreCase(password)) {
                    System.out.println("no such user yet, registering user to database");
                    DataBase.addUser(new User(null, firstName, lastName,
                            email, password));
                }
                else {
                    System.out.println("have such user");



                }
                break;
            }

            String responseString = "Create User: " + "First Name: "
                    + firstName + "Last Name: " + lastName + " Email: "
                    + email + " Password " + password;
            System.out.println(responseString);
            resp.getOutputStream().write(responseString.getBytes());
        }else {
            String s = "Please fill all the fields!";
            System.out.println(s);
            resp.getOutputStream().write(s.getBytes());
        }
    }

}
