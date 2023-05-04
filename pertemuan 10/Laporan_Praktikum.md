<h1 align="center">

LAPORAN PRAKTIKUM

ALGORITMA DAN STRUKTUR DATA

<img src="img/Logo Polinema (Politeknik Negeri Malang) (1).png">

<h2 align="center">

RIZQI REZA DANUARTA

2241720057

TI-1C

### Latihan Praktikum 8.2.1
``` java 
import java.util.*;
public class MainQueue {
    public static void menu(){
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueu");
        System.out.println("2. Dequeu");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        queue q = new queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = q.denqueue();
                    if (dataKeluar != 0) {
                        System.out.println("data yang dikeluarkan"+dataKeluar);
                        break;
                    }
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (pilih  == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

class queue{
    int max, size, front, rear;
    int [] q ;
    public queue(int n){
        max = n;
        create();
    }
    public void create(){
    q = new int[max];
    size = 0;
    front = rear = -1;
    }
    public boolean IsEmpety(){
        if (size == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max) {
            return true;
        }
        else{
            return false;
        }
    }
    public void peek(){
        if (!IsEmpety()) {
            System.out.println("Elemen terdepan : "+q[front]);
        }
        else{
            System.out.println("queue masih kosong");
        }
    }
    public void print(){
        if (IsEmpety()) {
            System.out.println("queue masih kosong");
        }
        else{
            int i = front;
            while(i != rear){
                System.out.println(q[i] + "");
                i = (i+1)%max;
            }
            System.out.println(q[i]+"");
            System.out.println("Jumlah elemen = "+size);
        }
    }
    public void clear(){
        if (!IsEmpety()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        }
        else{
            System.out.println("queue masih kosong");
        }
    }
    public void enqueue (int data){
        if (IsFull()) {
            System.out.println("queu sudah penuh");
        }
        else{
            if (IsEmpety()) {
                front = rear = 0;
            }
            else{
                if (rear == max -1) {
                    rear = 0;
                }
                else{
                    rear++;
                }
            }
            q[rear]=data;
            size++;
        }
    }
    public int denqueue(){
        int data = 0;
        if (IsEmpety()) {
            System.out.println("queue masih kosong");
        }
        else{
            data = q[front];
            size--;
            if (IsEmpety()) {
                front = rear = -1;
            }
            else{
                if (front == max - 1) {
                    front = 0;
                }
                else{
                    front++;
                }
            }
        }
        return data;
    }

}

```
<img src="img/hasil praktikum 1.png">
<img src="img/hasil praktikum 1.1.png">
<img src="img/hasil praktikum 1.2.png">

#### pertanyaan 8.2.3
1.  atribut front dan rear bernilai -1,dimaksutkan untuk menunjukkan bahwa sizenya masih dalam konsisi kosong/0,
tribut size bernilai 0, Karena setiap array di mulai dari indexs ke 0

2. potongan kode tersebut berguna untuk jika rear/data berada pada posisi max-1/indexs terakhir dari array, maka disaat ada penambahan data baru, maka akan di tempatkan pada index ke -0.

3. Data baru disimpan pada posisi terakhir di dalam queue pada baris kode q[rear]=data; setelah pengecekan apakah queue sudah penuh atau belum. Variabel rear menyimpan indeks posisi terakhir pada array q. 

4. 
```java
 public void peek(){
        if (!IsEmpety()) {
            System.out.println("Elemen terdepan : "+q[front]);
        }
        else{
            System.out.println("queue masih kosong");
        }
    }
``` 

5. Karena posisi front atau data terdepan tidak selalu pada indeks ke-0, sedangkan perulangan dimulai dengan posisi frontnya

6. Karena posisi front atau data terdepan tidak selalu pada indeks ke-0, sedangkan perulangan dimulai dengan posisi frontnya

7. Kode program i = (i+1)%max; digunakan untuk menggeser indeks elemen yang akan diprint dalam antrian



