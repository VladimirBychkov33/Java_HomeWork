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

        String sourse = "test.txt";
        String[] gradeTable;
        StringBuilder sb = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(sourse))) {
			String line;
            while ((line = reader.readLine()) != null) {
                gradeTable = line.replace("\"", "").split(":|,");
				sb.append("Студент ").append(gradeTable[1]).append(" получил ").append(gradeTable[3]).append(" по предмету ").append(gradeTable[5]).append(".\n");
			}
            System.out.println(sb);
		}
                catch (Exception e) {
			e.printStackTrace();
		}
    }
}
