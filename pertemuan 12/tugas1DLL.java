public class tugas1DLL {
    NodeTugas1 head;
    int size;
    
    public tugas1DLL(){
        head = null;
        size = 0;    
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addLast(int nomor, String nama){
        if (isEmpty()){
            head = new NodeTugas1(null, nomor, nama, null);
        } else {
            NodeTugas1 current = head;
            while (current.next != null){
                current = current.next;
            }
            NodeTugas1 newTugas1dll = new NodeTugas1(current, nomor, nama, null);
            current.next = newTugas1dll;
            size++;
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            System.out.println(head.nama + " Sudah Divaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null){
            System.out.println(head.nama + " Sudah Divaksin");
            head = null;
            size--;
            return;
        }
        NodeTugas1 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void print(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" DAFTAR PENGANTRI VAKSIN ");
        System.out.println("+++++++++++++++++++++++++"); 
        System.out.println("| No\t| Nama" + "\t\t|");
        if(!isEmpty()){
            NodeTugas1 tmp = head;
            while (tmp != null){
                System.out.print("| " + tmp.nomor + "\t| " + tmp.nama + " " + "\t|\n");
                tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian " + size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
