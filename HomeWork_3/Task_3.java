// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package HomeWork_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_3 {
    public static ArrayList<Integer> AnyList(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Random ran = new Random();                              // Метод который делает произвольный список
        for (int i = 0; i < 3; i++){
            int x = ran.nextInt(10);
            ar.add(x);
        }
        System.out.println(ar.toString());
        return ar;  
    }

    public static void MinMaxAverValue(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = 0;
        double sum = 0;
        double aver;
        for (int i = 0; i < array.size(); i++) {              // Метод который находит мин, макс и сред.арифмет.
            if (array.get(i) > max) {
                max = array.get(i);
            }
            if (array.get(i) < min) {
                min = array.get(i);
            }
            sum += array.get(i);   
        }
        aver = sum / array.size();
        System.out.println(max);
        System.out.println(min); 
        // System.out.println(sum);  
        System.out.println(aver);                  
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> ar = AnyList(args);
        MinMaxAverValue(ar);
    }
}
