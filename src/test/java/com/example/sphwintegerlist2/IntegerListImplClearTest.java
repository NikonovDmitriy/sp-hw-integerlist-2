package com.example.sphwintegerlist2;

import com.example.sphwintegerlist2.integerlist.IntegerList;
import com.example.sphwintegerlist2.integerlist.impl.IntegerListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerListImplClearTest {

    @Test
    public void isEmptyShouldReturnTrueAfterClear() {
        IntegerList out = new IntegerListImpl();
        out.add(1);
        out.clear();
        assertTrue(out.isEmpty());
    }
}
