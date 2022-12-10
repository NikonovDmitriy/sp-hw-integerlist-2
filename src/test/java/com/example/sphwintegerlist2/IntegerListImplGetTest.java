package com.example.sphwintegerlist2;

import com.example.sphwintegerlist2.exceptions.IndexIsNotValidException;
import com.example.sphwintegerlist2.integerlist.IntegerList;
import com.example.sphwintegerlist2.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerListImplGetTest {

    private IntegerList out;

    @BeforeEach
    void setUp() {
        out = new IntegerListImpl(3);
        out.add(1);
        out.add(2);
    }

    @Test
    public void shouldReturnItem() {
        Integer actual = 2;
        Integer expected = out.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowIndexIsNotValidException() {
        assertThrows(IndexIsNotValidException.class,
                () -> out.get(10));
    }
}
