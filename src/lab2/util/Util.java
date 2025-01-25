package lab2.util;

import lab2.User;


import java.util.ArrayList;
import java.util.List;


public class Util {
    public static List<User> getUserList() {
        List<User> usersList = new ArrayList<>();

        usersList.add(User.builder()
                .id(1)
                .country("Russia")
                .age(22)
                .firstName("Fedor")
                .lastName("Davydkin")
                .build());

        usersList.add(User.builder()
                .id(2)
                .country("Russia")
                .age(15)
                .firstName("Artem")
                .lastName("Lobeev")
                .build());

        usersList.add(User.builder()
                .id(3)
                .country("USA")
                .age(34)
                .firstName("Matvey")
                .lastName("Vishnevsky")
                .build());

        usersList.add(User.builder()
                .id(4)
                .country("Japan")
                .age(55)
                .firstName("Dmitry")
                .lastName("Shvedchicov")
                .build());

        usersList.add(User.builder()
                .id(5)
                .country("China")
                .age(20)
                .firstName("Piter")
                .lastName("Parker")
                .build());

        return usersList;
    }

    public static List<User> getUserListWithYoungAge() {
        List<User> usersList = getUserList();
        usersList.add(User.builder()
                .id(6)
                .country("China")
                .age(6)
                .firstName("Piter")
                .lastName("Parker")
                .build());

        return usersList;
    }
}
