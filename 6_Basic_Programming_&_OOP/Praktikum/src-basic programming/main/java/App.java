public class App {
    public static void main(String[] args) {

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian
        //sampel 1
        int hargaBeli1 = 15000;
        int hargaJual1 = 30000;

        if (hargaBeli1 < hargaJual1) {
            System.out.println("Untung, dengan keuntungan " + (hargaJual1-hargaBeli1));
        } else if (hargaBeli1 > hargaJual1) {
            System.out.println("Rugi, dengan kerugian " + (hargaJual1-hargaBeli1));
        } else {
            System.out.println("sama saja");
        }

        // sampel 2
        int hargaBeli2 = 12000;
        int hargaJual2 = 9000;

        if (hargaBeli2 < hargaJual2) {
            System.out.println("Untung, dengan keuntungan " + (hargaJual2-hargaBeli2));
        } else if (hargaBeli2 > hargaJual2) {
            System.out.println("Rugi, dengan kerugian " + (hargaJual2-hargaBeli2));
        } else {
            System.out.println("sama saja");
        }

        // sampel3
        int hargaBeli3 = 12000;
        int hargaJual3 = 12000;

        if (hargaBeli3 < hargaJual3) {
            System.out.println("Untung, dengan keuntungan " + (hargaJual3-hargaBeli3));
        } else if (hargaBeli3 > hargaJual3) {
            System.out.println("Rugi, dengan kerugian " + (hargaJual3-hargaBeli3));
        } else {
            System.out.println("sama saja");
        }

        /**
        // segitiga
        float alas = 20;
        float tinggi = 25;

        // TODO: hitung luas segitiga
        double luasSegitiga = 0.5*(alas*tinggi);
        System.out.println("Luas Segitiga: " + luasSegitiga);

        // persegi panjang
        float panjang = 40;
        float lebar = 6;

        //TODO: hitung luas persegi panjang
        double luasPersegiPanjang = panjang*lebar;
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);

        // lingkaran
        double jari2 = 7;

        //TODO: hitung luas lingkaran
        double luasLingkaran = 3.14*(jari2*jari2);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        **/

    }
}
