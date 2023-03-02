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
}