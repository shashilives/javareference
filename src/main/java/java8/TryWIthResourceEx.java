package java8;

import java.io.*;
import java.util.Scanner;

public class TryWIthResourceEx {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("input.txt");
        PrintWriter pf = new PrintWriter(fileWriter);
        pf.print("yo threre");
        pf.print("hi ");
        pf.write("kidding");
        pf.close();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


        try (Scanner scanner1 = new Scanner(new File("input.txt"))) {
            while (scanner1.hasNext()) {
                System.out.println(scanner1.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
