package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("100", "110")); // 4(100) + 6(110) = 10(1010)
        System.out.println(binOps.mult("11", "11")); // 3(11) * 3(11) = 9(1001)
    }
}