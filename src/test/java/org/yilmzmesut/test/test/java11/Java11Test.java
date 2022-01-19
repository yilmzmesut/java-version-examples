package org.yilmzmesut.test.test.java11;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class Java11Test {

    @Test
    public void test() {
        Optional<String> stringOptional = Optional.ofNullable(null);

        // isEmpty == !isPresent
        System.out.println(stringOptional.isEmpty()); // optional içindeki value null kontrolü
        System.out.println(stringOptional.isPresent()); // optional içindeki value not null kontrolü

        String trial = " Lorem Ipsum ";
        String lineTrial = " Lorem Ipsum \nCadillac Escalade";

        // new string features
        System.out.println("isBlank: " + trial.isBlank());
        System.out.println("lines: " + lineTrial.lines().map(String::toLowerCase).reduce("",(first, second) -> first + "&" + second));
        System.out.println("repeat: " + trial.repeat(2));
        System.out.println("length: " + trial.length());
        System.out.println("stripLeading:" + trial.stripLeading() + ":");
        System.out.println("stripTrailing:" + trial.stripTrailing() + ":");
        System.out.println("strip:" + trial.strip() + ":");
    }
}
