package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int a_int = Integer.parseInt(a, 2);
        int b_int = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a_int + b_int);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int a_int = Integer.parseInt(a, 2);
        int b_int = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a_int * b_int);
    }
}