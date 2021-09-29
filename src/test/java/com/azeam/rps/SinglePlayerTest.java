package com.azeam.rps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinglePlayerTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(output));
        String one = "1";
        InputStream in = new ByteArrayInputStream(one.getBytes());
        System.setIn(in);
        new SinglePlayer();
    }

    @Test
    public void start_single_player_game() {
        assertThat(output.toString().trim(), containsString("Select weapon"));
    }

    @Test
    public void select_user_weapon() {
        assertThat(output.toString().trim(), containsString("User selected: ROCK"));
    }
}
