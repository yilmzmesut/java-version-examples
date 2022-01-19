package org.yilmzmesut.test.test.java15;

public record Bus() implements Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("bus vehicle");
    }
}
