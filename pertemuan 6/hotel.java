public class hotel {
    String nama,kota;
    int harga;
    int bintang;

    hotel(String nama, String kota, int harga, int bintang){
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    public void tampilHotel(){
        System.out.println("Nama Hotel : "+nama);
        System.out.println("Lokasi : "+kota);
        System.out.println("Harga permalam : "+harga);
        System.out.println("Bintang "+bintang);
    }
}
