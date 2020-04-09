package lesson3;

import java.util.*;

public class PhoneBookClass {

    Map<String, Set<String>> phoneBook = new TreeMap<>();

    // с помощью метода add() можно добавлять записи
    public void add(String name, String phoneNumber) {
        Set<String> phones = getPhones(name);
        phones.add(phoneNumber);
    }

    public Set<String> getPhones(String name) {
        Set<String> phones = phoneBook.getOrDefault(name, new HashSet<>());
        if (phones.isEmpty()) {
            phoneBook.put(name, phones);
        }
        return phones;
    }

    public Map<String, Set<String>> getPhoneBook() {
        System.out.printf("В телефонную книгу добавлен : %n");
        return phoneBook;
    }

    // с помощью метода get() искать номер телефона по фамилии

    public void get(String name) {
        for (Map.Entry<String, Set<String>> phoneNum : phoneBook.entrySet()) {
            if (phoneNum.getKey().equals(name)) {
                System.out.println(name + ": " + phoneNum.getValue());
                return;
            }
        }
        System.out.println("Телефон для " + name + " не найден!");
    }
}