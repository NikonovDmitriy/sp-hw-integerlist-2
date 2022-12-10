package com.example.sphwintegerlist2;

import com.example.sphwintegerlist2.exceptions.IndexIsNotValidException;
import com.example.sphwintegerlist2.exceptions.ItemIsNullException;
import com.example.sphwintegerlist2.integerlist.IntegerList;
import com.example.sphwintegerlist2.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerListImplSetTest {

    private IntegerList out;

    @BeforeEach
    void setUp() {
        out = new IntegerListImpl();

        out.add(1);
        out.add(2);
        out.add(3);
    }

    @Test
    public void shouldReturnNewAddedItem() {
        Integer actual = 5;
        Integer expected = out.set(1, actual);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowIndexIsNotValidExceptionWhenCallSetWithInvalidIndex() {
        assertThrows(IndexIsNotValidException.class,
                () -> out.set(4, 10));
    }

    @Test
    public void shouldThrowItemIsNullExceptionWhenCallSetWithNullItem() {
        assertThrows(ItemIsNullException.class,
                () -> out.set(1, null));
    }

}
