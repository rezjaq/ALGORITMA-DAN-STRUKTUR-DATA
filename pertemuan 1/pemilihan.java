<<<<<<< HEAD
import java.util.Scanner;
class pemilihan{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nilaiHuruf;
        int nilaiTugas,nilaiUts,nilaiUas;
        double total;
        double nilaiAkhir;
        boolean lulus = true;
        System.out.print("input nilai tugas : ");
        nilaiTugas = input.nextInt();
        System.out.print("input nilai uts : ");
        nilaiUts = input.nextInt();
        System.out.print("input nilai uas : ");
        nilaiUas = input.nextInt();
        total = (nilaiTugas*0.2)+(nilaiUts*0.35)+(nilaiUas*0.45);
        if((total<=100)&&(total>80)&&(lulus = true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : A");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<80)&&(total>73)&&(lulus = true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : B+");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<73)&&(total>65)&&(lulus = true)){
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : B");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<65)&&(total>60)&&(lulus=true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : C+");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<60)&&(total>50)&&(lulus=true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : C");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<50)&&(total>39)&&(lulus=false)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : D");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else{
            lulus=false;
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : E");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
    }
=======
import java.util.Scanner;
class pemilihan{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nilaiHuruf;
        int nilaiTugas,nilaiUts,nilaiUas;
        double total;
        double nilaiAkhir;
        boolean lulus = true;
        System.out.print("input nilai tugas : ");
        nilaiTugas = input.nextInt();
        System.out.print("input nilai uts : ");
        nilaiUts = input.nextInt();
        System.out.print("input nilai uas : ");
        nilaiUas = input.nextInt();
        total = (nilaiTugas*0.2)+(nilaiUts*0.35)+(nilaiUas*0.45);
        if((total<=100)&&(total>80)&&(lulus = true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : A");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<80)&&(total>73)&&(lulus = true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : B+");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<73)&&(total>65)&&(lulus = true)){
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : B");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<65)&&(total>60)&&(lulus=true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : C+");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<60)&&(total>50)&&(lulus=true)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : C");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else if ((total<50)&&(total>39)&&(lulus=false)){
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : D");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
        else{
            lulus=false;
            System.out.println("==========");
            System.out.println("nilai akhir anda : "+total);
            System.out.println("nilai huruf anda : E");
            System.out.println("==========");
            System.out.println("Status anda dinyatakan lulus : "+lulus);
        }
    }
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
}