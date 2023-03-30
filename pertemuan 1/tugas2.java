<<<<<<< HEAD
import java.util.*;
public class tugas2 {
    static void kecepatan(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jarak (s): ");// s adalah jarak
        double s = input.nextDouble();
        System.out.print("masukkan waktu (t): ");// t adalah waktu
        double t = input.nextDouble();
        double v = s/t; // v adalah kecepatan
        System.out.println("hasil kecepatan adalah : "+v+" m/s");
    }

    static void jarak(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan kecepatan (v): ");// v adalah kecepatan
        double v = input.nextDouble();
        System.out.print("masukkan waktu (t): ");// t adalah waktu
        double t = input.nextDouble();
        double s = v*t; // s adalah jarak
        System.out.println("hasil jarak adalah : "+v+" m");
    }

    static void waktu(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jarak (s): ");// s adalah jarak
        double s = input.nextDouble();
        System.out.print("masukkan waktu (v): ");// v adalah kecepatan
        double v = input.nextDouble();
        double t = s/v; // t adalah waktu
        System.out.println("hasil kecepatan adalah : "+v);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char konfirmasi = 'y';
        boolean menu = true;
        while (menu) {
            System.out.println("1. Menu untuk menghitung kecepatan");
            System.out.println("2. Menu untuk menghitung jarak");
            System.out.println("3. Menu untuk menghitung waktu");
            System.out.println("4. keluar");
            System.out.print("pilihan anda : ");
            int pilih = input.nextInt();
            if (pilih == 1) {
                kecepatan();
                System.out.println("apakah anda ingin kembali ke menu (y/t) : ");
                System.out.print("pilihan anda : ");
                konfirmasi = input.next().charAt(0);
            }
            else if(pilih == 2){
                jarak();
                System.out.println("apakah anda ingin kembali ke menu (y/t) : ");
                System.out.print("pilihan anda : ");
                konfirmasi = input.next().charAt(0);
            }
            else if(pilih == 3){
                waktu();
                System.out.println("apakah anda ingin kembali ke menu (y/t) : ");
                System.out.print("pilihan anda : ");
                konfirmasi = input.next().charAt(0);
            }
            else{
                menu = false;
                System.out.println("terimakasih sudah mencoba aplikasi ini");
            }
        }
    }
}
=======
import java.util.*;
public class tugas2 {
    static void kecepatan(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jarak (s): ");// s adalah jarak
        double s = input.nextDouble();
        System.out.print("masukkan waktu (t): ");// t adalah waktu
        double t = input.nextDouble();
        double v = s/t; // v adalah kecepatan
        System.out.println("hasil kecepatan adalah : "+v+" m/s");
    }

    static void jarak(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan kecepatan (v): ");// v adalah kecepatan
        double v = input.nextDouble();
        System.out.print("masukkan waktu (t): ");// t adalah waktu
        double t = input.nextDouble();
        double s = v*t; // s adalah jarak
        System.out.println("hasil jarak adalah : "+v+" m");
    }

    static void waktu(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jarak (s): ");// s adalah jarak
        double s = input.nextDouble();
        System.out.print("masukkan waktu (v): ");// v adalah kecepatan
        double v = input.nextDouble();
        double t = s/v; // t adalah waktu
        System.out.println("hasil kecepatan adalah : "+v);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char konfirmasi = 'y';
        boolean menu = true;
        while (menu) {
            System.out.println("1. Menu untuk menghitung kecepatan");
            System.out.println("2. Menu untuk menghitung jarak");
            System.out.println("3. Menu untuk menghitung waktu");
            System.out.println("4. keluar");
            System.out.print("pilihan anda : ");
            int pilih = input.nextInt();
            if (pilih == 1) {
                kecepatan();
                System.out.println("apakah anda ingin kembali ke menu (y/t) : ");
                System.out.print("pilihan anda : ");
                konfirmasi = input.next().charAt(0);
            }
            else if(pilih == 2){
                jarak();
                System.out.println("apakah anda ingin kembali ke menu (y/t) : ");
                System.out.print("pilihan anda : ");
                konfirmasi = input.next().charAt(0);
            }
            else if(pilih == 3){
                waktu();
                System.out.println("apakah anda ingin kembali ke menu (y/t) : ");
                System.out.print("pilihan anda : ");
                konfirmasi = input.next().charAt(0);
            }
            else{
                menu = false;
                System.out.println("terimakasih sudah mencoba aplikasi ini");
            }
        }
    }
}
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
