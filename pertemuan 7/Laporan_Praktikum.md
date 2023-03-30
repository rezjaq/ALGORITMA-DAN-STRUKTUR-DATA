<h1 align="center">

LAPORAN PRAKTIKUM

ALGORITMA DAN STRUKTUR DATA

<img src="img/Logo Polinema (Politeknik Negeri Malang) (1).png">

<h2 align="center">

RIZQI REZA DANUARTA

2241720057

TI-1C

### 6.2.1
``` java 
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
public class pencarianmhs {
    mahasiswa listMhs [] = new mahasiswa[5];
    int idx;

    void tambah(mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }
    void merge(int left, int mid, int right) {
        mahasiswa[] temp = new mahasiswa[listMhs.length];
        for (int i = left; i <= right; i++) {
            temp[i] = listMhs[i];
        }

        int a = left;
        int b = mid + 1;
        int c = left;

        while (a <= mid && b <= right) {
            if (temp[a].nim <= temp[b].nim) {
                listMhs[c] = temp[b];
                a++;
            } else {
                listMhs[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= mid) {
            listMhs[c] = temp[a];
            a++;
            c++;
        }

        while (b <= right) {
            listMhs[c] = temp[b];
            b++;
            c++;
        }
    }    
    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }
            else if(listMhs[mid].nim > cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    public int findSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public int findSeqSearchString(String cari){
        int posisi = -1;
        int counter = 0;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nama.equalsIgnoreCase(cari)){
                if(posisi == -1) {
                    posisi = j;
                }
                counter++;
            }
        }
        if(counter > 1) {
            System.out.println("Ditemukan " + counter + " mahasiswa dengan nama " + cari);
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data: "+x+" ditemukan pada indeks ke-"+pos);
        }
        else{
            System.out.println("data "+x+"tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Nim\t : "+x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        }
        else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
}
import java.util.*;
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        pencarianmhs data = new pencarianmhs();
        int jumMhs = 5;

        System.out.println("------------------------------");
        System.out.println("Masukkan data mahasiswa secara terurut dari nim terkecil");

        for(int i=0; i<jumMhs; i++){
            System.out.println("---------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.next();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("Ipk\t : ");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, umur, nama, ipk);
            data.tambah(m);

            System.out.println("------------------------------");
            System.out.println("Data Keseluruhan Mahasiswa");
            data.tampil();

            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
            System.out.print("NIM : ");
            int cari = s.nextInt();
            System.out.println("Sequential Search");
            int posisi = data.findSeqSearch(cari);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
            System.out.println("------------------------------");
            System.out.println("Binary Search");
            posisi = data.findBinarySearch(cari, 0, jumMhs-1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
        }
    }
}
```
#### pertanyaan 6.2.3
1.  pada method tampildata itu cuman menampilkan sebuah proses yang dimana output dari program hanyalah sebuah inputan dari user seperti nama,nim,umur,ipk. Namun kalo method tampilPosisi itu adalah sebuah proses yang akan menghasilkan output untuk menunjukkan jika key kita mencari nim 2 terletak pada indeks ke berapa.

2. fungsi break pada program berguna untuk jika kita mencari sebuah key yang ditemukan dan setelah menemukannya pada indeks tertentu maka proses akan dihentikan supaya tidak terjadi pengecekan secara berulang-ulang.

3. masih bisa karena ini menggunakan metode algoritma sequential serach bukan binary serach



