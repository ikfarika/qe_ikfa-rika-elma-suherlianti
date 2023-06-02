package org.example;

public class Calculator {

    //fungsi penjumlahan
    public Integer add(Integer x, Integer y) {
        Integer hasil = x+y;
        return hasil;
    }

    //fungsi pengurangan
    public Integer substract(Integer x, Integer y) {
        Integer hasil = x-y;
        return hasil;
    }

    //fungsi perkalian
    public Integer multiply(Integer x, Integer y) {
        Integer hasil = x*y;
        return hasil;
    }

    //fungsi pembagian
    public Integer divide(Integer x, Integer y) {
        Integer hasil = x/y;
        return hasil;
    }
}
