import java.util.*;
public class mainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("Pilihan Menu Algoritma");
            System.out.println("1. Brute Force");
            System.out.println("2. Devide Conquer");
            System.out.println("3. Quit");
            System.out.print("your choise : ");
            int choise = input.nextInt();
            if(choise == 1){
                System.out.println("=============");
                System.out.print("masukkan jumlah elemen yang ingin dihitung : ");
                int elemen = input.nextInt();
                pangkat [] pg = new pangkat [elemen];
                for(int i=0; i<elemen; i++){
                    pg[i] = new pangkat(elemen, i);
                    System.out.print("masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" :");
                    pg[i].nilai = input.nextInt();
                    System.out.print("masukkan nilai pangkat ke-"+(i+1)+" :");
                    pg[i].pangkat = input.nextInt();
                }
                System.out.println("==============================");
                System.out.println("hasil pangkat menggunakan brute force");
                for(int i=0; i<elemen; i++){
                    System.out.println("nilai "+pg[i].nilai+" pangkat "+pg[i].pangkat+" adalah "+pg[i].pangkatBF(pg[i].nilai, pg[i].pangkat));
                }
            }
            else if(choise == 2){
                System.out.println("=============");
                System.out.print("masukkan jumlah elemen yang ingin dihitung : ");
                int elemen = input.nextInt();
                pangkat [] pg = new pangkat [elemen];
                for(int i=0; i<elemen; i++){
                    pg[i] = new pangkat(elemen, i);
                    System.out.print("masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" :");
                    pg[i].nilai = input.nextInt();
                    System.out.print("masukkan nilai pangkat ke-"+(i+1)+" :");
                    pg[i].pangkat = input.nextInt();
                }
                System.out.println("==============================");
                System.out.println("hasil pangkat menggunakan devide conquer");
                for(int i=0; i<elemen; i++){
                    System.out.println("nilai "+pg[i].nilai+" pangkat "+pg[i].pangkat+" adalah "+pg[i].pangkatBF(pg[i].nilai, pg[i].pangkat));
                }
            }
            else if(choise ==3){
                menu = false;
            }
            else{
                System.out.println("your choise can'' be detech");
            }
        }
    }
}
