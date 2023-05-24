<h1 align="center">

LAPORAN PRAKTIKUM

ALGORITMA DAN STRUKTUR DATA

<img src="img/Logo Polinema (Politeknik Negeri Malang).png">

<h2 align="center">

RIZQI REZA DANUARTA

2241720057

TI-1C

### Latihan Praktikum 7.2.1
``` java 
class pakain{
    String warna, jenis, merk, ukuran;
    double harga;

    pakain(String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
    
}

public class stak {
    int size;
    int top;
    pakain data[];

    public stak (int size){
        this.size = size;
        data = new pakain[size];
        top = -1;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top == size - 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(pakain pkn){
        if(!isFull()){
            top++;
            data[top] = pkn;
        }
        else{
            System.out.println("Isi Stack Penuh");
        }
    }

    public void pop(){
        if(!isEmpty()){
            pakain x = data[top];
            top--;
            System.out.println("Data yang keluar : "+x.jenis+" "+x.warna+" "+x.merk+" "+x.ukuran+"");
        }
        else{
            System.out.println("stak masih kosng");
        }
    }

    public void peek(){
        System.out.println("elemen teratas "+data[top].jenis+" "+data[top].warna+" "+data[top].merk+" "+data[top].ukuran+" "+data[top].harga);
    }

    public void print(){
        System.out.println("isi stak : ");
        for(int i = top; i>=0; i--){
            System.out.println(data[i].jenis+" "+data[i].warna+" "+data[i].merk+" "+data[i].ukuran+" "+data[i].harga+" ");
        }
        System.out.println("");
    }
}

import java.util.*;
public class stakMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        stak stk = new stak(5);
        char pilih;
        do{
            System.out.println("Jenis : ");
            String jenis = input.nextLine();
            System.out.println("Warna : ");
            String warna = input.nextLine();
            System.out.println("Merk : ");
            String merk = input.nextLine();
            System.out.println("Ukuran : ");
            String ukuran = input.nextLine();
            System.out.println("Harga : ");
            double harga = input.nextDouble();

            pakain p = new pakain(jenis, warna, merk, ukuran, harga);
            System.out.println("apakah anda akan menambahkan data baru e stak (y/n) ? ");
            System.out.println("pilihan anda : ");
            pilih = input.next().charAt(0);
            input.nextLine();
            stk.push(p);
        }while(pilih == 'y');
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}

```
<img src="img/Praktikum 1.png">

#### pertanyaan 7.2.3
1.  Berapa banyak data pakaian yang dapat ditampung di dalam stack? Tunjukkan potongan kode
program untuk mendukung jawaban Anda tersebut! 

    jawaban : Banyak data pakaian yang dapat ditampung didalam stack berjumlah 5 elemen, adapun potongan kodenya terdapat pada Main class "stackMain" dibawah ini 
<img src="img/pertanyaan 1 P1.png">

2. Perhatikan class StackMain, pada saat memanggil fungsi push, parameter yang dikirimkan adalah
p. Data apa yang tersimpan pada variabel p tersebut?

    jawaban : Data yang tersimpan pada variabel p adalah data data yang dimasukkan melalui scanner

3. Apakah fungsi penggunaan do-while yang terdapat pada class StackMain?

    jawaban :  untuk melakukan perulangan agar nantinya user dapat menginputkan data yang meliputi judul, nama pengarang, tahun terbit, jumlah halaman, dan harga. Maka setelah melakukan penginputan, user akan diberi pilihan untuk menambahkan data baru atau tidak, jika "y" maka user akan diminta untuk menginputkan data data lagi, dan jika user memilih "n" maka program akan berhenti

4. Modifikasi kode program pada class StackMain sehingga pengguna dapat memilih operasioperasi pada stack (push, pop, peek, atau print) melalui pilihan menu program dengan
memanfaatkan kondisi IF-ELSE atau SWITCH-CASE!

    jawaban : 
