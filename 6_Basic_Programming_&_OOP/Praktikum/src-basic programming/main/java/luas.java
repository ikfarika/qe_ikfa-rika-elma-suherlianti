import java.util.Scanner;
public class luas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Luas Segitiga: L=1/2*a*t");
        System.out.print("Alas: ");
        int alas = input.nextInt();
        System.out.print("Tinggi: ");
        int tinggi = input.nextInt();
        double luasSegitiga = 0.5*(alas*tinggi);
        System.out.println("Luas Segitiga: " + luasSegitiga);

        System.out.println("Menghitung Luas Persegi Panjang: L=p*l");
        System.out.print("Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Lebar: ");
        int lebar = input.nextInt();
        double luasPersegiPanjang = panjang*lebar;
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);

        System.out.println("Menghitung Luas Lingkaran: L=phi*r*r");
        System.out.print("Jari-jari: ");
        int jari = input.nextInt();
        double luasLingkaran = 3.14*(jari*jari);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
    }
}
