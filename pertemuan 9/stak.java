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

}
