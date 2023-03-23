// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package HomeWork_5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("Иванов", "Иван");
        people.put("Петрова", "Светлана");
        people.put("Белова", "Кристина");
        people.put("Мусина", "Анна");
        people.put("Крутова", "Анна");
        people.put("Юрин", "Иван");
        people.put("Лыков", "Петр");
        people.put("Чернов", "Павел");
        people.put("Чернышов", "Петр");
        people.put("Федорова", "Мария");
        people.put("Светлова", "Марина");
        people.put("Савина", "Мария");
        people.put("Рыкова", "Мария");
        people.put("Лугова", "Марина");
        people.put("Владимирова", "Анна");
        people.put("Мечников", "Иван");
        people.put("Петин", "Петр");
        people.put("Ежов", "Иван");
        Map<String, Integer> repeat = new HashMap<>();
        for (Map.Entry<String, String> el : people.entrySet()) {
            if (!repeat.containsKey(el.getValue())) {
                repeat.put(el.getValue(), 1);
            } else {
                repeat.replace(el.getValue(), repeat.get(el.getValue()) + 1);
            }
        }
        repeat.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
