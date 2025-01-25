package lab2;

import lab2.util.Util;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------");

        lastNameSort(Util.getUserList());
        System.out.println("---------");

        ageSort(Util.getUserList());
        System.out.println("---------");

        ageCheck(Util.getUserList());
        System.out.println("---------");

        ageCheck(Util.getUserListWithYoungAge());
        System.out.println("---------");

        averageAge(Util.getUserList());
        System.out.println("---------");

        allCountryList(Util.getUserList());

    }

    // - сортировка по lastName
    public static void lastNameSort(List<User> userslist) {
        System.out.println("Список пользователей отсортированных по возрасту = " +
                userslist.stream()
                        .sorted(Comparator.comparing(User::getLastName))
                        .toList());
    }

    // - сортировка по age
    public static void ageSort(List<User> usersList) {
        System.out.println("Список пользователей отсортированных по возрасту = " +
                usersList.stream()
                        .sorted(Comparator.comparing(User::getAge))
                        .toList());
    }

    // - проверка, что для всех пользователей age > 7
    public static void ageCheck(List<User> usersList) {
        if (usersList.stream().allMatch(user -> user.getAge() > 7)) {
            System.out.println("У всех пользователей возраст больше 7");
        } else {
            System.out.println("Есть пользователь с возрастом меньше 7");
        }

    }

    // - средний возраст пользователей
    public static void averageAge(List<User> usersList) {
        System.out.println("Средний возраст пользователей = " +
                usersList.stream()
                        .collect(Collectors.averagingDouble(User::getAge)));
    }

    // - список различных стран проживания пользователей
    public static void allCountryList(List<User> usersList) {
        System.out.println("Список всех стран = " +
                usersList.stream()
                        .map(User::getCountry)
                        .collect(Collectors.toSet()));

    }
}
