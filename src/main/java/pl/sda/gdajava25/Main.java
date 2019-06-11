package pl.sda.gdajava25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        zapisywanieDoPliku();
        wypisanieIlościLini();
    }

    public static void zapisywanieDoPliku() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true));
            printWriter.println("Hello World!");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void wypisanieIlościLini() {
        int linie = 0;
        try {
            Scanner scanner = new Scanner(new FileReader("data.txt"));
            while (scanner.hasNextLine()) {
                linie++;
                String linia = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Ilość lini " + linie);
    }
}