package org.yilmzmesut.test.test.java13;

import org.junit.jupiter.api.Test;

public class Java13Test {

    @Test
    public void test() {
        String traditionalTextBlock = "<html>\n"
                + "\n"
                + "    <body>\n"
                + "        <span>example text</span>\n"
                + "    </body>\n"
                + "</html>";
        String textBlock = """
                <html>

                    <body>
                        <span>example text</span>
                    </body>
                </html>""";
        // new string features
        System.out.println(traditionalTextBlock);
        System.out.println("-".repeat(50));
        System.out.println(textBlock);

        // switch case
        System.out.println(traditionalSwitchCase(2));
        System.out.println(java12SwitchCase(2));
        System.out.println(java13SwitchCase(2));
        System.out.println(java13JustYieldSwitchCase(2));
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

    private String java13SwitchCase(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3, 4 -> {
                System.out.println(number);
                yield "three or four";
            }
            default -> "unknown";
        };
    }

    private String java13JustYieldSwitchCase(int number) {
        return switch (number) {
            case 1, 2:
                yield "one or two";
            case 3, 4:
                System.out.println(number);
                yield "three or four";
            default:
                yield "unknown";
        };
    }
}
