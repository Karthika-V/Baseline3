package com.tw.baseline3;

import java.util.Scanner;

//UserInput takes input from User
public class UserInput {

    Scanner in = new Scanner(System.in);

    public String userInput() {
        String input = in.nextLine();
        return input;
    }

}
