public class sortMain {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        mergeSorting mrg = new mergeSorting();
        System.out.println("Data awal");
        mrg.printArray(data);
        mrg.margeSort(data);
        System.out.println("Setelah terurut");
        mrg.printArray(data);
    }
}
