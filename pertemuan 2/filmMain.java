public class filmMain {
    public static void main(String[] args) {
        film film1 = new film();

        film1.judul = "Quantumania Mancing ";
        film1.genre = "Action Comedy";
        film1.rate = "Remeja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;

        film1.tambahTiket(1);
        film1.kurangTiket(3);
        film1.tampilFilm();

        int income = film1.totalRenevue();
        System.out.println("total keuntungan tiket : "+income);

        System.out.println("=============\n");

        film film2 = new film ("Quantumania Mancin","Horor","Dewasa",2000,40000);
        film2.tampilFilm();
        film film3 = new film ("antman Quantumania","Action","Dewasa",2000,40000);
        film2.tampilFilm();
    }
}
