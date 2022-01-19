package org.yilmzmesut.test.test.java10;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Java10Test {

    @Test
    public void test() {

        var integers = List.of(1, 2, 3, 4, 5, 6);
        integers.add(1);
        System.out.println(integers);

    }
}
