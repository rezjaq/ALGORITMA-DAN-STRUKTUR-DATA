import java.util.*;

class MainSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("program menghitung keuntungan total beberapa perusahaan (satuan juta. misal 5.9)");
        System.out.print("masukan jumlah perusahaan : ");
        int perusahaan = input.nextInt();
        System.out.print("masukan jumlah bulan : ");
        int bulan = input.nextInt();
        sum sm = new sum(perusahaan, bulan);
        System.out.println("====================");
        for(int i=0; i<sm.elemen; i++){
            System.out.println("Untung perusahaan ke-" + (i+1));
            for(int j=0; j<bulan; j++) {
                System.out.print("masukan untung bulan ke-"+(j+1)+" = ");
                sm.keuntungan[i][j] = input.nextDouble();
            }
        }
        System.out.println("==================================");
        System.out.println("algoritma brute force ");
        System.out.println("total keuntungan perusahaan selama "+bulan+" bulan adalah "+sm.totalBF(sm.keuntungan));
        System.out.println("algoritma devide conquer");
        System.out.println("total keuntungan perusahhan selama "+bulan+" adalah "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1, bulan));
    }
}