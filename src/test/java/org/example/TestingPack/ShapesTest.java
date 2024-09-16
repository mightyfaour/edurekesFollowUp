package org.example.TestingPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    Shapes shape = new Shapes();

    @Test
    void testComputeSquareArea() {
        assertEquals(25, shape.computeSquareArea(5, 5));
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(153.86,shape.computeCircleArea(7), "Area of Circle calculation is wrong");
    }
}