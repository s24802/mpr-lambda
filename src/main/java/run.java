import model.*;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args){
        User user1 = new User();
        user1.setName("janpawel2");
        User user = new User();
        user.setName("John");
        user.setPassword("1234");
        Person person = new Person();
        person.setName("John");
        person.setSurname("Smith");
        person.setAge(30);
        person.setRole(new Role());
        person.getRole().setName("Admin");
        person.getRole().setPermissions(new ArrayList<>());
        person.getRole().getPermissions().add(new Permission());
        person.getRole().getPermissions().get(0).setName("Read");
        person.getRole().getPermissions().add(new Permission());
        person.getRole().getPermissions().get(1).setName("Write");
        person.setAddresses(new ArrayList<>());
        person.getAddresses().add(new Address());
        person.getAddresses().get(0).setCity("London");
        person.getAddresses().get(0).setStreet("Baker Street");
        person.getAddresses().get(0).setNumber(221);
        person.setPhoneNumbers(new ArrayList<>());
        person.getPhoneNumbers().add("123456789");
        person.getPhoneNumbers().add("987654321");
        user.setPersonDetails(person);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        UserService.findUserWithLongestUsername(users);
        System.out.println(UserService.findUserWithLongestUsername(users));
    }
}
