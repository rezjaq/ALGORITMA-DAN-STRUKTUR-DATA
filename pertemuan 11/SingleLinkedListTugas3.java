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
