import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int ani = 4;
        int budi = 15;
        int bina = 6;
        int cita = 11;
        System.out.println("jumlah pakaian ani : "+ani);
        System.out.println("jumlah pakaian budi : "+budi);
        System.out.println("jumlah pakaian bina : "+bina);
        System.out.println("jumlah pakaian cita : "+cita);
        int hargaKg = 4500;
        double diskon = 0.05;
        double hasil = 0;
        hasil = (ani*hargaKg)+(budi*hargaKg*(1-diskon))+(bina*hargaKg)+(cita*hargaKg*(1-diskon));
        System.out.println("Total hasil pendapatan pada hari ini adalah : "+hasil);
    }
}
