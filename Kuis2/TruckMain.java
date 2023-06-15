import java.util.Scanner;
public class TruckMain {
    public static void main(String[] args) {
        TruckQueue newQueue = new TruckQueue();
        TruckStack newStack = new TruckStack();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU KUIS 2 ASD=====");
            System.out.println("1. Daftarkan Truck");
            System.out.println("2. Tumpukan Kayu");
            System.out.println("3. Antrian Truck");
            System.out.println("4. Truck Yang telah mengangku kayu");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nomer Truck: ");
                    int Number = input.nextInt();
                    Truck truck = new Truck(Number);
                    newQueue.enqueue(truck);
                    System.out.println("Truck " + Number + "Telah didaftarkan");
                    break;
                case 2:
                    if (!newQueue.isEmpty()) {
                        Truck dequeuedTruck = newQueue.dequeue();
                        newStack.push(dequeuedTruck);
                        System.out.println("Kayu ditumpuk pada Truck " + dequeuedTruck.getNumber());
                    } else {
                        System.out.println("Truck masih belom ada yang terdaftar.");
                    }
                    break;
                case 3:
                    System.out.println("Antrian Truck saat ini:");
                    newQueue.printQueue();
                    break;
                case 4:
                    System.out.println("Antrian tumpukan kayu saat ini:");
                    newStack.printStack();
                    break;
                case 5:
                    System.out.println("Terimakasih telah menggunakan program ini");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan anda tidak ditemukan");
                    break;
            }

            System.out.println();
        }
    }
}
