package com.azeam.rps;

import java.util.Scanner;

public class UserInput {
    private String input = "";
    private Scanner sc = new Scanner(System.in);

    public void setInput() {
        input = sc.nextLine().toLowerCase().trim();
    }

    public String getInput() {
        return input;
    }

    public void closeScanner() {
        sc.close();
    }
}
