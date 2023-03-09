package HomeWork_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task_1 {
    public static void main(String args[]) {
        int[] massiv = { 30, 6, 4, 25, 15, 1 };
        File file = new File("sort.txt");
        try{
            FileWriter fwr = new FileWriter(file);
            for (int i = 0; i < massiv.length; i++) {
                for (int j = 0; j < massiv.length - i - 1; j++) {
                    if (massiv[j + 1] < massiv[j]) {
                        int swap = massiv[j];
                        massiv[j] = massiv[j + 1];
                        massiv[j + 1] = swap;
                    }
                }
            fwr.write(Arrays.toString(massiv));
            fwr.write("\n");  
            }
            fwr.close();
            
        }
        catch(IOException e) {
            System.out.println("Error");
        }
    }
}  
