package com.example.sphwintegerlist2;

import com.example.sphwintegerlist2.integerlist.IntegerList;
import com.example.sphwintegerlist2.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerListImplSizeTest {

    @Test
    public void shouldReturnItemsCount() {
        IntegerList out = new IntegerListImpl();
        out.add(1);
        out.add(2);
        out.add(3);

        int actual = 3;
        int expected = out.size();
        assertEquals(expected, actual);
    }
}
