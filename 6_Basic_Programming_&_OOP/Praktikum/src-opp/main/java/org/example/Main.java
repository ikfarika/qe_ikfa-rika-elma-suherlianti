package org.example;

import org.example.Calculator;

public class Main {
    public static void main(String[] args) {

        //CALCULATOR
        Calculator calc = new Calculator();

        System.out.println("penjumlahan: " + calc.add( 3, 4));
        System.out.println("pengurangan: " + calc.substract( 15, 4));
        System.out.println("perkalian: " + calc.multiply( 10, 10));
        System.out.println("pembagian: " + calc.divide( 12, 3));

        /**
        Product product = new Product();
        product.setNama("coffee");
        product.setDeskripsi("this is coffee");
        product.setHarga(15000);
        product.setJumlahStok(10);
        product.getInfo();

//        System.out.println("===");
//        System.out.println("INFO PRODUK");
//        System.out.println(product.getNama());
//        System.out.println(product.getDeskripsi());
//        System.out.println(product.getHarga());
//        System.out.println(product.getJumlahStok());
//        System.out.println("===");

        product.setNama("milk");
        product.setDeskripsi("this is fresh milk");
        product.setHarga(25000);
        product.setJumlahStok(10);
        product.getInfo();

//        System.out.println("===");
//        System.out.println("INFO PRODUK");
//        System.out.println(product.getNama());
//        System.out.println(product.getDeskripsi());
//        System.out.println(product.getHarga());
//        System.out.println(product.getJumlahStok());
//        System.out.println("===");

        product.setNama("apple juice");
        product.setDeskripsi("this is juice");
        product.setHarga(18000);
        product.setJumlahStok(20);
        product.getInfo();

//        System.out.println("===");
//       System.out.println("INFO PRODUK");
//        System.out.println(product.getNama());
//        System.out.println(product.getDeskripsi());
//        System.out.println(product.getHarga());
//        System.out.println(product.getJumlahStok());
//        System.out.println("===");
         **/
    }
}