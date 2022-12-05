package model;

public class User {

    private String name;
    private String password;
    private Person personDetails;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Person getPersonDetails() {
        return personDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonDetails(Person personDetails) {
        this.personDetails = personDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name  +
                '}';
    }
}