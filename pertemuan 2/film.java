class film{
    String judul, genre, rate ;
    int jumlahTiket, hargaTiket;

    film(){
    }

    film(String jd, String gr, String rt, int jt, int hr){
        judul = jd;
        genre = gr;
        rate = rt;
        jumlahTiket = jt;
        hargaTiket = hr;
    }
    
    void tampilFilm(){
        System.out.println("Judul : "+judul);
        System.out.println("Genre : "+genre);
        System.out.println("Rate : "+rate);
        System.out.println("Jumlah Tiket : "+jumlahTiket);
        System.out.println("Harga Tiket : "+hargaTiket);
    }

    void tambahTiket(int n){
        jumlahTiket += n;
    }

    void kurangTiket (int n){
        if(jumlahTiket >= 0){
            jumlahTiket -= n ;
        }
    }

    int totalRenevue(){
        return jumlahTiket*hargaTiket;
    }
}