import java.util.Scanner;

public class graph4A<T> {
    T[] vertex;
    linkedList4A list[];

    public graph4A(T[] vertex) {
        this.vertex = vertex;
        list = new linkedList4A[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new linkedList4A();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + vertex[source] + " : " + list[source].size());

        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    totalIn++;
                }
            }
        }
        totalOut = list[source].size();
        System.out.println("Indegree dari vertex " + vertex[source] + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + vertex[source] + " : " + totalOut);
        System.out.println("Degree vertex " + vertex[source] + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        list[source].remove(destination);
        list[destination].remove(source);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("graph4A berhasil dikosongkan");
    }

    public void printgraph4A() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + vertex[i] + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    boolean graph4AType(int source, int destination) {
        list[source].addFirst(destination);
        return true;
    }
}