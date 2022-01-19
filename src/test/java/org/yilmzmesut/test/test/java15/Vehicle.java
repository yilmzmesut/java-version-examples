package org.yilmzmesut.test.test.java15;

public sealed interface Vehicle permits Bus, Car, Truck {
    void printVehicle();
}
