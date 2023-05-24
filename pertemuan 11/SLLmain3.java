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
