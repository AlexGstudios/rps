package com.azeam.rps;

import java.util.Scanner;

public class UserInput {

    private String input = "Empty";

    public void setInput() {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine().toLowerCase();
        sc.close();
    }

    public String getInput() {
        return input;
    }
}
