// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package HomeWork_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print("Введите первое число: "); 
        double number1 = in.nextDouble();
        System.out.print("Введите знак(+ - / *): ");
        String sign = in.next();
        System.out.print("Введите второе число: ");
        double number2 = in.nextDouble();
        in.close();
        switch (sign) {
            case "+":
                double sum = number1 + number2;
                System.out.println(sum);
                break;
            case "-":
                double sub = number1 - number2;
                System.out.println(sub);
                break;
            case "/":
                double div = number1 / number2;
                System.out.println(div);
                break;
            case "*":
                double mult = number1 * number2;
                System.out.println(mult);
                break;
            default:
                break;
        }
    }
}
