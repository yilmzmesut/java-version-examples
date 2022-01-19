package org.yilmzmesut.test.test.java9;

public interface PrivateInterfaceTrial {

    default void callInterface() {
        System.out.println(asString());
    }

    private String asString() {
        return "interface private method called!!!";
    }
}
