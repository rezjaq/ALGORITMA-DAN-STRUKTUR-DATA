class mahasiswa{
    String nama;
    int thnMasuk, umur;
    double ipk;

    mahasiswa(String n, int t, int u, double i){
        this.nama = n;
        this.thnMasuk = t;
        this.umur = u;
        this.ipk = i;
    }

    void tampil(){
        System.out.println(" nama : "+nama);
        System.out.println(" Tahun Masuk : "+thnMasuk);
        System.out.println(" umur : "+umur);
        System.out.println(" IPK : "+ipk);
    }
}