package com.example.sphwintegerlist2;

import com.example.sphwintegerlist2.integerlist.IntegerList;
import com.example.sphwintegerlist2.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerListImplContainsTest {

    private IntegerList out;

    @BeforeEach
    public void setUp() {
        out = new IntegerListImpl();
        out.add(1);
    }


    @Test
    public void shouldReturnTrueWhenItemContains() {
        assertTrue(out.contains(1));
    }

    @Test
    public void shouldReturnFalseThenItemNotContains() {
        assertFalse(out.contains(10));
    }
}