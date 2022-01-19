package org.yilmzmesut.test.test.java9;

import org.junit.jupiter.api.Test;

public class Java9Test {

    @Test
    public void privateInterfaceMethodTest() {
        Implementation implementation = new Implementation();
        // private method impl called
        implementation.callInterface();
    }

    class Implementation implements PrivateInterfaceTrial {

    }
}
