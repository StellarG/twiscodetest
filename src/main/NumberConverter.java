package main;

public class NumberConverter {

    public int toDecimal(String binary) {
        int decimal = 0;
        int n = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, n);
            }
            n++;
        }
        return decimal;
    }

    public int toBinary(int decimal) {
        int binary = 0;
        int n = 0;

        while (decimal > 0) {
            binary += (decimal % 2) * Math.pow(10, n);
            decimal /= 2;
            n++;
        }
        return binary;
    }
}
