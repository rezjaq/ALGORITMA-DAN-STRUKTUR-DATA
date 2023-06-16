public class NodeTugas1 {
    int nomor;
    String nama;
    
    NodeTugas1 prev, next;
    
    NodeTugas1(NodeTugas1 prev, int nomor, String nama, NodeTugas1 next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
