package service;

import model.Role;
import model.User;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        return users.stream()
                .filter(user -> user.getPersonDetails().getAddresses().size() > 1)
                .collect(Collectors.toList());
    }

    public static User findOldestPerson(List<User> users) {
        return users.stream()
                .max(Comparator.comparing(user -> user.getPersonDetails().getAge()))
                .get();
    }

    public static User findUserWithLongestUsername(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(u -> u
                        .getName()
                        .length()))
                .get();
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {

        return users.stream()
                .filter(u -> u.getPersonDetails().getAge() > 18)
                .map(u -> u.getPersonDetails().getName() + " " + u.getPersonDetails().getSurname())
                .collect(Collectors.joining(", "));
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {

        return users.stream()
                .filter(u -> u.getName().startsWith("A"))
                .map(u -> u.getPersonDetails().getRole().getPermissions())
                .flatMap(List::stream)
                .map(p -> p.getName())
                .sorted()
                .collect(Collectors.toList());
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        System.out.println(users.stream()
                .filter(u -> u.getPersonDetails().getSurname().startsWith("S"))
                .flatMap(u -> u.getPersonDetails().getRole().getPermissions().stream())
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList()));
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(u->u.getPersonDetails().getRole()));
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(u -> u.getPersonDetails().getAge() > 18));
    }
}
