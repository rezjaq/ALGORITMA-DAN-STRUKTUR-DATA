import java.util.*;

import javax.xml.transform.Source;
class mainSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("program menghitung keuntungan total (satuan juta. misal 5.9)");
        System.out.println("masukan jumlah bulan : ");
        int elm = input.nextInt();
        sum sm = new sum (elm);
        System.out.println("====================");
        for(int i=0; i<sm.elemen; i++){
            System.out.print("masukan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[i] = input.nextDouble();
        }
        System.out.println("==================================");
        System.out.println("algoritma brute force ");
        System.out.println("total keuntungan perusahaan selama "+sm.elemen+" bulan adalah "+sm.totalBF(sm.keuntungan));
        System.out.println("algoritma devide conquer");
        System.out.println("total keuntungan perusahhan selama "+sm.elemen+" adalah "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
        
    }
}