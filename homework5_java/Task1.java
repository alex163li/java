// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class Task1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Иванов");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Газманов", List.of("+7(999)123-45-67", "+7(495)345-54-21"));
        phoneBook.put("Иванов", List.of("+7(963)678-99-00", "+7(499)111-22-33"));
        phoneBook.put("Лялин", List.of("+7(927)232-43-21", "+7(812)754-85-75"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}