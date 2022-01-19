package org.yilmzmesut.test.test.java14;

import org.junit.jupiter.api.Test;

public class Java14Test {

    @Test
    public void test() {

        // Pattern Matching for instanceof
        A a = new B();
        if (a instanceof B number) {
            number.test();
        }

        // Records
        RecordClass allargs = new RecordClass(2, "Mesut");
        RecordClass noargs = new RecordClass();
        RecordClass withName = new RecordClass("Mesut");
        System.out.println("allargs: " + allargs);
        System.out.println("noargs: " + noargs);
        System.out.println("withName: " + withName);

        // Helpful NPE
        Long l = null;
        System.out.println(l.toString());
    }

    class A {
    }

    class B extends A {
        public void test() {
            System.out.println("tested");
        }
    }
}
