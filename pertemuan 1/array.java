public class array {
    public static void main(String[] args) {
        String cabang [] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        int stok [][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        int harga [] = {75000,50000,60000,10000};
        int bunga [] = new int [4];
        int besar = 0;
        int total = 0;
        String cabangTinggi = "";
        int pemasukan [] = new int [4];
        for(int i=0; i<stok.length; i++){
            for(int j=0; j<stok[0].length; j++){
                bunga[i] += stok[i][j];
                pemasukan[i] += stok[i][j]*harga[j];
                if (stok[i][j]>besar) {
                    besar = stok[i][j];
                    cabangTinggi = cabang[i];
                }
            }
            if(i==0){
                System.out.println("bunga yang terjual di cabang "+cabang[0]+" adalah "+bunga[i]);
            }
            else if(i==1){
                System.out.println("bunga yang terjual di cabang "+cabang[1]+" adalah "+bunga[i]);
            }
            else if(i==2){
                System.out.println("bunga yang terjual di cabang "+cabang[2]+" adalah "+bunga[i]);
            }
            total+=pemasukan[i];

        }
        System.out.println("pemasukan yang tertinggi cabang "+cabangTinggi);
        System.out.println("total seluruh pemasukan adalah : "+total);
    }
}