### 6.3.1
``` java
public class pencarianmhs {
    mahasiswa listMhs [] = new mahasiswa[5];
    int idx;

    void tambah(mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }
    void merge(int left, int mid, int right) {
        mahasiswa[] temp = new mahasiswa[listMhs.length];
        for (int i = left; i <= right; i++) {
            temp[i] = listMhs[i];
        }

        int a = left;
        int b = mid + 1;
        int c = left;

        while (a <= mid && b <= right) {
            if (temp[a].nim <= temp[b].nim) {
                listMhs[c] = temp[b];
                a++;
            } else {
                listMhs[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= mid) {
            listMhs[c] = temp[a];
            a++;
            c++;
        }

        while (b <= right) {
            listMhs[c] = temp[b];
            b++;
            c++;
        }
    }    
    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }
            else if(listMhs[mid].nim > cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    public int findSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public int findSeqSearchString(String cari){
        int posisi = -1;
        int counter = 0;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nama.equalsIgnoreCase(cari)){
                if(posisi == -1) {
                    posisi = j;
                }
                counter++;
            }
        }
        if(counter > 1) {
            System.out.println("Ditemukan " + counter + " mahasiswa dengan nama " + cari);
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data: "+x+" ditemukan pada indeks ke-"+pos);
        }
        else{
            System.out.println("data "+x+"tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Nim\t : "+x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        }
        else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
}
import java.util.*;
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        pencarianmhs data = new pencarianmhs();
        int jumMhs = 5;

        System.out.println("------------------------------");
        System.out.println("Masukkan data mahasiswa secara terurut dari nim terkecil");

        for(int i=0; i<jumMhs; i++){
            System.out.println("---------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.next();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("Ipk\t : ");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, umur, nama, ipk);
            data.tambah(m);

            System.out.println("------------------------------");
            System.out.println("Data Keseluruhan Mahasiswa");
            data.tampil();

            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
            System.out.print("NIM : ");
            int cari = s.nextInt();
            System.out.println("Sequential Search");
            int posisi = data.findSeqSearch(cari);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
            System.out.println("------------------------------");
            System.out.println("Binary Search");
            posisi = data.findBinarySearch(cari, 0, jumMhs-1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
        }
    }
}
```

#### pertanyaan 6.3.3
1.  pada method FindBinarySearch yang membagi data menjadi dua bagian pada setiap iterasi, dan mencari data di salah satu bagian tergantung dari nilai data yang dicari dan nilai data pada tengah-tengah bagian.
2. pada method FindBinarySearch jika nilai cari sama dengan nilai listmsh[mid].nim maka nilai mid akan dikembalikan namun jika tidak maka proses conquer dilakukan dengan memanggil kembali method findbinarysearch dengan parameter yang berbeda yaitu left dan mid-1 jika listMhs[mid].nim lebih besar dari cari, atau mid+1 dan right jika listMhs[mid].nim lebih kecil dari cari. Proses ini akan berulang hingga nilai cari ditemukan atau seluruh data telah dijelajahi.
3. tidak bisa karena binary search akan mencari nilai dengan key yang diberikan oleh user dan akan diurutkan terlebih dahulu lalu akan dilakukan proses pencarian
4. 
``` java
public int findBinarySearch(int cari, int left, int right){
    int mid;
    if(right>=left){
        mid = (left+right)/2;
        if(cari == listMhs[mid].nim){
            return (mid);
        }
        else if(listMhs[mid].nim > cari){
            return findBinarySearch(cari, mid+1, right); // cari di bagian kanan
        }
        else{
            return findBinarySearch(cari, left, mid-1); // cari di bagian kiri
        }
    }
    return -1;
}
```
### Latihan Praktikum
1. 
``` java
void merge(int left, int mid, int right) {
        mahasiswa[] temp = new mahasiswa[listMhs.length];
        for (int i = left; i <= right; i++) {
            temp[i] = listMhs[i];
        }

        int a = left;
        int b = mid + 1;
        int c = left;

        while (a <= mid && b <= right) {
            if (temp[a].nim <= temp[b].nim) {
                listMhs[c] = temp[b];
                a++;
            } else {
                listMhs[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= mid) {
            listMhs[c] = temp[a];
            a++;
            c++;
        }

        while (b <= right) {
            listMhs[c] = temp[b];
            b++;
            c++;
        }
    }   
```
2. 
``` java
public int findSeqSearchString(String cari){
        int posisi = -1;
        int counter = 0;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nama.equalsIgnoreCase(cari)){
                if(posisi == -1) {
                    posisi = j;
                }
                counter++;
            }
        }
        if(counter > 1) {
            System.out.println("Ditemukan " + counter + " mahasiswa dengan nama " + cari);
        }
        return posisi;
    }
```







