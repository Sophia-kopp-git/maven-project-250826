package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void simpleTest_2plus2_is4(){
        assertEquals(2+2, 4);
    }
    @Test
    void simpleTest_2plus3_is4(){
        assertEquals(2+3, 5);
    }
    @Test
    void fakeTest_2plus3_is4(){
        assertEquals(2+3, 5);

    }
    @Test
    void fakeTestOnDifferentBranch_2plus3_is4(){
        assertEquals(5, 2+3);
    }
}