package com.azeam.rps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class UserInputTest {

    @Test
    void set_user_input_success() {
        String newInput = "test";
        InputStream in = new ByteArrayInputStream(newInput.getBytes());
        System.setIn(in);

        UserInput userInput = new UserInput();
        userInput.setInput();
        String input = userInput.getInput();

        assertEquals("test", input);
    }

    @AfterEach
    public void rollbackChangesToStdin() {
        System.setIn(System.in);
    }
}