```java
 import java.util.*;
public class stakMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stak stk = new stak(5);
        char pilih;
        do{
            System.out.println("------------------------------------");
            System.out.println("             PILIHAN MENU           ");
            System.out.println("------------------------------------");
            System.out.println(" 1. Push\n 2. Pop\n 3. Peek\n 4. Print\n 5. Harga Terendah\n");
            int pilihan;
            System.out.print("Pilih Menu (masukkan angka 1-4)");
            pilihan = sc.nextInt();
            
            switch (pilihan){
                case 1:
                    do{
                        System.out.print("Jenis\t\t: ");
                        String jenis = sc.nextLine();
                        System.out.print("Warna\t\t: ");
                        String warna = sc.nextLine();
                        System.out.print("Merk\t\t: ");
                        String merk = sc.nextLine();
                        System.out.print("Ukuran\t\t: ");
                        String ukuran = sc.nextLine();
                        System.out.print("Harga\t\t: ");
                        double harga = sc.nextInt();
                        System.out.println("");
            
                        pakain p = new pakain(jenis, warna, merk, ukuran, harga);
                        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        stk.push(p);
                    }while (pilih == 'y');
                    break;
                
                case 2:
                    stk.pop();
                    break;
                
                case 3:
                    stk.peek();
                    break;
                
                case 4:
                    stk.print();
                    break;
                
                case 5:
                    stk.getMin();
                    break;
                    
                default:
                    System.out.println("Input yang anda masukkan salah");
                    System.exit(0);
            }if(pilihan == 5){
                pilih ='t';
            }else{
                System.out.print("Kembali ke menu Utama (y/t) ");
                pilih = sc.next().charAt(0);
            }
        }while (pilih == 'y');
    }
}

``` 

### 7.3.1
``` java
import java.util.*;
public class postfixMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String p,q;
        System.out.println("Masukkan ekpresi matematika (infinix) : ");
        q = input.nextLine();
        q = q.trim();
        q = q+")";

        int total = q.length();
        postfix post = new postfix(total);
        p = post.konversi(q);
        System.out.println("Postfix : "+p);
    }
    
    
}
public class postfix {
    int n, top;
    char stack[];

    public postfix(int total){
        this.n = total;
        this.top = -1;
        this.stack = new char[n];
        push('(');
    }
    public void push(char c){
        top++;
        stack[top] = c;
    }

    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char c){
        if(( c>= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')|| (c >= '0' && c<= '9')|| c=='/'|| c=='.'){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOperator(char c){
        if(c=='^'||c=='%'||c=='/'||c=='*'||c=='-'||c=='+'){
            return true;
        }
        else{
            return false;
        }
    }

    public int derajat (char c){
        switch (c){
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 2;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi (String q){
        String p = "";
        char c;
        for(int i=0; i<n; i++){
            c = q.charAt(i);
            if(isOperand(c)){
                p = p + c;
            }
            if(c == '('){
                push(c);
            }
            if(c == ')'){
                while(stack[top] != '('){
                    p = p + pop();
                }
                pop();
            }
            if(isOperator(c)){
                while ((derajat(stack[top])) >= derajat(c)){
                    p = p + pop();  
                }
                push(c);
            }
        }
        return p;
    }
}

```
<img src="img/Praktikum 2.png">


#### pertanyaan 8.3.3
1.  Perhatikan class Postfix, jelaskan alur kerja method derajat!

    jawaban : pada class "postix", method derajat memiliki alur seperti berikut ini ketika operator tersebut adalah '^' maka akan mereturn nilai 3, jika operator '%','/','*' maka akan mereturn nilai 2. dan sedangkan operator '-', '+' maka akan mereturn nilai 1 dengan menggunakan perintah switch case yang telah tersedia

2. Apa fungsi kode program berikut? 

<img src="img/pertanyaan 2 P2.png">
    
    
    jawaban : variabel c digunakan untuk menyimpan data char i ke dalam variabel Q dengan menggunakan perintah charAt(i)


3. Jalankan kembali program tersebut, masukkan ekspresi 3*5^(8-6)%3. Tampilkan hasilnya!

    jawaban : 

<img src="img/pertanyaan 3 P2.png">

4. Pada soal nomor 3, mengapa tanda kurung tidak ditampilkan pada hasil konversi? Jelaskan!

    jawaban : karena ketika terdapat tanda kurung pada ekspresi matematika, maka tanda kurung tersebut akan langsung di pop tanpa dimasukkan kedalam postfix

### Latihan Praktikum
### TUGAS
1. Perhatikan dan gunakan kembali kode program pada Praktikum 1. Tambahkan method getMin
pada class Stack yang digunakan untuk mencari dan menampilkan data pakaian dengan harga
terendah dari semua data pakaian yang tersimpan di dalam stack!

    jawaban :

```java
 public void getMin(){
        double hrgMin = data[0].harga;
        int idn = 0;
        for(int i = 1; i <= top; i++){
            if (hrgMin > data[i].harga){
                idn = i;
                hrgMin = data[i].harga;
            }
        }
        System.out.println("Harga Pakaian Terendah adalah\t: "+data[idn].harga);
        System.out.println("Dengan merk\t\t\t: "+data[idn].merk);
    }
```

hasil outputnya seperti gambar dibawah ini
<img src="img/tugas 1.png">

