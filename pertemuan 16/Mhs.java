public class Mhs {
    String nim, nama, noTelp;
    
    public Mhs(){
        
    }
    public Mhs(String nim, String nama, String noTelp){
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }
    @Override
    public String toString(){
        return String.format("%s\t%-15s\t%s", nim, nama, noTelp);
    }
}
