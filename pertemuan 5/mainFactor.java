import java.util.*;
class mainFactor{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.print("Masukkan jumlah elemen yang diinginkan : ");
        int elemen = input.nextInt();
        factorial[]fk = new factorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new factorial();
            System.out.print("masukkan data nilai ke-"+(i+1)+" :");
            fk[i].nilai = input.nextInt();
        }
        System.out.println("==============================");
        System.out.println("hasil perhitungan factorial menggunakan brute force");
        for(int i=0; i<elemen; i++){
            long end = System.currentTimeMillis();
            System.out.println("factorial dari nilai "+fk[i].nilai+" adalah "+fk[i].factorialBF(fk[i].nilai)+" waktu eksekusi : "+(end-start));
        }
        System.out.println("==============================");
        System.out.println("hasil perhitungan factorial menggunakan devide conquer");
        for(int i=0; i<elemen; i++){
            long end = System.currentTimeMillis();
            System.out.println("factorial dari nilai "+fk[i].nilai+" adalah "+fk[i].factorDC(fk[i].nilai)+" waktu eksekusi : "+(end-start));
        }
    }
}