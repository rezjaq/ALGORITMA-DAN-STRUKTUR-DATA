import java.util.*;
public class MainMhs {
    public static void menu(){
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. Cari index mahasiswa menggunakan nim");
        System.out.println("7. Cek data mahasiswa bedasarkan antrian ");
        System.out.println("8. Hapus Antrian");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        queueMhs ngantri = new queueMhs(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt(); 
            switch (pilih) {
                case 1:
                    System.out.print("Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("NIM Mahasiswa : ");
                    String nim = input.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    Double ipk = sc.nextDouble();
                    mahasiswa m = new mahasiswa(nama, nim, absen, ipk);
                    sc.nextLine();
                    ngantri.enqueue(m);
                    break;
                case 2:
                    mahasiswa data = ngantri.denqueue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) &&!"".equals(data.absen) && data.ipk !=0){
                        System.out.println("Antrian yang keluar : " + data.nim+ " "+ data.nama+" "+ data.absen+" "+data.ipk);
                    }
                case 3:
                   ngantri.peek();
                    break;
                case 4:
                    ngantri.print();
                    break;
                case 5:
                    ngantri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nim Mahasiswa :");
                    String ni = input.nextLine();
                    ngantri.peekPosition(ni);
                    break;
                case 7:
                    System.out.print("Masukkan indeks Antrian yang akan dicek\t:");
                    int posisi = sc.nextInt();
                    ngantri.printMahasiswa(posisi);
                    break;
                case 8:
                    ngantri.clear();
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }

}
