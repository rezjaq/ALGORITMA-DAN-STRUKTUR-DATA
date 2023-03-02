import java.util.Scanner;
public class fungsi {
    static String cabang [] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
    static String bunga [] = {"Aglonema","Keladi","Alocasia","Mawar"};
    static int stok [][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};

    static void tampil(){
        System.out.println("===================================================");
        System.out.printf("%-10s \t","");
        for (String b : bunga){
                System.out.printf("%-10s",b);
        }
        System.out.println();
        for(int i=0; i<cabang.length; i++){
            System.out.println("===================================================");
            System.out.printf("%-10s \t",cabang[i]);
            for(int j=0; j<bunga.length; j++){
                System.out.printf("%-10d",stok[j][i]);
            }
            System.out.println();
        }
        System.out.println("===================================================");
    }
    static void jumlahStok(){
        System.out.println();
        System.out.println("===================================================");
        for(int i=0; i<bunga.length; i++){
            System.out.println("===================================================");
            System.out.printf("%-10s \t",bunga[i]);
            for(int j=0; j<bunga.length; j++){
                System.out.printf("%-10d",stok[j][i]);
            }
            System.out.println();
        }
        System.out.println("===================================================");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilih;
        boolean menu = true;
        while (menu) {
            System.out.println("pilihan menu");
            System.out.println("1. tabel cabang dan stok bunga");
            System.out.println("2. jumlah stok bedasarkan jenis bunga");
            System.out.println("3. keluar");
            System.out.print("pilihan anda : ");
            pilih = input.next().charAt(0);
            if(pilih == '1'){
                tampil();
            }
            else if(pilih == '2'){
                jumlahStok();
            }
            else{
                menu = false;
            }
        }
    }
}
