package com.azeam.rps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class UserInputTest {

    @Test
    void test_get_user_input() {

        UserInput userInput = new UserInput();

        String input = userInput.getInput();

        assertEquals("Empty", input);
    }

    @Test
    void test_set_user_input() {
        UserInput userInput = new UserInput();

        String newInput = "test";

        InputStream in = new ByteArrayInputStream(newInput.getBytes());
        System.setIn(in);

        userInput.setInput();

        String input = userInput.getInput();

        assertEquals("test", input);

    }

}