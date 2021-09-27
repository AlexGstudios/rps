package com.azeam.rps;

import java.util.Scanner;

public class UserInput {

    public String input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toString();
        return input;
    }
}
