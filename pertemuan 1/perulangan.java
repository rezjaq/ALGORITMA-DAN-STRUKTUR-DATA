<<<<<<< HEAD
import java.util.*;
public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nim;
        System.out.println("masukkan NIM anda : ");
        nim = input.nextLong();
        long n = nim%100;
        if(n<10){
            n+=10;
            System.out.println("n : "+n);
        }
        else{
            System.out.println("n : "+n);
        }
        String day[]={"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        for(int i=0; i<n; i++){
            System.out.println("");
            System.out.printf("\n"+day[i%7]);
        }
    }
}
=======
import java.util.*;
public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nim;
        System.out.println("masukkan NIM anda : ");
        nim = input.nextLong();
        long n = nim%100;
        if(n<10){
            n+=10;
            System.out.println("n : "+n);
        }
        else{
            System.out.println("n : "+n);
        }
        String day[]={"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        for(int i=0; i<n; i++){
            System.out.println("");
            System.out.printf("\n"+day[i%7]);
        }
    }
}
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
