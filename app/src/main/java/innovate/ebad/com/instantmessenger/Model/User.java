package innovate.ebad.com.instantmessenger.Model;



public class User {
    private String email,password;


    public User()
    {

    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
