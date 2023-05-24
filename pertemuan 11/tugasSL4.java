public class tugasSL4 {
    String nim, nama;
    int absen;
    double ipk;
    tugasSL4 next;

    public tugasSL4(String nim, String nama, int absen, double ipk, tugasSL4 berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk =ipk;
        this.next = berikutnya;
    }
}
