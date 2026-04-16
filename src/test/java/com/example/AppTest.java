package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testEven() {
        assertEquals("Even", App.checkNumber(4));
    }

    @Test
    void testOdd() {
        assertEquals("Odd", App.checkNumber(5));
    }
}
