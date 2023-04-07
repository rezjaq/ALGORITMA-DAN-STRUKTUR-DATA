<h1 align="center">

LAPORAN PRAKTIKUM

ALGORITMA DAN STRUKTUR DATA

<img src="img/Logo Polinema (Politeknik Negeri Malang) (1).png">

<h2 align="center">

RIZQI REZA DANUARTA

2241720057

TI-1C

## Langkah Percobaan 5.2.1
``` java
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
public class daftarMhs {
    mahasiswa listMhs[] = new mahasiswa [5];
    int idx;
    
    void tambah( mahasiswa m ){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("peringatan data sudah penuh!!");
        }
    }
    void tampil(){
        for(mahasiswa m : listMhs ){
            m.tampil();
            System.out.println("------------------");
        }
    }
    void bubleShort(){
        for(int i =0 ; i<listMhs.length; i++){
            for(int j=1; j<listMhs.length; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp; 
                }
            }
        }
    }
}
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

    }
}
```
<img src="img/output p(5.2.1).jpg">

### pertanyaan 5.2.3
1. Terdapat di method apakah proses bubble sort?

jawab : terdapata pada method bubleshort

2. kondisi if yang membandingkan nilai IPK dari elemen ke-j dan ke-(j-1) dalam sebuah array/list "listMhs". Jika nilai IPK pada elemen ke-j lebih besar dari nilai IPK pada elemen ke-(j-1), maka kedua elemen tersebut akan ditukar posisinya dengan cara memindahkan elemen ke-j ke variabel sementara "tmp", mengganti elemen ke-j dengan elemen ke-(j-1), dan mengembalikan nilai elemen ke-(j-1) ke elemen ke-j-1

3. A. Perulangan i digunakan untuk menunjukkan iterasi pada elemen pertama hingga elemen terakhir dalam array/list, sedangkan perulangan j digunakan untuk menunjukkan iterasi pada elemen kedua hingga elemen terakhir dalam array/list.

B. karena pada saat i mencapai nilai listMhs.length-1, maka elemen terakhir dalam array/list sudah pasti terletak pada posisi yang tepat

C. karena pada setiap iterasi i, elemen terakhir pada array/list sudah pasti berada pada posisi yang tepat, sehingga tidak perlu lagi dilakukan pengurutan pada elemen tersebut

D.  Jika banyak data di dalam listMhs adalah 50, maka perulangan i akan berlangsung sebanyak 49 kali. Tahap Bubble Sort yang ditempuh juga sebanyak 49 tahap karena pada setiap iterasi i, 1 elemen pasti sudah terletak pada posisi yang tepat sehingga tidak perlu dilakukan pengurutan lagi pada elemen tersebut. Oleh karena itu, pada iterasi ke-1 dilakukan pengurutan untuk 49 elemen, pada iterasi ke-2 dilakukan pengurutan untuk 48 elemen, dan seterusnya hingga pada iterasi ke-49 dilakukan pengurutan hanya untuk 2 elemen

### Langkah Percobaan 5.3.0
``` java
 void selectionShort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
```
<img src="img/output p(5.3.1).jpg">

### pertanyaan 5.3.3
1. variabel idxMin diinisialisasi dengan nilai i karena pada awalnya elemen dengan indeks i diasumsikan sebagai elemen dengan nilai minimum, Perulangan dalam dilakukan dengan variabel j mulai dari i+1 hingga listMhs.length untuk membandingkan elemen dengan nilai IPK yang lebih kecil dari elemen pada indeks i jika nilai IPK pada elemen dengan indeks j lebih kecil dari nilai IPK pada elemen dengan indeks idxMin, maka variabel idxMin diupdate dengan nilai j Setelah selesai melakukan perulangan dalam, nilai pada elemen dengan indeks i ditukar dengan nilai pada elemen dengan indeks idxMin (elemen dengan nilai IPK terkecil). Ini dilakukan untuk memastikan bahwa elemen dengan nilai IPK terkecil berada pada posisi yang seharusnya.

## Langkah Percobaan 5.4.3
``` java
void insertionSortDescending(){
    for(int i=0; i<listMhs.length; i++){
        mahasiswa temp = listMhs[i];
        int j=1;
        while(j > 0 && listMhs[j-1].ipk < temp.ipk){
            listMhs[j] = listMhs[j-1];
            j--;
        }
        listMhs[j]=temp;
    }
}
```
<img src="img/output p(5.4.2).jpg">

### Pertanyaan 5.4.3
1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.
``` java
void insertionSortDescending(){
        for(int i=0; i<listMhs.length; i++){
            mahasiswa temp = listMhs[i];
            int j=i-1;
            while(j >= 0 && listMhs[j].ipk < temp.ipk){
                listMhs[j+1] = listMhs[j];
                j--;
            }
            listMhs[j+1]=temp;
        }
    }
```

## TUGAS
``` java
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
public class HotelService {
    hotel room [] = new hotel[5];
    int idx;

    void tambah(hotel h){
        if(idx<room.length){
            room[idx] = h;
            idx++;
        }
        else{
            System.out.println("Peringatan data hotel sudah penuh");
        }
    }

    void tampil(){
        for(hotel h : room){
            h.tampilHotel();;
            System.out.println("---------------------------");
        }
    }

    void bubleShort(){
        for(int i=0; i<room.length; i++){
            for(int j=1; j<room.length; j++){
                if(room[j].harga > room[j-1].harga){
                    hotel tmp = room[j];
                    room[j] = room[j-1];
                    room[j-1] = tmp;
                }
            }
        }
    }

    void bubbleSortAscending(){
    for(int i=0; i<room.length; i++){
        for(int j=1; j<room.length; j++){
            if(room[j].harga < room[j-1].harga){ 
                hotel tmp = room[j];
                room[j] = room[j-1];
                room[j-1] = tmp;
            }
        }
    }
}

    void selectionShort(){
        for(int i=0; i<room.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<room.length; j++){
                if(room[j].bintang < room[idxMin].bintang){
                    idxMin = j;
                }
            }
            hotel tmp = room[idxMin];
            room[idxMin] = room[i];
            room[i] = tmp;
        }
    }

    void selectionSortDescending(){
        for(int i=0; i<room.length; i++){
            hotel temp = room[i];
            int j=i-1;
            while(j >= 0 && room[j].bintang < temp.bintang){
                room[j+1] = room[j];
                j--;
            }
            room[j+1]=temp;
        }
    }
}

public class mainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        hotel h1 = new hotel("oyo kebangsaan", "malang", 200000, 5);
        hotel h2 = new hotel("oyo harapan", "malang", 250000, 5);
        hotel h3 = new hotel("oyo china", "malang", 235000, 4);
        hotel h4 = new hotel("oyo italia", "malang", 240000, 2);
        hotel h5 = new hotel("oyo german", "malang", 150000, 1);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("data hotel sebelum sorting = ");
        list.tampil();

        System.out.println("data hotel setelah sorting desc bedasarkan harga");
        list.bubleShort();
        list.tampil();

        System.out.println("data hotel setelah sorting asc bedasarkan harga");
        list.bubbleSortAscending();
        list.tampil();

        System.out.println("data hotel setelah soritng asc berdasarkan bintang");
        list.selectionShort();
        list.tampil();

        System.out.println("data hotel setelah soritng desc berdasarkan bintang");
        list.selectionSortDescending();
        list.tampil();
    }
}
```
<img src="img/tugas one.jpg">
<img src="img/tugas (1.1).jpg">
<img src="img/tugas(1.2).jpg">

