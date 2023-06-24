import java.util.Scanner;

public class graphMain {
    public static void main(String[] args) throws Exception {
    //     graph grp = new graph(6);
    
    //     grp.addEdge(0, 1);
    //     grp.addEdge(0, 4);
    //     grp.addEdge(1, 2);
    //     grp.addEdge(1, 3);
    //     grp.addEdge(1, 4);
    //     grp.addEdge(2, 3);
    //     grp.addEdge(3, 4);
    //     grp.addEdge(3, 0);
    
    //     grp.removeEdge(1, 2);
    //     grp.printGraph();
    
    //     grp.degree(2);
    //     System.out.println("");
    //     grp.printGraph();
    // }
     Scanner sc = new Scanner(System.in);
        int vertex, edge, source, destination;
        graph grp = new graph(6);
    
        System.out.print("Masukkan Vertex\t\t: ");
        vertex = sc.nextInt();
    
        System.out.print("Masukkan Edge\t\t: ");
        edge = sc.nextInt();
    
        int menu;
        do{
            System.out.println("Pilihan Menu");
            System.out.println("1. Directed(Tugas Praktikum 1)");
            System.out.println("2. Undirected(Tugas Praktikum 2");
            System.out.print("Masukkan Menu : ");
            menu = sc.nextInt();
        
            if(menu == 1){
                
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
        
                    grp.addEdge(source, destination);
                }
                System.out.println("");
                grp.printGraph();
            }else if(menu == 2){
            
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
        
                    grp.graphType(source, destination);
                }
            }
        }while (menu != 1 && menu != 2);
    }
}
