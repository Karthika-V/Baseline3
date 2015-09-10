package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillApplicationTest {

    @Test
    public void shouldTakeInputFromTheUser() {
        UserInput userInput = new UserInput();

        assertEquals("1 book at 12.49", userInput.userInput());

    }

    @Test
    public void shouldHaveInputParserToParseInputDataAndGetTokensArrayOfLengthGreaterThanZero() {
        ItemParser itemParser = new ItemParser();

        assertEquals(true,itemParser.parser("1 book at 12.49").length>0);
    }

}