package org.example.bot;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class BotApplicationTests {
    private Main mainProcessor;
    @BeforeEach
    void setUp() {
        mainProcessor = new Main();
    }
    @Test
    void testEchoCommand() {
        String testInput = "тестовый текст";
        String userId = "testUser123";
        String result = mainProcessor.processUserInput(testInput, userId);
        String expected = "Вы ввели: " + testInput;
        assertEquals(expected, result);
    }
}

