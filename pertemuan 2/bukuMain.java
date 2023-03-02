import java.util.*;
public class bukuMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char confirm = 'y';
        boolean menu = true;
        buku buku1 = new buku();
        buku buku2 = new buku();
        buku buku3 = new buku();

        buku1.nama = "BUMI MANUSIA";
        buku1.pengarang = "Pramoedya Ananta Toer";
        buku1.penerbit = "Lentera Dipantara, Jakarta Timur";
        buku1.hargaSatuan = 250000;
        buku1.jumlah = 100;
        
        int hargaTotal = buku1.hitungHargaTotal();
        int hargaDiskon = buku1.hitungDiskon();
        int hitungPembayaran = buku1.hitungHargaBayar();

        System.out.println("=========================================================");
        buku1.tampilBuku();
        System.out.println("Harga total     : "+hargaTotal+"\t\t\t\t|");
        System.out.println("Diskon          : "+hargaDiskon+"\t\t\t\t\t|");
        System.out.println("Pembayaran      : "+hitungPembayaran+"\t\t\t\t|");
        System.out.println("=========================================================");
    }
}
