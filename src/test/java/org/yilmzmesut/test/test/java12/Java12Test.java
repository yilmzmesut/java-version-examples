package org.yilmzmesut.test.test.java12;

import org.junit.jupiter.api.Test;

import java.lang.invoke.MethodHandles;

public class Java12Test {

    @Test
    public void test() {
        // new switch case
        System.out.println(traditionalSwitchCase(2));
        System.out.println(java12SwitchCase(2));

        String trial = "Lorem Ipsum";

        // new string features
        System.out.println("indent: " + trial.indent(3));
        System.out.println("transform: " + trial.transform(s -> s + "transformed"));
        System.out.println("describeConstable: " + trial.describeConstable().get()); // return optional
        System.out.println("resolveConstantDesc: " + trial.resolveConstantDesc(MethodHandles.lookup())); // lookup param ignored return string
    }

    private String traditionalSwitchCase(int number) {
        String result = "";
        switch (number) {
            case 1:
            case 2:
                result = "one or two";
                break;
            case 3:
            case 4:
                result = "three or four";
                break;
            default:
                result = "unknown";
        }
        return result;
    }

    private String java12SwitchCase(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3, 4 -> "three or four";
            default -> "unknown";
        };
    }
}
