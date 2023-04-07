import java.util.*;
public class mainMaha {
    public static void main(String[] args) {
        daftarMhs list = new daftarMhs();
        mahasiswa m1 = new mahasiswa("nusa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa("rara", 2012, 19, 4);
        mahasiswa m3 = new mahasiswa("dompu", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("data mahasiswa setelah sorting desc bedasarkan ipk");
        list.bubleShort();
        list.tampil();

        System.out.println("data mahasiswa setelah soritng asc berdasarkan ipk");
        list.selectionShort();
        list.tampil();

        System.out.println("data mahasiswa setelah soritng asc berdasarkan ipk");
        list.insertionSortDescending();
        list.tampil();
    }
}
