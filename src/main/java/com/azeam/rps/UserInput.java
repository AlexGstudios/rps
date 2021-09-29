package com.azeam.rps;

import java.util.Scanner;

public class UserInput {
    private static String input = "";
    static Scanner sc = new Scanner(System.in);

    public static void setInput() {
        input = sc.nextLine().toLowerCase().trim();
    }

    public static String getInput() {
        return input;
    }

    public static void closeScanner() {
        sc.close();
    }
}
