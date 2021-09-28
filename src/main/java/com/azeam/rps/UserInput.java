package com.azeam.rps;

import java.util.Scanner;

public class UserInput {

    private static String input = "";

    public static void setInput() {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine().toLowerCase();
        sc.close();
    }

    public static String getInput() {
        return input;
    }
}
