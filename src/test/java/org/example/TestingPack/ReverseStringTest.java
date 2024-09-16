package org.example.TestingPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    void testReverseString_oneWord() {

        assertEquals("avaJ", reverseString.reverseString("Java"));
    }
    @Test
    void testReverseString_oneWord_WithSupplier() {

        assertEquals("avaJ", reverseString.reverseString("Java"),()-> "If failed, this message will be display");
    }

    @Test
    void TestReverseString_oneWorld_NotEquAls() {
        //Here, using assertNotEquals will only pass if the expected and the actual are not corresponding
        assertNotEquals("avaJaa", reverseString.reverseString("Java"));
    }
    @Test
    void TestReverseString_oneWorld_NotEquAls_Supplier() {
        //Here, using assertNotEquals will only pass if the EXPECTED and the ACTUAL are not corresponding
        assertNotEquals("avaJaa", reverseString.reverseString("Java"),()-> "If failed, this message will be display");
    }

    @Test
    void TestReverseString_multipleWorld() {

        reverseString.reverseString("Java");
        assertEquals("ysae si avaJ", reverseString.reverseString("Java is easy"));

    }
  
}