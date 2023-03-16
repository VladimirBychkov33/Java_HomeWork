
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package HomeWork_4;

import java.util.LinkedList;

public class Task_1 {
    public static LinkedList<String> getLinLis(String[] args) {
        LinkedList<String> listLink = new LinkedList<>();
        listLink.add("Mike");
        listLink.add("Victor");
        listLink.add("Dary");
        listLink.add("Bob");
        listLink.add("Jake");
        return listLink;
    }
    public static LinkedList<String> reversLinLis(LinkedList<String> list) {
        LinkedList<String> tempList = new LinkedList<>();
        while (! list.isEmpty()) {
            tempList.add(list.getLast());
            list.removeLast();
            // System.out.println(tempList);
        }
        return tempList;
    }
    public static void main(String[] args) {
        LinkedList<String> result = getLinLis(args);
        System.out.println(result);
        System.out.println(reversLinLis(result)); 
    }
}
