public class mahasiswa {
     String nim;
    String nama;
    String notelp;
    
    public mahasiswa(){
        
    }
    public mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString(){
        return "mahasiswa{" +"nim= "+nim +", nama= "+nama+", notelp= "+notelp+ '}';
    }
}
