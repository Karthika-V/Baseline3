package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserInputTest {

    @Test
    public void shouldTakeInputFromTheUser() {
        UserInput userInput = new UserInput();

        assertEquals("1 book at 12.49", userInput.userInput());

    }

}