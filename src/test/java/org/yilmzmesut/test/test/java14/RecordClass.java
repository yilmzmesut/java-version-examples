package org.yilmzmesut.test.test.java14;

// getter, setter, toString, equals, hashCode
public record RecordClass(int age, String name) {
    public RecordClass(String name) {
        this(1, name);
    }
    public RecordClass() {
        this(0, "default");
    }
}
