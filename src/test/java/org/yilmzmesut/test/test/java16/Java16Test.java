package org.yilmzmesut.test.test.java16;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class Java16Test {

    @Test
    public void test() {
        var integers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                .toList();
        System.out.println(integers);
    }
}
