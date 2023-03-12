
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package HomeWork_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static ArrayList<Integer> AnyList(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Random ran = new Random();                              // Метод который делает произвольный список
        for (int i = 0; i < 10; i++){
            int x = ran.nextInt(20);
            ar.add(x);
        }
        System.out.println(ar.toString());
        return ar;  
    }
    
    public static void DelEven(ArrayList<Integer> array) {
        for (int i = array.size()-1; i >= 0; i--) {
            if (array.get(i) % 2 == 0){                         // Метод который удаляет из списка четные числа
                array.remove(i);
            }
        }  
        System.out.println(array.toString());                   
    } 

    public static void main(String[] args) {
        ArrayList<Integer> ar = AnyList(args);                  // Вызов методов
        DelEven(ar);
    }

}
