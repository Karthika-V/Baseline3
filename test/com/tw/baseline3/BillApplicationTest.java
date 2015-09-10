package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillApplicationTest {

    @Test
    public void shouldTakeInputFromTheUser() {
        BillApplication billApplication = new BillApplication();

        assertEquals("1 book at 12.49", billApplication.userInput());

    }

    @Test
    public void shouldHaveInputParserToParseInputDataAndGetTokensArrayOfLengthGreaterThanZero() {
        BillApplication billApplication = new BillApplication();

        assertEquals(true,billApplication.parser("1 book at 12.49").length>0);
    }

}