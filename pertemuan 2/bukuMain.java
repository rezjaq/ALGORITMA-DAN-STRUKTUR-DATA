import java.util.*;
public class bukuMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        buku buku1 = new buku();

        buku1.nama = "BUMI MANUSIA";
        buku1.pengarang = "Pramoedya Ananta Toer";
        buku1.penerbit = "Lentera Dipantara, Jakarta Timur";
        buku1.hargaSatuan = 250000;
        buku1.jumlah = 100;
        
        int hargaTotal = buku1.hitungHargaTotal();
        int hargaDiskon = buku1.hitungDiskon();
        int hitungPembayaran = buku1.hitungHargaBayar();
        buku1.tampilBuku();

    }
}
