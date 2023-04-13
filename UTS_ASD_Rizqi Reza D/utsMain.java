import java.util.*;;
public class utsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        uts asd = new uts();
        char[] huruf = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] angka = new int[huruf.length];
        int[] hasilNama = new int[huruf.length];

        System.out.println("Masukkan Nama Musisi Lengkap : ");
        String nama = sc.nextLine().toUpperCase();

        System.out.println("Konversi Nama dalam bentuk angka adalah : ");
        for (int i = 0; i < nama.length(); i++) {
            char hurufSekarang = nama.charAt(i);
            int angkaSekarang = Arrays.binarySearch(huruf, hurufSekarang) + 1;
            System.out.print(angkaSekarang + " ");
            hasilNama[i] = angkaSekarang;
        }
        System.out.println();

        System.out.println("Masukkan nim : ");
        int nim = sc.nextInt();

        int[] hasil = new int[hasilNama.length + 1];
        hasil[0] = nim;
        for (int i = 1; i < hasil.length; i++) {
            hasil[i] = hasilNama[i - 1];
        }

        System.out.println("DATA SEBELUM DIURUTKAN : ");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
        System.out.println();

        System.out.println("DATA SETELAH DIURUTKAN");
        asd.insertionSort(hasil);
        for (int i = 0; i < hasil.length; i++) { 
            System.out.print(hasil[i] + " ");
        }
        System.out.println();

        System.out.println("Masukkan angka yang ingin dicari : ");
        int cari = sc.nextInt();
        if (asd.sequentialSearch(hasil, cari) != -1) {
            System.out.println("Angka yang anda cari yaitu angka : " + cari + " ditemukan pada indeks ke-  " + asd.sequentialSearch(hasil, cari));
        } else {
            System.out.println("Data tidak ditemukan pada indeks manapun");
        }
    }
    
}
