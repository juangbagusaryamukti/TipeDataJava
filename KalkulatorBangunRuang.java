import java.util.Scanner;
public class KalkulatorBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jarijari, tinggi, volume, luaspermukaan, panjang, lebar, luasalas, luassisitegak;

        // Bangun Ruang Tabung

        System.out.println("--------| Bangun Ruang Tabung |--------");

        System.out.print("Masukkan Jari-Jari: ");
        jarijari = input.nextDouble();
        System.out.print("Masukkan Tinggi: ");
        tinggi = input.nextDouble();

        volume = Math.PI * jarijari * jarijari * tinggi;
        luaspermukaan = 2 * Math.PI * jarijari * (jarijari + tinggi);

        System.out.println("Jadi, Volume dan Luas Bangun Ruang Tabung sebagai berikut :");
        System.out.println("Volume = " + volume + " Cm3" );
        System.out.println("Luas Permukaan = " + luaspermukaan + " Cm2" );

        System.out.println("_______________________________________");

        // Bangun Ruang Balok

        System.out.println("--------| Bangun Ruang Balok |--------");

        System.out.print("Masukkan Panjang Balok: ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Balok: ");
        lebar = input.nextDouble();
        System.out.print("Masukkan Tinggi Balok: ");
        tinggi = input.nextDouble();

        volume = panjang * lebar * tinggi;
        luaspermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar *tinggi);

        System.out.println("Jadi, Volume dan Luas Bangun Ruang Balok sebagai berikut :");
        System.out.println("Volume = " + volume + " Cm3" );
        System.out.println("Luas Permukaan = " + luaspermukaan + " Cm2" );

        System.out.println("______________________________________");

        // Bangun Ruang Limas Segitiga

        System.out.println("--------| Bangun Ruang Limas Segitiga |--------");

        System.out.print("Masukkan Luas Alas: ");
        luasalas = input.nextDouble();
        System.out.print("Masukkan Tinggi Limas: ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan Luas Sisi Tegak: ");
        luassisitegak = input.nextDouble();

        volume = 1/3 * luasalas * tinggi;
        luaspermukaan = luasalas + ( 3 * luassisitegak);

        System.out.println("Jadi, Volume dan Luas Bangun Ruang Limas Segitiga sebagai berikut :");
        System.out.println("Volume = " + volume + " Cm3" );
        System.out.println("Luas Permukaan = " + luaspermukaan + " Cm2" );

        System.out.println("______________________________________");
        
    }
}