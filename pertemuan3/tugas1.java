<<<<<<< HEAD
import java.util.*;
public class tugas1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            char konfirmasi = 'y';
            boolean menu = true;
            while (menu) {
                System.out.println("==== Program Menghitung Luas Permukaan dan Volume Bangun Ruang ====");
                System.out.println("Pilih jenis bangun ruang:");
                System.out.println("1. Kerucut");
                System.out.println("2. Limas Segi Empat Sama Sisi");
                System.out.println("3. Bola");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan: ");
                int pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.print("masukkan jumlah bangun ruang kerucut : ");
                    int n = input.nextInt();
                    kerucut [] kcr = new kerucut [n];
                    for(int i=0; i<n; i++){
                        kcr[i] = new kerucut(n, i);
                        System.out.println("kerucut ke-"+i);
                        System.out.print("masukkan jari jari : ");
                        kcr[i].jari = input.nextInt();
                        System.out.print("masukkan sisi miring : ");
                        kcr[i].sisiMiring = input.nextInt();
                        System.out.printf("Luas Permukaan Kerucut: %.1f", kcr[i].hitungLuasPermukaan());
                        System.out.printf("Volume Kerucut: %.1f ", kcr[i].hitungVolume());
                    }
                    System.out.print("Apakah anda ingin menghitung bagun ruang yang lain ? ");
                    konfirmasi = input.next().charAt(0);
                } 
                else if (pilihan == 2) {
                    System.out.print("masukkan jumlah bangun ruang limas segi empat : ");
                    int l = input.nextInt();
                    limas[] lms = new limas[l];
                    for(int i=0; i<l; i++){
                        lms[i] = new limas(l, i);
                        System.out.println("limas segi empat ke-"+i);
                        System.out.print("masukkan panjang sisi alas limas : ");
                        lms[i].panjangSisiAlasLimas = input.nextInt();
                        System.out.print("masukkan tinggi limas : ");
                        lms[i].tinggiLimas = input.nextInt();
                        System.out.printf("Luas Permukaan Limas : ",lms[i].hitungLuasPermukaan());
                        System.out.printf("Volume Limas : ",lms[i].hitungVolume());
                    }
                    System.out.print("Apakah anda ingin menghitung bagun ruang yang lain ? ");
                    konfirmasi = input.next().charAt(0);
                } 
                else if (pilihan == 3) {
                    System.out.print("masukkan jumlah bangun ruang lingkaran : ");
                    int L = input.nextInt();
                    lingkaran [] lkr = new lingkaran[L];
                    for(int i=0; i<L; i++){
                        lkr[i] = new lingkaran(i);
                        System.out.println("bola ke-"+i);
                        System.out.print("masukkan jari jari : ");
                        lkr[i].jari = input.nextInt();
                        System.out.printf("Luas permukaan bola : ",lkr[i].hitungLuasPermukaan());
                        System.out.printf("Volume bole : ",lkr[i].hitungVolume());
                    }
                    System.out.print("Apakah anda ingin menghitung bagun ruang yang lain ? ");
                    konfirmasi = input.next().charAt(0);
                } 
                else if(pilihan == 4){
                    menu = false;
                }
                else {
                    System.out.println("Pilihan tidak valid");
                }
            }
        }
    }
}
=======
import java.util.*;
public class tugas1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            char konfirmasi = 'y';
            boolean menu = true;
            while (menu) {
                System.out.println("==== Program Menghitung Luas Permukaan dan Volume Bangun Ruang ====");
                System.out.println("Pilih jenis bangun ruang:");
                System.out.println("1. Kerucut");
                System.out.println("2. Limas Segi Empat Sama Sisi");
                System.out.println("3. Bola");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan: ");
                int pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.print("masukkan jumlah bangun ruang kerucut : ");
                    int n = input.nextInt();
                    kerucut [] kcr = new kerucut [n];
                    for(int i=0; i<n; i++){
                        kcr[i] = new kerucut(n, i);
                        System.out.println("kerucut ke-"+i);
                        System.out.print("masukkan jari jari : ");
                        kcr[i].jari = input.nextInt();
                        System.out.print("masukkan sisi miring : ");
                        kcr[i].sisiMiring = input.nextInt();
                        System.out.printf("Luas Permukaan Kerucut: %.1f", kcr[i].hitungLuasPermukaan());
                        System.out.printf("Volume Kerucut: %.1f ", kcr[i].hitungVolume());
                    }
                    System.out.print("Apakah anda ingin menghitung bagun ruang yang lain ? ");
                    konfirmasi = input.next().charAt(0);
                } 
                else if (pilihan == 2) {
                    System.out.print("masukkan jumlah bangun ruang limas segi empat : ");
                    int l = input.nextInt();
                    limas[] lms = new limas[l];
                    for(int i=0; i<l; i++){
                        lms[i] = new limas(l, i);
                        System.out.println("limas segi empat ke-"+i);
                        System.out.print("masukkan panjang sisi alas limas : ");
                        lms[i].panjangSisiAlasLimas = input.nextInt();
                        System.out.print("masukkan tinggi limas : ");
                        lms[i].tinggiLimas = input.nextInt();
                        System.out.printf("Luas Permukaan Limas : ",lms[i].hitungLuasPermukaan());
                        System.out.printf("Volume Limas : ",lms[i].hitungVolume());
                    }
                    System.out.print("Apakah anda ingin menghitung bagun ruang yang lain ? ");
                    konfirmasi = input.next().charAt(0);
                } 
                else if (pilihan == 3) {
                    System.out.print("masukkan jumlah bangun ruang lingkaran : ");
                    int L = input.nextInt();
                    lingkaran [] lkr = new lingkaran[L];
                    for(int i=0; i<L; i++){
                        lkr[i] = new lingkaran(i);
                        System.out.println("bola ke-"+i);
                        System.out.print("masukkan jari jari : ");
                        lkr[i].jari = input.nextInt();
                        System.out.printf("Luas permukaan bola : ",lkr[i].hitungLuasPermukaan());
                        System.out.printf("Volume bole : ",lkr[i].hitungVolume());
                    }
                    System.out.print("Apakah anda ingin menghitung bagun ruang yang lain ? ");
                    konfirmasi = input.next().charAt(0);
                } 
                else if(pilihan == 4){
                    menu = false;
                }
                else {
                    System.out.println("Pilihan tidak valid");
                }
            }
        }
    }
}
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
