import java.util.*;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan jumlah mahasiswa : ");
        int mhs = input.nextInt();
        kampus[] kmp = new kampus [mhs];
        for(int i=0; i<mhs; i++){
            kmp[i] = new kampus(null, null, null, null);
            System.out.println("Mahasiswa ke- "+i);
            System.out.print("masukkan nama : ");
            kmp[i].nama = input.next();
            System.out.print("masukkan nim : ");
            kmp[i].nim = input.next();
            System.out.print("masukkan jenis kelamain : ");
            kmp[i].kelamin = input.next();
            System.out.print("masukkan ipk : ");
            kmp[i].ipk = input.next();
            System.out.println("Data Mahasiswa ke- "+i);
            System.out.println("Nama : "+kmp[i].nama);
            System.out.println("NIM : "+kmp[i].nim);
            System.out.println("Jenis Kelamin : "+kmp[i].kelamin);
            System.out.println("IPK : "+kmp[i].ipk);
        }

    }
}
