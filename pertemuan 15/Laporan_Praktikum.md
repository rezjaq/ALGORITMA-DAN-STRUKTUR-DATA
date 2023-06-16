<h1 align="center">

LAPORAN PRAKTIKUM

ALGORITMA DAN STRUKTUR DATA

<img src="img/Logo Polinema (Politeknik Negeri Malang).png">

<h2 align="center">

RIZQI REZA DANUARTA

2241720057

TI-1C

### Latihan Praktikum 2.1
``` java 
class node {
    int data;
    node next;

    public node(int nilai, node berikutnya){
        this.data = nilai;
        this.next = berikutnya;
    }
}
public class SingleLinkedList {
    node head; 
    node tail; 
    
    public boolean isEmpty() {
    return head == null;
    }
    public void print(){
        if(!isEmpty()){
            node tmp = head;
            System.out.print("Isi Linked List\t\t\t: ");
            while(tmp != null){
                System.out.print(tmp.data +"\t\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){ 
            head = ndInput; 
            tail = ndInput;
        }else{
            ndInput.next = head;
                head = ndInput;
        }
    }
    public void addLast(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput; 
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(int key, int input){
        node ndInput = new node(input, null);
        node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertAt(int index, int input){
        if (index < 0){
            System.out.println("Indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else {
            node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }
    public int getData(int index){
        node tmp = head;
        for (int i=0; i<index; i++){
            tmp =  tmp.next;
        }
        return tmp.data;
    }
    public int indexOf(int key){
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong");
        }else if (head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    public void removeLast() {
        if (isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else {
            node temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            node temp = head;
            for(int i=0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
    public void insertBefore(int key, int input){
        node ndInput = new node(input, null);
        node temp = head;
        node prev = null;
        
        do{
            if(head.data == key){
                addFirst(input);
                break;
            }else if (temp.data == key){
                ndInput.next = temp;
                prev.next = ndInput;
                if(temp.next == null){
                    tail = ndInput;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }while (temp != null);
    }
}public class SLLmain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
```
<img src="img/P1.png">

#### pertanyaan 2.3
1.  Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? 

    jawaban : karena linked list (node) masih belum memiliki isi atau data, dimana pada sllMain langsung dilakukan pemanggilan method print diawal pemanggilan yang mana node masih belum di isi data sama sekali, sehingga system akan menampilkan "Linked List Kosong"

2. Pada step 10, jelaskan kegunaan kode berikut
<img src="img/per2.png">

    jawaban : jika temp.data sama dengan key, maka kode program otomatis mengubah nilai variabel ndInput.next menjadi variabel temp.next serta nantinya pada variable ndInput untuk menyimpan nilainya

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut 
<img src="img/per3.png">

    jawaban : ika temp.next.next == nul maka akan mengembalikan nilai -1 atau data kosong, dan jika tidak ada kondisi yang terpenuhi sama sekali maka akan mengembalikan nilai dari index yaitu 0



### 2.2.1
``` java
public class SingleLinkedList {
    node head; 
    node tail; 
    
    public boolean isEmpty() {
    return head == null;
    }
    public void print(){
        if(!isEmpty()){
            node tmp = head;
            System.out.print("Isi Linked List\t\t\t: ");
            while(tmp != null){
                System.out.print(tmp.data +"\t\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){ 
            head = ndInput; 
            tail = ndInput;
        }else{
            ndInput.next = head;
                head = ndInput;
        }
    }
    public void addLast(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput; 
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(int key, int input){
        node ndInput = new node(input, null);
        node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertAt(int index, int input){
        if (index < 0){
            System.out.println("Indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else {
            node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }
    public int getData(int index){
        node tmp = head;
        for (int i=0; i<index; i++){
            tmp =  tmp.next;
        }
        return tmp.data;
    }
    public int indexOf(int key){
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong");
        }else if (head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    public void removeLast() {
        if (isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else {
            node temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            node temp = head;
            for(int i=0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
    public void insertBefore(int key, int input){
        node ndInput = new node(input, null);
        node temp = head;
        node prev = null;
        
        do{
            if(head.data == key){
                addFirst(input);
                break;
            }else if (temp.data == key){
                ndInput.next = temp;
                prev.next = ndInput;
                if(temp.next == null){
                    tail = ndInput;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }while (temp != null);
    }
}
public class SLLmain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("\nData pada index ke-1\t\t: "+singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke\t: "+singLL.indexOf(760)+"\n");
        
        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
```
<img src="img/P2.png">


#### pertanyaan 2.3.3
1.  Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

    jawaban : terdapat dua break yang ada pada method remove, break yang pertama berfungsi untuk jika data yang dihapus ada pada head dan ditemukan maka program akan langsung break, break yang kedua berfungsi untuk jika data yang dihapus berada ditengah dan ditemukan maka program akan langsung break
2. Jelaskan kegunaan kode dibawah pada method remove

<img src="img/per2.2.png">
    
    
    jawaban :jika node yang dipilih memiliki data yang sama (equals) dengan key, maka terjadi perubahan posisi dimana node tersebut akan digantikan oleh node yang selanjutnya


