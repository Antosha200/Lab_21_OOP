package by.Lab_21.Input;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(){
        int n = scanner.nextInt();
        return n;
    }
}
