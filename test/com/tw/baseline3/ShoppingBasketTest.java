package com.tw.baseline3;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShoppingBasketTest {
    @Test
    public void shouldCollectTheItemDetailsFromItemParser() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        UserInput userInput = new UserInput();
        ItemParser itemParser = new ItemParser(userInput);
        String[] items = itemParser.parser();
        shoppingBasket.shoppedItems(itemParser);

        assertEquals(true, !shoppingBasket.shoppingBasket.isEmpty());
    }

}