3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud
masing-masing kembalian tersebut!

    jawaban : jika tmp == null maka akan mengembalikan nilai -1 atau data kosong dan jika tidak ada kondisi yang terpenuhi sama sekali maka akan mengembalikan nilai index yaitu 0

### Latihan Praktikum
### TUGAS
1. Buat method insertBefore untuk menambahkan node sebelum keyword yang diinginkan

    jawaban :
```java
public void insertBefore(int key, int input){
        node ndInput = new node(input, null);
        node temp = head;
        node prev = null;
        
        do{
            if(head.data == key){
                addFirst(input);
                break;
            }else if (temp.data == key){
                ndInput.next = temp;
                prev.next = ndInput;
                if(temp.next == null){
                    tail = ndInput;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }while (temp != null);
    }
```


2. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data

    jawaban : 

```java
class node {
    char data;
    node next;

    public node(char input, node berikutnya){
        this.data = input;
        this.next = berikutnya;
    }
}
public class SingleLinkedList {
    node head; 
    node tail; 
    
    public boolean isEmpty() {
    return head == null;
    }
    public void print(){
        if(!isEmpty()){
            node tmp = head;
            System.out.print("Isi Linked List\t\t\t: ");
            while(tmp != null){
                System.out.print(tmp.data +"\t\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(char input){
        node ndInput = new node(input, null);
        if(isEmpty()){ 
            head = ndInput; 
            tail = ndInput;
        }else{
            ndInput.next = head;
                head = ndInput;
        }
    }
    public void addLast(char input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput; 
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(int key, char input){
        node ndInput = new node(input, null);
        node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertAt(int index, char input){
        if (index < 0){
            System.out.println("Indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else {
            node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }
    public int getData(int index){
        node tmp = head;
        for (int i=0; i<index; i++){
            tmp =  tmp.next;
        }
        return tmp.data;
    }
    public int indexOf(int key){
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong");
        }else if (head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    public void removeLast() {
        if (isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else {
            node temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            node temp = head;
            for(int i=0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
    public void insertBefore(int key, char input){
        node ndInput = new node(input, null);
        node temp = head;
        node prev = null;
        
        do{
            if(head.data == key){
                addFirst(input);
                break;
            }else if (temp.data == key){
                ndInput.next = temp;
                prev.next = ndInput;
                if(temp.next == null){
                    tail = ndInput;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }while (temp != null);
    }
}
public class SLLMain2 {
    public static void main(String[] args) {
    SingleLinkedList singLL = new SingleLinkedList();
    singLL.addFirst('a');
    singLL.print();
    singLL.addLast('e');
    singLL.print();
    singLL.insertAfter('a','b');
    singLL.print();
    singLL.insertAt(2, 'c');
    singLL.print();
    singLL.insertBefore('e', 'd');
    singLL.print();
    
    System.out.println("\nMaka Penambahan data sudah sesuai seperti berikut ini");
    singLL.print();
    }
}
```
<img src="img/jawabanT2.png">

3. Buatlah Implementasi Stack berikut menggunakan Single Linked List
<img src="img/tugas3.png">

    jawaban : 

```java
public class tugasSL3 {
    String data;
    tugasSL3 next;

    public tugasSL3(String nilai, tugasSL3 berikutnya){
        this.data = nilai;
        this.next = berikutnya;
    }
}
public class SingleLinkedListTugas3 {
    tugasSL3 head; 
    tugasSL3 tail; 
    
    public boolean isEmpty() {
    return head == null;
    }
    
    public void tambah(){
        if(!isEmpty()){
            tugasSL3 tmp = head;
            System.out.println("Berhasil menambahkan "+ tmp.data);
        }
    }
    public void print(){
        if(!isEmpty()){
            tugasSL3 tmp = head;
            while(tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void peek(){
        if(!isEmpty()){
            tugasSL3 tmp = head;
            System.out.println("Elemen Teratas : "+tmp.data);
        }else{
        System.out.println("Stack Masih Kosong");
        }
    }
    public void push(String input){
        tugasSL3 ndInput = new tugasSL3(input, null);
        if(isEmpty()){ 
            head = ndInput; 
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
}
public class SLLmain3 {
    public static void main(String[] args) {
        SingleLinkedListTugas3 singLL = new SingleLinkedListTugas3();
        System.out.println("-----------Linked List--------");
        System.out.println("------------------------------");
        singLL.push("Bahasa");
        singLL.tambah();
        singLL.print();
        singLL.push("Android");
        singLL.tambah();
        singLL.print();
        singLL.push("Komputer");
        singLL.tambah();
        singLL.print();
        singLL.push("Basis Data");
        singLL.tambah();
        singLL.print();
        singLL.push("Matematika");
        singLL.tambah();
        singLL.print();
        singLL.push("Algoritma");
        singLL.tambah();
        singLL.print();
        singLL.push("Statistika");
        singLL.tambah();
        singLL.print();
        singLL.push("Multimedia");
        singLL.tambah();
        singLL.print();
        
        System.out.println("\n-----Isi Stack menjadi----\n");
        singLL.print();
        singLL.peek();
    }
}
```
hasil output dari program diatas 
<img src="img/tugas3.1.png">
<img src="img/tugas3.2.png">
<img src="img/tugas3.3.png">
<img src="img/tugas3.4.png">
<img src="img/tugas3.6.png">

