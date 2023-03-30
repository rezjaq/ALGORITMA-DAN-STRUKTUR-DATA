<<<<<<< HEAD
class buku {
    String nama, penerbit, pengarang ;
    int hargaSatuan, jumlah;

    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }

    int hitungDiskon(){
        double diskon = 0;
        int hargaTotal = hitungHargaTotal();
        if(hargaTotal>100000){
            diskon = hargaTotal*0.1;
        }
        else if(hargaTotal>=50000){
            diskon = hargaTotal*0.5;
        }
        return (int)diskon;
    }

    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
    void tampilBuku(){
        System.out.println("Nama            : "+nama+"\t\t\t\t|");
        System.out.println("Pengarang       : "+pengarang+"\t\t\t|");
        System.out.println("Penerbit        : "+penerbit+"\t|");
        System.out.println("Harga Satuan    : "+hargaSatuan+"\t\t\t\t\t|");
        System.out.println("Jumlah Stok     : "+jumlah+"\t\t\t\t\t|");
    }
=======
class buku {
    String nama, penerbit, pengarang ;
    int hargaSatuan, jumlah;

    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }

    int hitungDiskon(){
        double diskon = 0;
        int hargaTotal = hitungHargaTotal();
        if(hargaTotal>100000){
            diskon = hargaTotal*0.1;
        }
        else if(hargaTotal>=50000){
            diskon = hargaTotal*0.5;
        }
        return (int)diskon;
    }

    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
    void tampilBuku(){
        System.out.println("Nama            : "+nama+"\t\t\t\t|");
        System.out.println("Pengarang       : "+pengarang+"\t\t\t|");
        System.out.println("Penerbit        : "+penerbit+"\t|");
        System.out.println("Harga Satuan    : "+hargaSatuan+"\t\t\t\t\t|");
        System.out.println("Jumlah Stok     : "+jumlah+"\t\t\t\t\t|");
    }
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
}