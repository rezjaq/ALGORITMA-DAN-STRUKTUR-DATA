import java.util.*;
public class PemilihanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak kandidat siswa: ");
        int banyakKandidat = input.nextInt();

        PemilihanKetuaOsis[] siswa = new PemilihanKetuaOsis[banyakKandidat];

        for (int i = 0; i < siswa.length; i++) {
            input.nextLine(); // membersihkan buffer setelah input sebelumnya
            System.out.println("Kandidat ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String namaKandidat = input.nextLine();
            System.out.print("Masukkan jumlah suara: ");
            int jumlahSuara = input.nextInt();
            System.out.println("------------------------------");
            siswa[i] = new PemilihanKetuaOsis(namaKandidat, jumlahSuara);
        }

        System.out.println(PemilihanKetuaOsis.hitungPemilihanSuara(siswa));
    }
}

