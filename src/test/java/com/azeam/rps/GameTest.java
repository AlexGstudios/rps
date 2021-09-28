package com.azeam.rps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    void name() {
        Game gameMode = new Game();

        String one = "one";

        InputStream in = new ByteArrayInputStream(one.getBytes());
        System.setIn(in);

        UserInput.setInput();

        assertTrue(gameMode.gameMode());
    }
}