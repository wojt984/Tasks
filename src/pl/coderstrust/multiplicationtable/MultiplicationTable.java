package pl.coderstrust.multiplicationtable;

import static java.lang.String.*;

class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(12);
    }
    static void printMultiplicationTable(int size) {
        StringBuilder table = new StringBuilder();
        table.append(format("%4s", ""));
        for (int j = 1; j <= size; j++) {
            table.append(format("%4d", j));
        }
        table.append("\n");
        for (int i = 1; i <= size; i++) {
            table.append(format("%4d",i));
            for (int k = 1; k <= size; k++) {
               table.append(format("%4d", i*k));
            }
            table.append("\n");
        }
        System.out.println(table);
    }

    private static int calculateColumnWidth(int size) {
        int colLength = 1;
        int maxValue = (size * size);
        while (maxValue >= 10) {
            colLength++;
            maxValue /= 10;
        }
        return colLength;
    }

    private static String buildLine( String str) {
        return format("%4s", str);
    }
}
