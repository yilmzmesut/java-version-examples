package org.yilmzmesut.test.test.java15;

public record Car() implements Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("car vehicle");
    }
}
