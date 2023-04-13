import java.security.Key;

class uts{
    public void insertionSort(int [] arr){
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = temp;
        }
    }
    public int sequentialSearch(int [] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}