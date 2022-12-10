package com.example.sphwintegerlist2;

import com.example.sphwintegerlist2.integerlist.IntegerList;
import com.example.sphwintegerlist2.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerListImplIndexOfTest {

    private IntegerList out;

    @BeforeEach
    void setUp() {
        out = new IntegerListImpl();

        out.add(3);
        out.add(2);
        out.add(1);
    }

    @Test
    public void shouldReturnIndexOfItem() {
        int actual = 1;
        int expected = out.indexOf(2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBadIndexIfItemNotExist() {
        assertTrue(out.indexOf(10) < 0);
    }
}
