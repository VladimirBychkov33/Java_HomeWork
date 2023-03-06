// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package HomeWork_1;

import java.util.Scanner;

/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner enter = new Scanner(System.in, "Cp866"); // "Cp866" - для русских букв
        Integer number = enter.nextInt();
        enter.close();
        int sum = 0;
        int multi = 1;
        while (number > 0) {
            sum += number;
            multi *= number;
            number --;
        }
        System.out.println(sum);
        System.out.println(multi);
    }
}