import java.util.*;
class ArrayObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan jumlah persegi : ");
        int n = input.nextInt();
        PersegiPanjang [] ppArray = new PersegiPanjang [3];
        for(int i=0; i<n; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("Masukkan panjang : ");
            ppArray[i].panjang = input.nextInt();
            System.out.println("Masukkan lebar : ");
            ppArray[i].lebar = input.nextInt();

            System.out.println("Persegi panjang ke-"+i);
            System.out.println("panjang : "+ppArray[i].panjang+", lebar : "+ppArray[i].lebar);
            System.out.println();
        }
        // ppArray[0] = new PersegiPanjang();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new PersegiPanjang();
        // ppArray[1].panjang = 60;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new PersegiPanjang();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        // System.out.println("Persegi Panjang ke-0, panjang : "+ppArray[0].panjang+" ,lebar : "+ppArray[0].lebar);
        // System.out.println("Persegi Panjang ke-1, panjang : "+ppArray[1].panjang+" ,lebar : "+ppArray[1].lebar);
        // System.out.println("Persegi Panjang ke-2, panjang : "+ppArray[2].panjang+" ,lebar : "+ppArray[2].lebar);
    }
}