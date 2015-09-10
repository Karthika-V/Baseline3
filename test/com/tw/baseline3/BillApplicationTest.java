package com.tw.baseline3;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BillApplicationTest {

    @Test
    public void shouldTakeInputFromTheUser() {
        UserInput userInput = new UserInput();

        assertEquals("1 book at 12.49", userInput.userInput());

    }

    @Test
    public void shouldHaveInputParserToParseInputDataAndGetTokensArrayOfLengthGreaterThanZero() {
        UserInput userInput = new UserInput();
        ItemParser itemParser = new ItemParser(userInput);

        assertEquals(true, itemParser.parser().length > 0);
    }

    @Test
    public void shouldHaveAShoppingBasketToCollectTheItemDetailsFromItemParser() {
        BillApplication billApplication = new BillApplication();

        String[] items = new String[]{"book", "12.49", "1"};
        ArrayList<String> shoppingBasket = billApplication.addToShoppingBasket(items);

        assertEquals(true, !shoppingBasket.isEmpty());
    }
}