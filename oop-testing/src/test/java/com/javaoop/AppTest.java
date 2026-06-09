package com.javaoop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void sampleTest() {
        assertTrue(true);
    }

    @Test
    void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 1 / 0;
        });
    }

    @Test
    void testNull() {
        String str = null;
        assertTrue(str == null);
    }

}
