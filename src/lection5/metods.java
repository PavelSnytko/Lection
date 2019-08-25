package lection5;

import java.math.BigDecimal;
import java.math.BigInteger;

public class metods {
    private static int num1=1;
    private static int num2=6;
    private static String name = "Класс имеет два аргумента: ";

    public metods(int num1, int num2, String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;

    }

    public static void main(String[] args) {
        System.out.println(operation(2,3));
        System.out.println(operation (4.6, 2.3));
        System.out.println(operation (BigInteger.valueOf(123456789), BigInteger.valueOf(100000000)));
        System.out.println(operation(BigDecimal.valueOf(1234.56789), BigDecimal.valueOf(234.56789)));
        System.out.println (name + num1 + " и " + num2);
    }

    static int operation (int x, int y) {
        return x+y;
    }

    static double operation (double x, double y) {
        return x/y;
    }

    static BigInteger operation (BigInteger x, BigInteger y) {
        return x=x.multiply(y);
    }

    static BigDecimal operation (BigDecimal x, BigDecimal y) {
        return x=x.subtract(y);
    }
}

