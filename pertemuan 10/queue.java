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
