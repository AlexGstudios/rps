package com.azeam.rps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(output));
    }

    @Test
    void name() {
        // Given
        String oneOne = "1\n1";
        InputStream in = new ByteArrayInputStream(oneOne.getBytes());
        System.setIn(in);

        // When
        Game gameMode = new Game();
        gameMode.gameMode();

        // Then
        assertThat(output.toString().trim(), containsString("Select game type:"));
    }

    /*
     * @Test void name2() { Game game = GameFactory.createSinglePlayerGame("Arne");
     * 
     * }
     * 
     * @Test void name3() { Game game = GameFactory.createSinglePlayerGame("Arne");
     * game.makeMove("Sten") }
     * 
     * @Test void name4() { // Select game mode // Select weapon // Present winner
     * CommandInterpreter textinterpreter = new CommandInterpreter(); String answer
     * = textinterpreter.interpret("1"); }
     */
}