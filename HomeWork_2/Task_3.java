package HomeWork_2;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Task_3 {
    public static void main(String[] args) throws IOException{
        Logger ll = Logger.getLogger(Task_3.class.getName()); // getLogger подчеркивается красным почему-то
        String logsPath = "log.txt";
        FileHandler fh = new FileHandler(logsPath, true);
        ll.addHandler(fh);                                   // addHandler подчеркивается тоже красным 
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        // Как дальше применить логер к калькулятору не понял. 
        // Просьба показать на семинаре хотя бы кратко, как это сделать
        

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


// Одно из решений

// public class Task3 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.print("Enter integer first number: ");
//         int num_1 = iScanner.nextInt();
//         System.out.print("Enter one of the following arithmetic characters +, -, / or * : ");
//         char sign = iScanner.next().charAt(0);
//         System.out.print("Enter integer second number: ");
//         int num_2 = iScanner.nextInt();
//         int result = 0;
//         switch (sign) {
//             case '+':
//                 result = num_1 + num_2;
//                 break;
//             case '-':
//                 result = num_1 - num_2;
//                 break;
//             case '*':
//                 result = num_1 * num_2;
//                 break;
//             case '/':
//                 result = num_1 / num_2;
//                 break;
//         }
//         System.out.printf("%s %s %s = %s", num_1, sign, num_2, result);
//         iScanner.close();

//         StringBuilder strB = new StringBuilder();
//         strB.append(num_1).append(sign).append(num_2).append("=").append(result).append("\n");

//         try {
//             FileWriter fw = new FileWriter("log_file_calc.txt", true);
//             fw.write(strB.toString());
//             fw.close();
//         } catch (Exception e) {
//             System.out.println("Что-то пошло не так");
//         }
//     } 
// }