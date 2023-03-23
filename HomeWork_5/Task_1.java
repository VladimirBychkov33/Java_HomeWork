// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего

package HomeWork_5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter '1' to add number\nEnter'2' to output all\nEnter '0' to exit");
        String str = scn.nextLine();
        while (!str.equals("0")) {
            if (str.equals("1")) {
                System.out.println("Enter lastname: ");
                String name = scn.nextLine();
                System.out.println("Enter phone number: ");
                String numb = scn.nextLine();
                phoneList(phoneBook, name, numb);
            }
            if (str.equals("2")) {
                printPhoneList(phoneBook);
            }
            System.out.println("Enter '1' to add number\nEnter '2' to output all\nEnter '0' to exit");
            str = scn.nextLine();
        }
        scn.close();
    }

    public static Map<String, String> phoneList(Map<String, String> phoneBook, String name, String numb) {
        if (phoneBook.containsKey(name)) {
            String saveNumber = phoneBook.get(name) + ", " + numb;
            phoneBook.put(name, saveNumber);
        }
        else phoneBook.putIfAbsent(name, numb);
        return phoneBook;  
    }

    public static void printPhoneList(Map<String, String> phoneBook){
        System.out.println("List contacts: ");
        for (Map.Entry<String, String> el : phoneBook.entrySet()) {
            System.out.printf("%s: %s\n", el.getKey(), el.getValue());
        }
    }
}
