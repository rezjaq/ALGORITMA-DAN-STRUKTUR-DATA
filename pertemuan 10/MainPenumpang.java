import java.util.*;
public class MainPenumpang {
    public static void menu(){
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian belakang");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        queuePenumpang antri = new queuePenumpang(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Kota Asal : ");
                    String asal = input.nextLine();
                    System.out.print("Kota Tujuan : ");
                    String tujuan = input.nextLine();
                    System.out.print("Jumlah Tiket : ");
                    int tiket = sc.nextInt();
                    System.out.print("Harga : ");
                    int harga = sc.nextInt();
                    penumpang p = new penumpang(nama, tujuan, asal, tiket, harga);
                    sc.nextLine();
                    antri.enqueue(p);
                    break;
                case 2:
                    penumpang data = antri.denqueue();
                    if (!"".equals(data.nama)&& !"".equals(data.kotaAsal)&&data.jumlahTiket != 0 && data.harga != 0) {
                        System.out.println("Antrian yang keluar : "+data.nama +" "+data.kotaAsal+" "+data.kotaTujuan+" "+data.jumlahTiket+" "+data.harga);
                        break;                        
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih  == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
