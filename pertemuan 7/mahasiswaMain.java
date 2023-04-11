import java.util.*;
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        pencarianmhs data = new pencarianmhs();
        int jumMhs = 5;

        System.out.println("------------------------------");
        System.out.println("Masukkan data mahasiswa secara terurut dari nim terkecil");

        for(int i=0; i<jumMhs; i++){
            System.out.println("---------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.next();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("Ipk\t : ");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, umur, nama, ipk);
            data.tambah(m);

            System.out.println("------------------------------");
            System.out.println("Data Keseluruhan Mahasiswa");
            data.tampil();

            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
            System.out.print("NIM : ");
            int cari = s.nextInt();
            System.out.println("Sequential Search");
            int posisi = data.findSeqSearch(cari);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
            System.out.println("------------------------------");
            System.out.println("Binary Search");
            posisi = data.findBinarySearch(cari, 0, jumMhs-1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
        }
    }
}
