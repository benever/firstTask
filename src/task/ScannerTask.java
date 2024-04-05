package task;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.printf("Привет, %s!",name);
    }
}
