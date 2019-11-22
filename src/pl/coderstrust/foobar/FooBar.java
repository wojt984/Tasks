package pl.coderstrust.foobar;

public class FooBar {
    public static void printNumbers() {
        for (int i = 0; i <= 100; i++) {
            String result = String.valueOf(i);
            if (i % 3 == 0) {
                result += "Foo";
            }
            if (i % 5 == 0) {
                result += "Bar";
            }
            System.out.println(result);
        }
    }
}
