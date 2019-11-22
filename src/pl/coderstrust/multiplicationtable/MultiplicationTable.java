package pl.coderstrust.multiplicationtable;

public class MultiplicationTable {
    public static void printMultiplicationTable(int size) {
        int colLength = 1;
        int maxValue = (size * size);
        while (maxValue >= 10) {
            colLength++;
            maxValue /= 10;
        }
        for (int i = 0; i <= size; i++) {
            String line = String.format("%1$"+colLength+ "s", "") + " ";
            if (i!=0) line =  String.format("%1$"+colLength+ "s", String.valueOf(i)) + " ";
            for (int j = 1; j <= size; j++) {
                if (i == 0) {
                    line += String.format("%1$"+colLength+ "s", String.valueOf(j)) + " ";
                } else {
                    line += String.format("%1$"+colLength + "s", String.valueOf(i*j)) + " ";
                }
            }
            System.out.println(line);
        }
    }
}
