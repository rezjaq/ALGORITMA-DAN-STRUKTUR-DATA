import java.util.*;
public class stakMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        stak stk = new stak(5);
        char pilih;
        do{
            System.out.println("Jenis : ");
            String jenis = input.nextLine();
            System.out.println("Warna : ");
            String warna = input.nextLine();
            System.out.println("Merk : ");
            String merk = input.nextLine();
            System.out.println("Ukuran : ");
            String ukuran = input.nextLine();
            System.out.println("Harga : ");
            double harga = input.nextDouble();

            pakain p = new pakain(jenis, warna, merk, ukuran, harga);
            System.out.println("apakah anda akan menambahkan data baru e stak (y/n) ? ");
            System.out.println("pilihan anda : ");
            pilih = input.next().charAt(0);
            input.nextLine();
            stk.push(p);
        }while(pilih == 'y');
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}
