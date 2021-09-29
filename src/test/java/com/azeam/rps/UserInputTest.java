package com.azeam.rps;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class UserInputTest {

    @Test
    void test_set_user_input_success() {

        String newInput = "test";

        InputStream in = new ByteArrayInputStream(newInput.getBytes());
        System.setIn(in);

        // UserInput.setInput();

        // String input = UserInput.getInput();

        // assertEquals("test", input);

    }

}