4. Buatlah implementasi program antrian untuk mengilustasikan mahasiswa yang sedang meminta
tanda tangan KRS pada dosen DPA di kampus pada tugas jobsheet 8 menggunakan LinkedList.
Implementasikan Queue pada antrian mahasiswa dengan menggunakan konsep LinkedList!

    jawaban : 
```java
public class tugasSL4 {
    String nim, nama;
    int absen;
    double ipk;
    tugasSL4 next;

    public tugasSL4(String nim, String nama, int absen, double ipk, tugasSL4 berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk =ipk;
        this.next = berikutnya;
    }
}
public class SingleLinkedListTugas4 {
    tugasSL4 head; //posisi awal linked list
    tugasSL4 tail; //posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }
    public void print(){
        if(!isEmpty()){
            tugasSL4 tmp = head;
            int antrian = 0;
            while(tmp != null){
                System.out.println("Mahasiswa ke - "+(antrian+1)+" = "+tmp.nim+" "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
                tmp = tmp.next;
                antrian ++;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addLast(String nim, String nama, int absen, double ipk){
        tugasSL4 ndInput = new tugasSL4(nim, nama, absen, ipk, null);
        if(isEmpty()){
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void peek(){
        if(!isEmpty()){
            tugasSL4 tmp = head;
            System.out.println("Elemen terdepan : "+tmp.nim+ " "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if(!isEmpty()){
            tugasSL4 tmp = tail;
            System.out.println("Elemen yang belakang : "+tmp.nama+ " "+tmp.nim+" "+tmp.absen+" "+tmp.ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void cariIndex(int index){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            tugasSL4 tmp = head;
            for(int i=0; i<index; i++){
                tmp = tmp.next;
            }
            System.out.println("Data pada index ke-"+index+" "+tmp.nim+" "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
        }
    }
    public void cariNim(String key){
        tugasSL4 tmp = head;
        int index = 0;
        while (tmp != null &&(!(tmp.nim.equals(key)))) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Data "+key+" berada pada index ke "+index);
        }
        System.out.println("Data Mahasiswa : "+tmp.nim+" "+tmp.nama+" "+tmp.absen+" "+tmp.ipk);
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong");
        }else if (head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
}
import java.util.*;
public class SLLmain4 {
    public static void menu(){
        System.out.println("\nPilih Menu ");
        System.out.println(" 1. Antrian baru\n 2. Antrian Keluar\n 3. Cek Antrian Terdepan\n 4. Cek Semua Antrian\n 5. Cek Antrian Paling Belekang\n 6. Cari index Mahasiswa dengan Nim\n 7. Cek data mahasiswa berdasarkan antrian\n 8. Keluar");
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner dou = new Scanner(System.in);
    
        SingleLinkedListTugas4 singLL = new SingleLinkedListTugas4();

        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
    
        switch(pilih){
            case 1:
                System.out.print("Nim Mahasiswa\t: ");
                String nim = sc.nextLine();
                System.out.print("Nama Mahasiswa\t: ");
                String nama = sc.nextLine();
                System.out.print("Absen Mahasiswa\t: ");
                int absen = num.nextInt();
                System.out.print("IPK Mahasiswa\t: ");
                double ipk = dou.nextDouble();
                singLL.addLast(nim, nama, absen, ipk);
                sc.nextLine();
            break;
            
            case 2:
                singLL.removeFirst();
                System.out.println("mahasiswa urutan awal ");
                System.out.println("Sisa antrian\n");
                singLL.print();
            break;
            
            case 3:
                System.out.println("Berikut adalah antrian mahasiswa terdepan");
                singLL.peek();
            break;
            
            case 4:
                System.out.println("Semua Data Antrian");
                singLL.print();
            break;
            
            case 5:
                System.out.println("Berikut adalah antrian mahasiswa paling belakang !");
                singLL.peekRear();
            break;
            
            case 6:
                System.out.println("Pencarian Index Mahasiswa Dengan Nim");
                System.out.print("Masukkan Nim mahasiswa : ");
                String nimm = sc.nextLine();
                singLL.cariNim(nimm);
            break;
            
            case 7:
                System.out.println("Pencarian data mahasiswa berdasarkan antrian");
                System.out.print("Masukkan antrian Mahasiswa : ");
                int antrian = num.nextInt();
                singLL.cariIndex(antrian);
            break;
            
            case 8:
                System.out.println("Terima Kasih Telah menggunakan layanan kami");
                System.out.println("Semoga dengan aplikasi ini dapat bermanfaat bagi anda");
                System.out.println("SELAMAT TINGGAL DAN SAMPAI JUMPA");
                System.exit(0);
            break;
        }
    }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
}
}
```
<img src="img/tugas4.png">
<img src="img/tugas4.1.png">
<img src="img/tugas4.2.png">
<img src="img/tugas4.3.png">