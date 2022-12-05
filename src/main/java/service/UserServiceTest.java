package service;

import model.Address;
import model.Person;
import model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void findUsersWhoHaveMoreThanOneAddress() {
        //given
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        Person person1 = new Person();
        Person person2 = new Person();
        Person Person3 = new Person();
        person1.setName("Jan");
        person2.setName("Pawel");
        Person3.setName("Kamil");
        person1.setAddresses(new ArrayList<>());
        person2.setAddresses(new ArrayList<>());
        Person3.setAddresses(new ArrayList<>());
        person1.getAddresses().add(new Address());
        person1.getAddresses().get(0).setCity("London");
        person1.getAddresses().get(0).setStreet("Baker Street");
        person1.getAddresses().get(0).setNumber(221);
        person1.getAddresses().add(new Address());
        person1.getAddresses().get(1).setCity("Brooklynn");
        person1.getAddresses().get(1).setStreet("Ghetto Street");
        person1.getAddresses().get(1).setNumber(666);
        person2.getAddresses().add(new Address());
        person2.getAddresses().get(0).setCity("London");
        person2.getAddresses().get(0).setStreet("Baker Street");
        person2.getAddresses().get(0).setNumber(221);
        Person3.getAddresses().add(new Address());
        Person3.getAddresses().get(0).setCity("London");
        Person3.getAddresses().get(0).setStreet("Baker Street");
        Person3.getAddresses().get(0).setNumber(221);
        user1.setPersonDetails(person1);
        user2.setPersonDetails(person2);
        user3.setPersonDetails(Person3);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        //when
        List<User> result = UserService.findUsersWhoHaveMoreThanOneAddress(users);

        //then
        
    }

    @Test
    void findOldestPerson() {
    }

    @Test
    void findUserWithLongestUsername() {
    }

    @Test
    void getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18() {
    }

    @Test
    void getSortedPermissionsOfUsersWithNameStartingWithA() {
    }

    @Test
    void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS() {
    }

    @Test
    void groupUsersByRole() {
    }

    @Test
    void partitionUserByUnderAndOver18() {
    }
}