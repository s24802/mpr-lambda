package model;

import java.util.List;

public class Person {
    private String name;
    private String surname;
    private List<String> phoneNumbers;
    private List<Address> addresses;
    private Role role;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Role getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
