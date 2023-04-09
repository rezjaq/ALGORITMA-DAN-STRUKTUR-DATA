public class sum {
    public int elemen;
    public double keuntungan[][];
    public double total;

    sum(int elemen, int bulan){
        this.elemen = elemen;
        this.keuntungan = new double[elemen][bulan];
        this.total = 0 ;
    }

    double totalBF(double arr[][]){
        for(int i=0; i<elemen; i++){
            for(int j=0; j<arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

    double totalDC(double arr[][], int l, int r, int bulan){
        if(l==r){
            double sum = 0;
            for(int i=0; i<bulan; i++) {
                sum += arr[l][i];
            }
            return sum;
        }
        else if(l<r){
            int mid = (l+r)/2;
            double lsum=totalDC(arr, l, mid, bulan);
            double rsum=totalDC(arr, mid+1, r, bulan);
            return lsum+rsum;
        }
        return 0;
    }
}
