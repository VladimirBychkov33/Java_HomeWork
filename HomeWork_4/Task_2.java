// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HomeWork_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<String> listLink = new LinkedList<>();
        listLink.add("Mike");
        listLink.add("Victor");
        listLink.add("Dary");
        listLink.add("Bob");
        listLink.add("Jake");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter '1' for function enqueue\nEnter '2' for function dequeue\nEnter '3' for function first");
        String str = scn.nextLine();
        switch (str) {
            case "1":
                System.out.println("Enter new element for listlink: ");
                String str2 = scn.nextLine();
                enqueue(listLink, str2);
                break;
            case "2":
                System.out.println(dequeue(listLink));
                System.out.println(listLink);
                break;
            case "3":
                System.out.println(first(listLink));
                System.out.println(listLink);
            default:
                break;
        }
        scn.close();
    }

    public static void enqueue(LinkedList<String> list, String el) {
        list.addLast(el);
        System.out.println(list);
    }

    public static String dequeue(LinkedList<String> list) {
        String temp = "";
        temp = list.get(0);
        list.remove(0);
        return temp;
    }

    public static String first(LinkedList<String> list) {
        String temp = "";
        temp = list.get(0);
        return temp;
    }
}