2. Setiap hari Minggu, Dewi pergi berbelanja ke salah satu supermarket yang berada di area
rumahnya. Setiap kali selesai berbelanja, Dewi menyimpan struk belanjaannya di dalam laci.
Setelah dua bulan, ternyata Dewi sudah mempunyai delapan struk belanja. Dewi berencana
mengambil lima struk belanja untuk ditukarkan dengan voucher belanja.
Buat sebuah program stack untuk menyimpan data struk belanja Dewi, kemudian lakukan juga
proses pengambilan data struk belanja sesuai dengan jumlah struk yang akan ditukarkan dengan
voucher. Informasi yang tersimpan pada struk belanja terdiri dari:
• Nomor transaksi
• Tanggal pembelian
• Jumlah barang yang dibeli
• Total harga bayar
Tampilkan informasi struk belanja yang masih tersimpan di dalam stack!

    jawaban : 

```java
public class tugas2 {
    String tanggal, namaBarang;
    int noTransaksi, jmlh, total;

    tugas2(int nt, String tgl, String nb, int j, int t){
        noTransaksi =nt;
        tanggal =tgl;
        namaBarang =nb;
        jmlh =j;
        total =t;
    }
}
public class belanja {
    int size;
    int top;
    tugas2 data[];
    
        public belanja(int size){
        this.size = size;
        data = new tugas2[size];
        top = -1;
        }

        public boolean IsEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

        public boolean IsFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }

        public void push(tugas2 sb){
        if(!IsFull()){
            top++;
            data[top] = sb;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

        public void pop(){
        if(!IsEmpty()){
            tugas2 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.noTransaksi + " " + x.tanggal + " " + x.namaBarang + " " + x.jmlh + " " + x.total);
        }else{
            System.out.println("Stock masih kosong");
        }
    }

        public void peek(){
        System.out.println("Elemen teratas: " + data[top].noTransaksi +"."+ " " + data[top].tanggal + " " + data[top].namaBarang + " " + data[top].jmlh + " " + data[top].total);
    }

        public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i >= 0; i--){
        System.out.println(data[i].noTransaksi + " " + data[i].tanggal + " " + data[i].namaBarang + " " + data[i].jmlh + " " + data[i].total);
    }
        System.out.println("");
    }
        public void clear(){
            if(!IsEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stock sudah dikosongkan");
            }else{
            System.out.println("Stock masih kosong");
        }
    }
}

import java.util.*;
public class tugas2Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Scanner sd =new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("      History Struk Belanja       ");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.print("Masukkan Banyak Struk\t: ");
        int banyak = sc.nextInt();
        System.out.println();
        belanja blj = new belanja(banyak);

        int totalHarga = 0;
        int jml, harga;
        for (int i = 0; i < banyak; i++) {
        System.out.print("Nomor Transaksi\t\t: ");
        int nt =sc.nextInt();
        System.out.print("Tanggal Pembelian\t: ");
        String tanggal =sd.nextLine();
        System.out.print("Nama Barang\t\t: ");
        String nb =sd.nextLine();
        System.out.print("Jumlah Barang\t\t: ");
        jml = sc.nextInt();
        System.out.print("Harga Barang\t\t: ");
        harga = sc.nextInt();
        totalHarga =jml * harga;
        tugas2 sb =new tugas2(nt, tanggal, nb, jml,harga);
        blj.push(sb);
        System.out.print("Total Harga\t\t: "+ totalHarga);
        System.out.println("\n");
        }

     char pilih;
     do{
         System.out.println("------------------------------------");
         System.out.println("             PILIHAN MENU           ");
         System.out.println("------------------------------------");
         System.out.println(" 1. menampilkan struk teratas\n 2. ambil 5 struk untuk mendapatkan kupon\n 3. lihat sisa struk\n 4. keluar\n");
            
        System.out.print("Pilih Menu (masukkan angka 1-4)");
        int pilihan =sc.nextInt();
        System.out.println("------------------------------------------------");
        
        switch (pilihan){
        case 1:
            blj.peek();
            blj.print();
            break;
        case 2:
            blj.pop();
            blj.pop();
            blj.pop();
            blj.pop();
            blj.pop();
            break;
        case 3:
            blj.print();
            break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Menu yang anda masukkan salah");
                    break;
            }if(pilihan == 4) {
                pilih = 't';
            }else{
                System.out.print("Kembali ke menu Utama (y/t) : ");
                pilih = sc.next().charAt(0);
            }
        }while(pilih == 'y');
    }
}
```

hasil output dari program diatas sebagai berikut :

<img src="img/tugas 2.png">
<img src="img/tugas 2.2 .png">
<img src="img/tugas 2.3.png">
<img src="img/tugas 2.4.png">

