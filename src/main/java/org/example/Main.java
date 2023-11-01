package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(add(10, 10));
        System.out.println(isEven(9));
        System.out.println(multply(9, 10));

    }

    //ADDITION
    public static int add(int x, int y) {
        return x + y;
    }

    //GERADE ZAHL TEST
    public static boolean isEven(int x) {
        int rest = x % 2;
        return rest == 0;
    }

    //MULTIPLY
    public static int multply(int x, int y) {
        return x * y;
    }

    //IS POSITIVE
    public static boolean isPositive(int x) {
        return x > 0;
    }
}