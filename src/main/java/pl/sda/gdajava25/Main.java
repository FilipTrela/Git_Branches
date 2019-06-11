package pl.sda.gdajava25;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true));
            printWriter.println("Hello World!");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
