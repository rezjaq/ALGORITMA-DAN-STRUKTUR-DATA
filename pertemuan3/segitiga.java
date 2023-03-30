<<<<<<< HEAD
/**
 * segitiga
 */
public class segitiga {
    public int alas,tinggi;
    public segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungLuas(){
        return (int) (0.5*alas*tinggi);
    }
    public int hitungKeliling(){
        double sisiMiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return (int) (alas+tinggi+sisiMiring);
    }
=======
/**
 * segitiga
 */
public class segitiga {
    public int alas,tinggi;
    public segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungLuas(){
        return (int) (0.5*alas*tinggi);
    }
    public int hitungKeliling(){
        double sisiMiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return (int) (alas+tinggi+sisiMiring);
    }
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
}