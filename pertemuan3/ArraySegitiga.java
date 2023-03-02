/**
 * ArraySegitiga
 */
import java.util.*;;
public class ArraySegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        segitiga[] sgArray = new segitiga [4];
        
        for(int i=0; i<4; i++){
            sgArray[i] = new segitiga(i, i);
            System.out.println("segitiga ke-"+i);
            System.out.println("masukkan nilai alas : ");
            sgArray[i].alas = input.nextInt();
            System.out.println("masukan nilai tinggi : ");
            sgArray[i].tinggi = input.nextInt();

            System.out.println("luas dari segitiga ke-"+i+" adalah : "+sgArray[i].hitungLuas());
            System.out.println("keliling dari segitiga ke-"+i+" adalah : "+sgArray[i].hitungKeliling());
        }
        
    }
}