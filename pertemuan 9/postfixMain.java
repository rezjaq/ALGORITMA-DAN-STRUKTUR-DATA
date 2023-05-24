import java.util.*;
public class postfixMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String p,q;
        System.out.println("Masukkan ekpresi matematika (infinix) : ");
        q = input.nextLine();
        q = q.trim();
        q = q+")";

        int total = q.length();
        postfix post = new postfix(total);
        p = post.konversi(q);
        System.out.println("Postfix : "+p);
    }
    
    
}
