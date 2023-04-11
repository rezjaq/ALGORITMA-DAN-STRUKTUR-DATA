class mahasiswa{
    int nim, umur;
    String nama;
    double ipk;

    mahasiswa(int ni, int um, String na, double ip){
        this.nama = na;
        this.nim = ni;
        this.umur = um;
        this.ipk = ip;
    }

    void tampil(){
        System.out.println("NIM : "+nim);
        System.out.println("NAMA : "+nama);
        System.out.println("UMUR : "+umur);
        System.out.println("IPK : "+ipk);
    }

    
}