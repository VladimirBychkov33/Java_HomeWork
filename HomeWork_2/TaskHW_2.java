// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package HomeWork_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TaskHW_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader file = new BufferedReader(new FileReader("test.txt"));
        String temp;
        while ((temp = file.readLine()) != null) {
            String line1 = temp.replace('"', ' ');
            StringBuilder result = new StringBuilder("");
            String [] arrayData = line1.split(",");
            String [] listName = {"Студент ", " получил ", " по предмету "};
            for (int i =0; i < arrayData.length; i++) {
                String[] arrData = arrayData[i].split(":");
                result.append(listName[i]);
                result.append(arrData[1]);
                }
            System.out.println(result);
        }
    }
}
