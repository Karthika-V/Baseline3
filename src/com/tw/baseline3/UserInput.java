package com.tw.baseline3;

import java.util.Scanner;

//UserInput takes input from User
public class UserInput {

    Scanner in = new Scanner(System.in);

    public String userInput() {
        String inputUser = in.nextLine();
        String input = "1 book at 12.49";
        return input;
    }

}
