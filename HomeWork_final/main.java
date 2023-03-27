// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package HomeWork_final;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<NoteBook> set = new HashSet<NoteBook>();
        
        NoteBook notebook_1 = new NoteBook(4, "512 Gb", "windows", "black");
        NoteBook notebook_2 = new NoteBook(8, "1 Tb", "windows", "white");
        NoteBook notebook_3 = new NoteBook(16, "512 Gb", "linux", "black");
        NoteBook notebook_4 = new NoteBook(32, "1 Tb", "windows", "white");
        NoteBook notebook_5 = new NoteBook(4, "512 Gb", "linux", "black");
        NoteBook notebook_6 = new NoteBook(32, "1 Tb", "windows", "white");
        NoteBook notebook_7 = new NoteBook(4, "512 Gb", "windows", "black");
        NoteBook notebook_8 = new NoteBook(32, "1 Tb", "linux", "white");


        set.add(notebook_1);
        set.add(notebook_2);
        set.add(notebook_3);
        set.add(notebook_4);
        set.add(notebook_5);
        set.add(notebook_6);
        set.add(notebook_7);
        set.add(notebook_8);

        sorted(set);

    }

    static void seeSet(Set<NoteBook> notes) {
        int i = 1;
        for (NoteBook note : notes) {
            System.out.printf("Вариант ноутбука %d:\n", i);
            System.out.println(note);
            i++;
        }
    }

    public static void sorted(Set<NoteBook> notes) {
        Set<NoteBook> sort_notes = new HashSet<>();

        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Введите цифру:\n\t1 - Оперативная память\n\t2 - Объём жёсткого диска\n\t3 - Операционная система\n\t4 - Цвет");
        Character ch = scn1.next().charAt(0);

        switch (ch) {
            case '1':
                System.out.println("Укажите размер оперативной памяти: ");
                Integer num_1 = scn2.nextInt();
                for (NoteBook note : notes) {
                    if (note.containsVol_Ram(num_1)) sort_notes.add(note);          
                }
                break;
            case '2':
                System.out.println("\nУкажите объём жёсткого диска: ");
                String num_2 = scn2.nextLine();
                for (NoteBook note : notes) {
                    if (note.containsVol_Hdd(num_2)) sort_notes.add(note);          
                }
                break;
            case '3':
                System.out.println("Введите название операционной системы: ");
                String num_3 = scn2.nextLine();
                for (NoteBook note : notes) {
                    if (note.containsOper_Sys(num_3)) sort_notes.add(note);          
                }
                break;
            case '6':
                System.out.println("\nВведите название цвета: ");
                String num_4 = scn2.nextLine();
                for (NoteBook note : notes) {
                    if (note.containsColor(num_4)) sort_notes.add(note);          
                }
                break;
            default:
                break;
        }
        scn1.close();
        scn2.close();

        if (!sort_notes.isEmpty()) {
            System.out.println("\nВарианты по выбранному параметру:\n");
            seeSet(sort_notes);
        }
        else {
            System.out.println("\nНет ноубуков или нет такого критерия:\n");
            seeSet(notes);
        }
    }
}
