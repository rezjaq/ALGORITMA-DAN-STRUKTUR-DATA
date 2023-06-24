<h1 align="center">

LAPORAN PRAKTIKUM

ALGORITMA DAN STRUKTUR DATA

<img src="img/Logo Polinema (Politeknik Negeri Malang).png">

<h2 align="center">

RIZQI REZA DANUARTA

2241720057

TI-1C

### Latihan Praktikum 15.2.1
``` java 
/**
 * graph
 */
public class graph {
    int vertex;
    linkedList list[];
 
    public graph(int vertex) {
        this.vertex = vertex;
        list = new linkedList[vertex];
        for (int i = 0;  i< vertex; i++) {
            list[i] = new linkedList();
        }
    }
 
    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }
 
    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i< vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
                //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dai vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }
    //no 3
    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i< vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }
 
    public void removeAllEdges() {
        for (int i = 0; i< vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
 
    public void printGraph() throws Exception {
        for (int i = 0; i< vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    //no 2
    public boolean graphType(int source, int destination) throws Exception{
        list[source].addFirst(destination);
        return true;
    }
}
import java.util.Scanner;

public class graphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vertex, edge, source, destination;
        graph grp = new graph(6);
        
        System.out.print("Masukkan Vertex\t\t: ");
        vertex = sc.nextInt();
        
        System.out.print("Masukkan Edge\t\t: ");
        edge = sc.nextInt();
        
        int menu;
        do{
            System.out.println("Pilih menu dibawah ini");
            System.out.println("1. Directed(Tugas Praktikum 1)\n2. Undirected(Tugas Pratikum 2)");
            System.out.print("Masukkan Menu : ");
            menu = sc.nextInt();
            
            if(menu == 1){
                
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
            
                    grp.addEdge(source, destination);
                }
            System.out.println("");
            grp.printGraph();
            }else if(menu == 2){
                
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
            
                    grp.graphType(source, destination);
                }
            System.out.println("");
            grp.printGraph();
            }
        }while (menu != 1 && menu != 2);
    }
    
}
```
<img src="img/hasil 1 percobaan 1.png">
<img src="img/hasil 1.1 percobaan 1.png">

#### pertanyaan 15.2.3
1.  Jelaskan perbedaan antara single linked list dengan double linked lists! 

    jawaban :  Algoritma Prim, kegunaannya adalah mencari pohon rentang minimum untuk sebuah graf berbobot yang terhubung. Ini berarti menemukan subset dari tepi yang membentuk sebuah pohon yang mencakup etiap titik, di mana berat total semua tepi di pohon diminimalkan. Jika grafik tidak terhubung, maka ia menemukan hutan rentang minimum (pohon rentang minimum untuk setiap komponen terhubung).

    Algoritma Dijkstra, kegunaannya adalah dipakai dalam memecahkan permasalahan jarak terpendek (shortest path problem) untuk sebuah graf berarah (directed graph)

    Algoritma Warshall , kegunaannya menghitung jarak terpendek (shortest path) untuk semua pasangan titik pada sebuah graph, dan melakukannya dalam waktu berorde kubik. Algoritma warshall digunakan untuk menyelesaikan permasalahan jalur terpendek multi path

2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan pembuatan variabel tersebut ?


    jawaban :  berfungsi untuk di Untuk memanggil fungsi linked list dan mengisi list yang berupa vertex pada linked list tersebut.

3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?

    jawaban : Atribut head digunakan untuk menyimpan referensi ke elemen pertama dalam double linked list.
    Atribut size digunakan untuk melacak jumlah elemen dalam double linked list.

4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph ?

    jawaban :  ketika i == destination maka akan dilihat source dari i atau dengan cara melakukan looping vertex.

5. Kenapa pada praktikum 2.1.1 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?

    jawaban : output program diatas tidak ada yang eror, akan tetapi vertex yang dilewati mengalami perubahan lintasan