### 8.3.1
``` java
public class penumpang {
    String nama,kotaAsal, kotaTujuan;
    int jumlahTiket, harga;

    penumpang(String nama, String tujuan, String asal, int jumlah, int harga){
        this.nama=nama;
        this.kotaAsal=asal;
        this.kotaTujuan=tujuan;
        this.jumlahTiket=jumlah;
        this.harga=harga;
    }

}
public class queuePenumpang {
    int max, size, front, rear;
    penumpang [] q ;
    
    public queuePenumpang(int n) {
        max = n;
        create();
    }
    public void create(){
        q = new penumpang[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpety(){
        if (size == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max) {
            return true;
        }
        else{
            return false;
        }
    }
    public void peek(){
        if (!IsEmpety()) {
            System.out.println("Elemen terdepan : "+q[front].nama+" "+q[front].kotaAsal+" "+q[front].kotaTujuan+" "+q[front].jumlahTiket+" "+q[front].harga);
        }
        else{
            System.out.println("queue masih kosong");
        }
    }
    public void print(){
        if (IsEmpety()) {
            System.out.println("queue masih kosong");
        }
        else{
            int i = front;
            while(i != rear){
            System.out.println(q[i].nama+" "+q[i].kotaAsal+" "+q[i].kotaTujuan+" "+q[i].jumlahTiket+" "+q[i].harga);
            i = (i+1)%max;
            System.out.println("");
            }
            System.out.println(q[i].nama+" "+q[i].kotaAsal+" "+q[i].kotaTujuan+" "+q[i].jumlahTiket+" "+q[i].harga);
            System.out.println("Jumlah elemen = "+size);
        }
    }
    public void clear(){
        if (!IsEmpety()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        }
        else{
            System.out.println("queue masih kosong");
        }
    }
    public void enqueue (penumpang data){
        if (IsFull()) {
            System.out.println("queu sudah penuh");
        }
        else{
            if (IsEmpety()) {
                front = rear = 0;
            }
            else{
                if (rear == max -1) {
                    rear = 0;
                }
                else{
                    rear++;
                }
            }
            q[rear]=data;
            size++;
        }
    }
    public penumpang denqueue(){
        penumpang data = new penumpang(null, null, null, 0, 0);
        if (IsEmpety()) {
            System.out.println("queue masih kosong");
        }
        else{
            data = q[front];
            size--;
            if (IsEmpety()) {
                front = rear = -1;
            }
            else{
                if (front == max - 1) {
                    front = 0;
                }
                else{
                    front++;
                }
            }
        }
        return data;
    }
}
import java.util.*;
public class MainPenumpang {
    public static void menu(){
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        queuePenumpang antri = new queuePenumpang(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Kota Asal : ");
                    String asal = input.nextLine();
                    System.out.print("Kota Tujuan : ");
                    String tujuan = input.nextLine();
                    System.out.print("Jumlah Tiket : ");
                    int tiket = sc.nextInt();
                    System.out.print("Harga : ");
                    int harga = sc.nextInt();
                    penumpang p = new penumpang(nama, tujuan, asal, tiket, harga);
                    sc.nextLine();
                    antri.enqueue(p);
                    break;
                case 2:
                    penumpang data = antri.denqueue();
                    if (!"".equals(data.nama)&& !"".equals(data.kotaAsal)&&data.jumlahTiket != 0 && data.harga != 0) {
                        System.out.println("Antrian yang keluar : "+data.nama +" "+data.kotaAsal+" "+data.kotaTujuan+" "+data.jumlahTiket+" "+data.harga);
                        break;                        
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.clear();
                    break;
            }
        } while (pilih  == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

```
<img src="img/hasil praktikum 2.png">
<img src="img/hasil praktikum 2.1.png">

#### pertanyaan 8.3.3
1.  Baris kode penumpang data = new penumpang(null, null, null, 0, 0); membuat objek baru dari kelas penumpang dengan parameter yang diberikan. Dalam hal ini, objek yang dibuat memiliki nilai null untuk atribut nama, dan tujuan, serta 0 untuk atribut umur dan harga tiket.
2. hasilnya akan eror karena pada class penumpang tidak ada kontruktor seperti yang di soal
3. 
```java
public penumpang denqueue(){
        penumpang data = new penumpang(null, null, null, 0, 0);
        if (IsEmpety()) {
            System.out.println("queue masih kosong");
        }
        else{
            data = q[front];
            size--;
            if (IsEmpety()) {
                front = rear = -1;
            }
            else{
                if (front == max - 1) {
                    front = 0;
                }
                else{
                    front++;
                }
            }
        }
        return data;
    }
}
```
4. 
```java
public void peekRear(){
        if (!IsEmpety()) {
            System.out.println("Elemen terdepan : "+q[rear].nama+" "+q[rear].kotaAsal+" "+q[rear].kotaTujuan+" "+q[rear].jumlahTiket+" "+q[rear].harga);
        }
        else{
            System.out.println("queue masih kosong");
        }
    }
```
<img src="img/hasil praktikum 2.2.png">

