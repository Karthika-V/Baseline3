package com.tw.baseline3;

import java.util.ArrayList;

//Bill Application starts the Application and takes input from the user.
public class BillApplication {

    private ArrayList<String> shoppingBasket = new ArrayList<String>();

    public static void main(String[] args) {
        BillApplication billApplication = new BillApplication();
        billApplication.start();
    }

    public void start() {
        UserInput userInput = new UserInput();
        ItemParser itemParser = new ItemParser(userInput);
        String[] item = itemParser.parser();
        addToShoppingBasket(item);
    }

    public ArrayList addToShoppingBasket(String[] item) {
        shoppingBasket.add(item.toString());
        return shoppingBasket;
    }

}
