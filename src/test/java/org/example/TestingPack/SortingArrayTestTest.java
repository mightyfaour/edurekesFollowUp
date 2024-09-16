package org.example.TestingPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingArrayTestTest {
    @Test
    void testSortingArray() {
        try {
            SortingArrayTest test123 = new SortingArrayTest();
            int[] unSorted =null; // {4,1,2};
            int sortedArray[] = test123.sortingArray(unSorted);
        for(int Elem : sortedArray) {
            System.out.println(Elem);
        }
        fail();
        }
        catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("Null pointer exception generated");
        }

    }

}