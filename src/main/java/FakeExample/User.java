package FakeExample;

import java.util.List;

public class User {
    String id;
    String name;
    String surname;
    String email;

    public User(String id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email=email;
    }

    public boolean isEmailInGoogleDomain(){
        return email.endsWith("gmail.com");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
