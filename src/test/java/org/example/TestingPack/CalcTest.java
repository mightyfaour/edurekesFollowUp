package org.example.TestingPack;

import static org.junit.jupiter.api.Assertions.*;
class CalcTest {

    @org.junit.jupiter.api.Test
//    void divide() {
//    }
    public void test(){
        Calc c1 = new Calc();
        int actual = c1.divide(10, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }
}