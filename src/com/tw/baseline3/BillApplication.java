package com.tw.baseline3;

import java.util.Scanner;

//Bill Application starts the Application and takes input from the user.
public class BillApplication {

    public static void main(String[] args) {
        BillApplication billApplication = new BillApplication();
        billApplication.start();
    }

    public void start() {
        userInput();
        ItemParser itemParser = new ItemParser();
        itemParser.parser(userInput());
    }

    public String userInput() {
        String input = "1 book at 12.49";
        return input;
    }




}
