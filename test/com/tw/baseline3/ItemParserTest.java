package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemParserTest {

    @Test
    public void shouldParseInputDataAndGetTokensArrayOfLengthGreaterThanZero() {
        ItemParser itemParser = new ItemParser();
        String userInput = "1 book at 12.49";


        assertEquals(true,itemParser.parser(userInput).length>0);
    }

}