package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillApplicationTest {

    @Test
    public void shouldHaveAStartToLaunchItsApplication() {
        BillApplication billApplication = new BillApplication();

        assertEquals("Bill",billApplication.start());

    }

}