#### Langkah-Langkah Praktikum 2.3.1
``` java
public class graphArray {
      private final int vertices;
        private final int [][] twoD_array;
        
    public graphArray(int v){
       vertices = v;
       twoD_array = new int [vertices + 1][vertices + 1];
    }
    public void makeEdge(int to, int from, int edge){
       try{
           twoD_array[to][from] = edge;
       }
       catch(ArrayIndexOutOfBoundsException index){
           System.out.println("Vertex Tidak Ada");
       }
   }
    public int getEdge(int to, int from){
       try{
           return twoD_array[to][from];
       }
       catch(ArrayIndexOutOfBoundsException index){
           System.out.println("Vertex Tidak Ada");
       }
       return -1;
    }
}
import java.util.Scanner;

public class graphArrayMain {
    public static void main(String[] args) {
         int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        graphArray graph;
        
        try{
            System.out.print("Masukkan Jumlah Vertices\t: ");
            v = sc.nextInt();
            System.out.print("Masukkan Jumlah Edges\t\t: ");
            e = sc.nextInt();
            
            graph = new graphArray(v);
            
            System.out.println("Masukkan edges : <to> <from>");
            while (count <= e){
                to = sc.nextInt();
                from = sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
                }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("  ");
            for(int i =1; i<=v; i++){
                    System.out.print(i+" ");
                }
                System.out.println();
            
                for(int i =1; i<=v; i++){
                    System.out.print(i+" ");
                    for(int j=1; j<=v; j++){
                        System.out.print(graph.getEdge(i, j)+" ");
                    }
                    System.out.println();
            }
        }catch(Exception E){
        System.out.println("Error\n"+ E.getMessage());
        }
        sc.close();
    }
    
}
```
<img src="img/hasil 1 percobaan 2.png">
<img src="img/hasil 2 percobaan 2.png">

#### pertanyaan 2.3.3
1.  Apakah perbedaan degree/derajat pada directed dan undirected graph?

    jawaban : pada directed graph degree / derajat tidak selalu berhubungan kembali sedangkan pada undirected graph degree/derajat pasti berhubungan

2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?
    
    jawaban :karena menggunakan array dan dimulai dari 0, maka harus perlu ditambah dengan 1


3. Apakah kegunaan method getEdge() ?

    jawaban :  berfungsi untuk menampilkan suatu lintasan yang diperlukan

4. Termasuk jenis graph apakah uji coba pada praktikum 2.2?

    jawaban : "Directed graph" karena 1 berhubungan dengan 2 akan tetapi 2 tidak berhubungan dengan 1

5. Mengapa pada method main harus menggunakan try-catch Exception ?

    jawaban : eksekusi program dapat terus berjalan tanpa memberhentikan program sehingga meminimalisir terjadinya eror atau output tidak muncul
    
### TUGAS PRAKTIKUM
1. Ubahlah lintasan pada praktikum 2.1 menjadi inputan!

jawaban :

```java
int vertex, edge, source, destination;
        graph grp = new graph(6);
    
        System.out.print("Masukkan Vertex\t\t: ");
        vertex = sc.nextInt();
    
        System.out.print("Masukkan Edge\t\t: ");
        edge = sc.nextInt();
    
        int menu;
        do{
            System.out.println("Pilihan Menu");
            System.out.println("1. Directed(Tugas Praktikum 1)");
            System.out.println("1. Undirected(Tugas Praktikum 2");
            System.out.print("Masukkan Menu : ");
            menu = sc.nextInt();
        
            if(menu == 1){
                
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
        
                    grp.addEdge(source, destination);
                }
                System.out.println("");
                grp.printGraph();
            }else if(menu == 2){
            
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
        
                    grp.graphType(source, destination);
                }
            }
        }while (menu != 1 && menu != 2);
```
<img src="img/hasil tugas 1.png">
<img src="img/hasil tugas 1.1.png">


3. Tambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk
directed atau undirected graph. Kemudian update seluruh method yang berelasi dengan method
graphType tersebut (hanya menjalankan statement sesuai dengan jenis graph) pada praktikum
2.1

jawaban : 

```java
public boolean graphType(int source, int destination) throws Exception{
    list[source].addFirst(destination);
    return true;
}
```
4. Ubahlah tipe data vertex pada seluruh graph pada praktikum 2.1 dan 2.2 dari Integer menjadi tipe generic agar dapat menerima semua tipe data dasar Java! Misalnya setiap vertex yang awalnya berupa angka 0,1,2,3, dst. selanjutnya ubah menjadi suatu nama daerah seperti Gresik, Bandung, Yogya, Malang, dst.

