import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MainMhs {
    String kodeNilai;
    double nilai;
    Mhs mhs;
    MataKuliah mk;
    
    public MainMhs(String kodeNilai, double nilai, Mhs mhs, MataKuliah mk){
        this.kodeNilai = kodeNilai;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
    List<Mhs> mhsA = new ArrayList<>();
    List<MataKuliah> matkulA = new ArrayList<>();
    
    public void tambahMhs(Mhs... Mhs){
        mhsA.addAll(Arrays.asList(Mhs));
    }
    public void tambahMatkul(MataKuliah... matkul){
        matkulA.addAll(Arrays.asList(matkul));
    }
    public void tampilMhs(){
        mhsA.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
        });
    }
    public void tampilMatkul(){
        matkulA.stream().forEach(mk -> {
                System.out.println("" + mk.toString());
        });
    }
    int linearSearchMhs(String nim){
            for(int i = 0; i < mhsA.size(); i++){ 
                if(nim.equals(mhsA.get(i).nim)){
                    return i;
                }
            }
            return -1;
    }
    int linearSearchMatkul(String matkul){
            for(int i = 0; i < matkulA.size(); i++){ 
                if(matkul.equals(matkulA.get(i).kodeMk)){
                    return i;
                }
            }
            return -1;
    }
    Mhs cariMhs(String nim){
        for(int i = 0; i < mhsA.size(); i++){
            if(nim.equals(mhsA.get(i).nim)){
                return mhsA.get(i);
            }
        }
        return null;
    }
    MataKuliah cariMatkul(String matkul){
        for(int i = 0; i < matkulA.size(); i++){
            if(matkul.equals(matkulA.get(i).kodeMk)){
                return matkulA.get(i);
            }
        }
        return null;
    }
    public String toString(int idx1, int idx2){
        return mhsA.get(idx1).nim + "\t" + mhsA.get(idx1).nama + "\t" + matkulA.get(idx2).namaMk + "\t" + matkulA.get(idx2).sks + "\t";
    }
    
    static Comparator<MainMhs> CompNilai = (n1, n2) ->{
        if(n1.nilai < n2.nilai){
            return -1;
        } else if (n1.nilai > (n2).nilai){
            return 1;
        } else {
            return 0;
        }
    };
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        
        List<MainMhs> nill = new ArrayList<>();
        MainMhs n = new MainMhs("", 0, null, null);
        
        Mhs m1 = new Mhs("20001", "Juan", "021xxx");
        Mhs m2 = new Mhs("20002", "Filla", "021xxx");
        Mhs m3 = new Mhs("20003", "Reza", "021xxx");
        Mhs m4 = new Mhs("20004", "Nathan", "021xxx");
        Mhs m5 = new Mhs("20005", "Danuarta", "021xxx");
        Mhs m6 = new Mhs("20006", "Ramadhani", "021xxx");
        
        n.tambahMhs(m1, m2, m3, m4, m5, m6);
        
        MataKuliah mk1 = new MataKuliah("0001", "Internet of Things", 3);
        MataKuliah mk2 = new MataKuliah("0002", "Algoritma dan Struktur Data", 2);
        MataKuliah mk3 = new MataKuliah("0003", "Algoritma dan Pemrograman", 2);
        MataKuliah mk4 = new MataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah mk5 = new MataKuliah("0005", "Algoritma dan Struktur Data", 3);
        
        n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);
        
        MainMhs n1 = null;
        String nimMhs, mkMhs;
        
        int menu = 0;
        do{
            System.out.println("===================================================");
            System.out.println(" Sistem Pengelolahan Data Nilai Mahasiswa Semester ");
            System.out.println("===================================================");
            System.out.println(" 1. Input Nilai");
            System.out.println(" 2. Tampil Nilai");
            System.out.println(" 3. Mencari Nilai Mahasiswa");
            System.out.println(" 4. Urut Data Nilai");
            System.out.println(" 5. Keluar");
            System.out.println("==================================================");
            System.out.print("Pilih\t\t\t\t: ");
            menu = input1.nextInt();
            System.out.println("");
            
            switch(menu){
                case 1 :
                    System.out.print("Kode\t\t\t\t: ");
                    String kd = input.nextLine();
                    System.out.print("Nilai\t\t\t\t: ");
                    double nilMhs = input1.nextDouble();
                    System.out.println("");
                    
                    System.out.println("Daftar Mahasiswa");
                    System.out.println("================");
                    System.out.println("NIM\tNama\t\tNo Telp");
                    n.tampilMhs();
                    System.out.println("----------------");
                    System.out.print("Pilih Mahasiswa by nim\t\t: ");
                    nimMhs = input.nextLine();
                    Mhs mahaSiswas;
                    mahaSiswas = n.cariMhs(nimMhs);
                    
                    System.out.println("");
                    System.out.println("Daftar Mata Kuliah");
                    System.out.println("==================");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    n.tampilMatkul();
                    System.out.println("-------------------");
                    System.out.print("Pilih Mata Kuliah by Kode\t:");
                    mkMhs = input.nextLine();
                    MataKuliah mataKuliahs;
                    mataKuliahs = n.cariMatkul(mkMhs);
                    
                    n1 = new MainMhs(kd, nilMhs, mahaSiswas, mataKuliahs);
                    
                    nill.add(n1);
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Daftar Nilai Mahasiswa");
                    System.out.println("======================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    for(int i=0; i<nill.size(); i++){
                        n.linearSearchMhs(nill.get(i).mhs.nim);
                        n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.println("Daftar Nilai Mahasiswa");
                    System.out.println("======================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    int sks = 0;
                    for(int i=0; i<nill.size(); i++){
                        n.linearSearchMhs(nill.get(i).mhs.nim);
                        n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                    }
                    System.out.println("----------------------");
                    System.out.print("Masukkan Data Mahasiswa NIM\t\t: ");
                    String Input = input.nextLine();
                    System.out.println("");
                    for (int i = 0; i < nill.size(); i++){
                        if(Input.equalsIgnoreCase(nill.get(i).mhs.nim)){
                            sks += n.matkulA.get(i).sks;
                            n.linearSearchMhs(nill.get(i).mhs.nim);
                            n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                            System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk)) + nill.get(i).nilai);    
                        }
                    }
                    System.out.println("---------------------------------");
                    System.out.println("Total SKS " + sks + " Telah Diambil");
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("Daftar Mahasiswa");
                    System.out.println("================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    nill.sort(CompNilai);
                    for (int i = 0; i < nill.size(); i++){
                        n.linearSearchMhs(nill.get(i).mhs.nim);
                        n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk)) + nill.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                    
                case 5:
                    System.out.println("+=============+");
                    System.out.println("+Terima Kasih +");
                    System.out.println("+=============+");
                    break;
            }
        } while (menu < 5 && menu > 0);
    }
}
