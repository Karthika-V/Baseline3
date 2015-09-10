package com.tw.baseline3;

import java.util.Scanner;

//Bill Application starts the Application and takes input from the user.
public class BillApplication {

    public static void main(String[] args) {
        BillApplication billApplication = new BillApplication();
        billApplication.start();
    }

    public void start() {
        UserInput userInput= new UserInput();
        ItemParser itemParser = new ItemParser();
        itemParser.parser(userInput.userInput());
    }

}
