package pl.sda.gdajava25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int linie = 0;
        try {
            Scanner scanner = new Scanner(new FileReader("data.txt"));
            while (scanner.hasNextLine()){
                linie++;
                String linia = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Ilość lini "+linie);
    }
}