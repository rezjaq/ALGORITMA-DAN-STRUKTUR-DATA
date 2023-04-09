import java.util.Arrays;
public class PemilihanKetuaOsis implements Comparable<PemilihanKetuaOsis> {

    public String namaKandidatSiswa;
    public int jumlahSuaraSiswa;

    PemilihanKetuaOsis(String namaKandidatSiswa, int jumlahSuaraSiswa) {
        this.namaKandidatSiswa = namaKandidatSiswa;
        this.jumlahSuaraSiswa = jumlahSuaraSiswa;
    }

    public int compareTo(PemilihanKetuaOsis o) {
        return o.jumlahSuaraSiswa - this.jumlahSuaraSiswa;
    }

    public static String hitungPemilihanSuara(PemilihanKetuaOsis[] siswa) {
        Arrays.sort(siswa);
        int maxElement = -1;
        PemilihanKetuaOsis temp = siswa[0];
        int element = 0;
        int banyakSiswa = siswa.length;
        for (int i = 1; i < banyakSiswa; i++) {
            if (temp.namaKandidatSiswa.equals(siswa[i].namaKandidatSiswa)) {
                temp.jumlahSuaraSiswa += siswa[i].jumlahSuaraSiswa;
            } else {
                if (maxElement < temp.jumlahSuaraSiswa) {
                    maxElement = temp.jumlahSuaraSiswa;
                    element = i - 1;
                }
                temp = siswa[i];
            }
        }
        if (maxElement < temp.jumlahSuaraSiswa) {
            maxElement = temp.jumlahSuaraSiswa;
            element = banyakSiswa - 1;
        }
        int n = banyakSiswa;
        if (maxElement > (n / 2)) {
            return "Ketua terpilih adalah " + siswa[element].namaKandidatSiswa;
        } else {
            return "Tidak ada ketua terpilih";
        }
    }
}
    

