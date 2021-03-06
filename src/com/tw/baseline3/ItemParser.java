package com.tw.baseline3;

//Item Parser parses input data and convert it to Item details
public class ItemParser {

    private String input;

    public ItemParser(UserInput input)
    {
        this.input = input.userInput();
    }

    public String[] parser() {
        String[] tokens = this.input.split(" ");
        String itemQty = tokens[0];
        String itemName = tokens[1];
        String itemPrice = tokens[3];
        String[] item =new String[]{itemName,itemPrice,itemQty};
        return item;
    }
}
