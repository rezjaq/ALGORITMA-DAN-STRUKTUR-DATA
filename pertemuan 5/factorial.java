class factorial {
    public int nilai;

    public int factorialBF(int n){
        // int faktor = 1;
        // for(int i=1; i<=n; i++){
        //     faktor *= i;
        // }
        // return faktor;
        int faktor = 1;
        int i = 1;
        while (i <= n) {
            faktor *= i;
            i++;
        }
        return faktor;
    }
    
    public int factorDC(int n){
        if(n==1){
            return 1;
        }
        else{
            int factor = n*factorDC(n-1);
            return factor;
        }
    }
}