### Latihan Praktikum
### TUGAS
2. 
``` java
public class mahasiswa {
    String nama, nim;
    int absen;
    double ipk;
    mahasiswa(String nama, String nim, int absen, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.absen = absen;
        this.ipk = ipk;
    }
    mahasiswa(){
        
    }
    public mahasiswa(int n) {
    }
}
public class queueMhs {
    int max, size, front, rear;
    mahasiswa antrian [];

    public queueMhs(int n){
        max = n;
        antrian = new mahasiswa[max];
        size = 0;
        front = rear = -1;       
    }
        public boolean IsEmpety(){
            if (size == 0) {
                return true;
            }
            else{
                return false;
            }
    }
        public boolean IsFull(){
            if (size == max) {
                return true;
            }
            else{
                return false;
            }
        }
        public void peek(){
            if (!IsEmpety()) {
                System.out.println(antrian[front].nama+" "+antrian[front].nim+" "+antrian[front].absen+" "+antrian[front].ipk);

            }
            else{
                System.out.println("queue masih kosong");
            }
        }
        public void peekRear(){
            if(!IsEmpety()){
                System.out.println("Elemen yang belakang : "+antrian[rear].nama+ " "+antrian[rear].nim+" "+antrian[rear].absen+" "+antrian[rear].ipk);
            }else{
                System.out.println("Queue masih kosong");
            }
        }
        public void print(){
            if (IsEmpety()) {
                System.out.println("queue masih kosong");
            }
            else{
                int i = front;
                while(i != rear){
                    System.out.println(antrian[i].nama+" "+antrian[i].nim+" "+antrian[i].absen+" "+antrian[i].ipk);
                    i = (i+1)%max;
                }
                System.out.println(antrian[i].nama+" "+antrian[i].nim+" "+antrian[i].absen+" "+antrian[i].ipk);

                System.out.println("Jumlah elemen = "+size);
            }
        }
        public void clear(){
            if (!IsEmpety()) {
                front = rear = -1;
                size = 0;
                System.out.println("queue berhasil dikosongkan");
            }
            else{
                System.out.println("queue masih kosong");
            }
        }
        public void enqueue (mahasiswa antri){
            if(IsFull()){
                System.out.println("Queue sudah penuh");
            }else{
                if(IsEmpety()){
                    front = rear = 0;
                }else{
                    if (rear == max -1){
                        rear = 0;
                    }else{
                        rear++;
                    }
                }
                antrian[rear] = antri;
                size++;
            }
        }
        public mahasiswa denqueue(){
            mahasiswa antri = new mahasiswa(null, null, 0, 0);
            if (IsEmpety()) {
                System.out.println("queue masih kosong");
            }
            else{
                antri = antrian[front];
                size--;
                if (IsEmpety()) {
                    front = rear = -1;
                }
                else{
                    if (front == max - 1) {
                        front = 0;
                    }
                    else{
                        front++;
                    }
                }
            }
            return antri;
        }
        public void peekPosition(String nim){
            int i = front;
            boolean j = true;
            while (j && i <= rear) {
                if (nim.equals(this.antrian[i].nim)) {
                    System.out.println("data " + antrian[i].nim + " ada di index ke-" + i);
                    j = false;
                }
                i++;
            }
        }
        public void printMahasiswa (int posisi){
            int i = front;
            boolean j = true;
            while(j){
                if(posisi == i){
                    System.out.println("data pada index ke - "+i+" adalah "+this.antrian[i].nim+" "+this.antrian[i].nama+" "+this.antrian[i].absen+" "+this.antrian[i].ipk);
                    j = false;
                }
                i++;
            }
        }

}
import java.util.*;
public class MainMhs {
    public static void menu(){
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. Cari index mahasiswa menggunakan nim");
        System.out.println("7. Cek data mahasiswa bedasarkan antrian ");
        System.out.println("8. Hapus Antrian");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        queueMhs ngantri = new queueMhs(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt(); 
            switch (pilih) {
                case 1:
                    System.out.print("Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("NIM Mahasiswa : ");
                    String nim = input.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    Double ipk = sc.nextDouble();
                    mahasiswa m = new mahasiswa(nama, nim, absen, ipk);
                    sc.nextLine();
                    ngantri.enqueue(m);
                    break;
                case 2:
                    mahasiswa data = ngantri.denqueue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) &&!"".equals(data.absen) && data.ipk !=0){
                        System.out.println("Antrian yang keluar : " + data.nim+ " "+ data.nama+" "+ data.absen+" "+data.ipk);
                    }
                case 3:
                   ngantri.peek();
                    break;
                case 4:
                    ngantri.print();
                    break;
                case 5:
                    ngantri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nim Mahasiswa :");
                    String ni = input.nextLine();
                    ngantri.peekPosition(ni);
                    break;
                case 7:
                    System.out.print("Masukkan indeks Antrian yang akan dicek\t:");
                    int posisi = sc.nextInt();
                    ngantri.printMahasiswa(posisi);
                    break;
                case 8:
                    ngantri.clear();
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }

}

```







