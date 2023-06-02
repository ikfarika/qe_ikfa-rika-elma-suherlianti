package org.example;

public class Product {
    private String nama;
    private String deskripsi;
    private Integer harga;
    private Integer jumlahStok;

    private String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    private Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    private Integer getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(Integer jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public void getInfo() {
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("nama: "+getNama());
        System.out.println("deskripsi: "+getDeskripsi());
        System.out.println("harga: "+getHarga());
        System.out.println("jumlah stok: "+getJumlahStok());
        System.out.println("===");
    }
}
