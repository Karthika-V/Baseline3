package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemParserTest {

    @Test
    public void shouldParseInputDataAndGetTokensArrayOfLengthGreaterThanZero() {
        ItemParser itemParser = new ItemParser();

        assertEquals(true,itemParser.parser("1 book at 12.49").length>0);
    }

}