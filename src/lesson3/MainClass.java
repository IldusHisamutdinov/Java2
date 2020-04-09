package lesson3;


public class MainClass {
    public static void main(String[] args) {

        PhoneBookClass phoneBook = new PhoneBookClass();
        phoneBook.add("Васильев", "66-09");
        phoneBook.add("Костяков", "60-59");
        phoneBook.add("Васильев", "46-22");
        phoneBook.add("Торсуев", "626-409");
        phoneBook.add("Торсуев", "345-676");
        phoneBook.add("Торсуев", "765-321");
        phoneBook.add("Аланин", "64-29");

        System.out.println(phoneBook.getPhoneBook()); // полный список
        System.out.println("----");
        phoneBook.get("Торсуев"); // найти номер Торсуева
        phoneBook.get("Василякин"); // найти номер Василякина

    }
}
