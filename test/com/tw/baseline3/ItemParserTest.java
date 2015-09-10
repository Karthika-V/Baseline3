package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemParserTest {

    @Test
    public void shouldParseInputDataAndGetTokensArrayOfLengthGreaterThanZero() {
        UserInput userInput = new UserInput();
        ItemParser itemParser = new ItemParser(userInput);

        assertEquals(true,itemParser.parser().length>0);
    }

}