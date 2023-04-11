public class daftarMhs {
    mahasiswa listMhs[] = new mahasiswa [5];
    int idx;
    
    void tambah( mahasiswa m ){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("peringatan data sudah penuh!!");
        }
    }
    void tampil(){
        for(mahasiswa m : listMhs ){
            m.tampil();
            System.out.println("------------------");
        }
    }
    void bubleShort(){
        for(int i =0 ; i<listMhs.length; i++){
            for(int j=1; j<listMhs.length; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp; 
                }
            }
        }
    }
    void selectionShort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSortDescending(){
        for(int i=0; i<listMhs.length; i++){
            mahasiswa temp = listMhs[i];
            int j=i-1;
            while(j >= 0 && listMhs[j].ipk < temp.ipk){
                listMhs[j+1] = listMhs[j];
                j--;
            }
            listMhs[j+1]=temp;
        }
    }
}
