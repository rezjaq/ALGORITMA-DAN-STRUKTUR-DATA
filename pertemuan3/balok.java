class balok{
    public int panjang,lebar,tinggi;

    public balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungLuas(){
        return panjang*lebar*tinggi;
    }
}