jawaban :
```java
public class node4A {
     int data;
    node4A prev, next;

    node4A(node4A prev, int data, node4A next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
class linkedList4A {
    node4A head;
    int size;

    public linkedList4A() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new node4A(null, item, null);
        } else {
            node4A newnode4A = new node4A(null, item, head);
            head.prev = newnode4A;
            head = newnode4A;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            node4A current = head;
            while (current.next != null) {
                current = current.next;
            }
            node4A newnode4A = new node4A(current, item, null);
            current.next = newnode4A;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            node4A current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node4A newnode4A = new node4A(null, item, current);
                current.prev = newnode4A;
                head = newnode4A;
            } else {
                node4A newnode4A = new node4A(current.prev, item, current);
                newnode4A.prev = current.prev;
                newnode4A.next = current;
                current.prev.next = newnode4A;
                current.prev = newnode4A;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            node4A tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        node4A current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            node4A current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        node4A tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("nilai indeks diluar batas");
        }
        node4A tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
import java.util.*;
class graphMain4A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Vertex\t\t\t: ");
        String[] vertex = new String[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Masukkan data vertex ke-" + i + "\t: ");
            vertex[i] = sc.nextLine();
        }

        graph4A<String> gph = new graph4A<String>(vertex);

        System.out.print("Masukkan Edge\t\t\t: ");
        int edge = sc.nextInt();

        int menu;
        do {
            System.out.println("Pilih menu dibawah ini");
            System.out.println("1. Directed\n2. Undirected");
            System.out.print("Masukkan Menu : ");
            menu = sc.nextInt();

            System.out.println("Masukkan Edge: <from> <to>");
            if (menu == 1) {
                for (int i = 0; i < edge; i++) {
                    gph.graph4AType(sc.nextInt(), sc.nextInt());
                }
                gph.printgraph4A();

            } else if (menu == 2) {
                for (int i = 0; i < edge; i++) {
                    gph.addEdge(sc.nextInt(), sc.nextInt());
                }
                gph.printgraph4A();
            }
        } while (menu != 1 && menu != 2);
        sc.close();
    }
}
import java.util.Scanner;

public class graph4A<T> {
    T[] vertex;
    linkedList4A list[];

    public graph4A(T[] vertex) {
        this.vertex = vertex;
        list = new linkedList4A[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new linkedList4A();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + vertex[source] + " : " + list[source].size());

        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    totalIn++;
                }
            }
        }
        totalOut = list[source].size();
        System.out.println("Indegree dari vertex " + vertex[source] + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + vertex[source] + " : " + totalOut);
        System.out.println("Degree vertex " + vertex[source] + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        list[source].remove(destination);
        list[destination].remove(source);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("graph4A berhasil dikosongkan");
    }

    public void printgraph4A() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + vertex[i] + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    boolean graph4AType(int source, int destination) {
        list[source].addFirst(destination);
        return true;
    }
}
```
<img src="img/hasil tugas 4a.png">
<img src="img/hasil tugas 4a1.png">

```java
public class graphArray4A <T> {
    private final T[] vertices;
    private final int[][] twoD_array;

    public graphArray4A(T[] v) {
        vertices = v;
        twoD_array = new int[vertices.length + 1][vertices.length +1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoD_array[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }

    public int getEdge(int to, int from) {
        try{
            return twoD_array[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
}
import java.util.Scanner;
public class graphArrayMain4A {
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        
        graphArray4A <String> graph;
        
        try {
            System.out.print("Masukkan Jumlah Vertices\t: ");
            v = sc.nextInt();
            System.out.print("Masukkan Jumlah Edges\t\t: ");
            e = sc.nextInt();
            
            String[] vertexs = new String[v + 1]; 
            sc.nextLine();
            for (int i = 1; i <= v; i++) {
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                vertexs[i] = sc.nextLine();
            }
            graph = new graphArray4A<String>(vertexs);
            
            System.out.println("Masukkan Edge: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(vertexs[i] + "\t");
            }
            System.out.println();
            
            for (int i = 1; i <= v; i++) {
                System.out.print(vertexs[i] + "\t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error, Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close(); 
    }
}
```
<img src="img/hasil tugas 4b.png">
<img src="img/hasil tugas 4b1.png">
