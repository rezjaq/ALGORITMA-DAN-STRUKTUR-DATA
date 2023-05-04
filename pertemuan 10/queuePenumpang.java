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
    public void peekRear(){
        if (!IsEmpety()) {
            System.out.println("Elemen terdepan : "+q[rear].nama+" "+q[rear].kotaAsal+" "+q[rear].kotaTujuan+" "+q[rear].jumlahTiket+" "+q[rear].harga);
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
