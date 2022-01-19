package org.yilmzmesut.test.test.java15;

import org.junit.jupiter.api.Test;

public class Java15Test {

    // SEALED CLASS OR INTERFACE
    //  A class or an interface can now define which classes can implement or extend it.
    //  It is a useful feature for domain modeling and increasing the security of libraries.
    @Test
    public void test() {
        Vehicle v = new Car();
        if (v instanceof Car c) {
            c.printVehicle();
        } else if (v instanceof Bus b) {
            b.printVehicle();
        }
    }
}
