package org.yilmzmesut.test.test.java17;

import org.junit.jupiter.api.Test;

public class Java17Test {

    @Test
    public void test() {
        System.out.println(checkObject(new Human("Mesut", 12, "Developer")));
        System.out.println(checkObject(new Circle()));
        System.out.println(checkObject(new Triangle()));
        System.out.println(checkObject(null));
        System.out.println("-".repeat(50));
        System.out.println(checkShape(new Triangle()));
        System.out.println(checkShape(new Circle()));
        System.out.println(checkShape(null));
    }

    record Human(String name, int age, String profession) {
    }

    interface Shape {
        int getNumberOfSides();
    }

    class Circle implements Shape {
        @Override
        public int getNumberOfSides() {
            return 3;
        }
    }

    class Triangle implements Shape {
        @Override
        public int getNumberOfSides() {
            return 3;
        }
    }

    public String checkObject(Object obj) {
        return switch (obj) {
            case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
            case Circle c -> "This is a circle";
            case Shape s -> "It is just a shape";
            case null -> "It is null";
            default -> "It is an object";
        };
    }

    public String checkShape(Shape shape) {
        return switch (shape) {
            case Triangle t && t.getNumberOfSides() != 3 -> "This is a weird triangle";
            case Circle c && c.getNumberOfSides() != 0 -> "This is a weird circle";
            case null -> "null shape";
            default -> "Just a normal shape";
        };
    }
}
