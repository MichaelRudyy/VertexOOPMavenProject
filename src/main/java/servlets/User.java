package servlets;

/**
 * Created by nick on 19.11.16.
 */
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }


    User(Integer id, String firstName, String lastName, String email, String password){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email = email;
        this.password = password;
    }




}
