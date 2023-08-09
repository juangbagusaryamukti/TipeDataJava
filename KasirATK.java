import java.util.Scanner;

public class KasirATK {
    public static void main(String[] args) {
        
        double bukuTulis, pensil, penghapus, penggaris;
        bukuTulis=2500;
        pensil=1000;
        penghapus=1500;
        penggaris=1000;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan Jumlah Beli Buku Tulis");
            double jumlahBuku= input.nextDouble();
            double total=jumlahBuku*bukuTulis;
            System.out.println("Masukkan Jumlah Beli Pensil: ");
            double jumlahPensil=input.nextDouble();
            total+=jumlahPensil*pensil;
            System.out.println("Masukan Jumlah Beli Penghapus:");
            double jumlahPenghapus = input.nextDouble();
            total += jumlahPenghapus*penghapus;
            System.out.println("Masukan Jumlah Beli Penggaris:");
            double jumlahPenggaris = input.nextDouble();
            total += jumlahPenggaris*penggaris;

            System.out.println("Masukkan Pembayaran: ");
            double bayar=input.nextDouble();
            double diskon=0.05*total;
            double kembali=bayar-(total-diskon);
            System.out.println("Total Diskon: "+diskon);
            System.out.println("Total Kembalian: "+kembali);
        }
    }
}