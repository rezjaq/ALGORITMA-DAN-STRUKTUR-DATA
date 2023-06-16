import java.util.*;
public class Tugas1MainDLL {

    public static void menu(){
        System.out.println("Aplikasi Vaksinasi");
        System.out.println("Pengantrian Vaksinasi Polinema Malang");
        System.out.println(" 1. Tambah Data Penerima Vaksin\n 2. Hapus Data Pengantri Vaksin\n 3. Daftar Penerima Vaksin\n 4. Keluar");
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        tugas1DLL dll = new tugas1DLL();
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
    
            switch(pilih){
                case 1:
                    System.out.print("Nomor Antrian\t: ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima\t: ");
                    String nama = sc.nextLine();
                    dll.addLast(nomor, nama);
                break;
                
                case 2:
                    dll.removeFirst();
                    dll.print();
                break;
                
                case 3:
                    dll.print();
                break;
                
                case 4:
                    System.exit(0);
                break;
                
            } 
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
