package com.tw.baseline3;

import java.util.ArrayList;

//Shopping Basket collects Items from Parser
public class ShoppingBasket {

    ArrayList<String> shoppingBasket = new ArrayList<String>();

    public ArrayList shoppedItems(ItemParser itemParser) {
        String[] items = itemParser.parser();
        shoppingBasket.add(items.toString());
        return shoppingBasket;
    }
}
