public class pencarianmhs {
    mahasiswa listMhs [] = new mahasiswa[5];
    int idx;

    void tambah(mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }
    void merge(int left, int mid, int right) {
        mahasiswa[] temp = new mahasiswa[listMhs.length];
        for (int i = left; i <= right; i++) {
            temp[i] = listMhs[i];
        }

        int a = left;
        int b = mid + 1;
        int c = left;

        while (a <= mid && b <= right) {
            if (temp[a].nim <= temp[b].nim) {
                listMhs[c] = temp[b];
                a++;
            } else {
                listMhs[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= mid) {
            listMhs[c] = temp[a];
            a++;
            c++;
        }

        while (b <= right) {
            listMhs[c] = temp[b];
            b++;
            c++;
        }
    }    
    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }
            else if(listMhs[mid].nim > cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    public int findSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public int findSeqSearchString(String cari){
        int posisi = -1;
        int counter = 0;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nama.equalsIgnoreCase(cari)){
                if(posisi == -1) {
                    posisi = j;
                }
                counter++;
            }
        }
        if(counter > 1) {
            System.out.println("Ditemukan " + counter + " mahasiswa dengan nama " + cari);
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data: "+x+" ditemukan pada indeks ke-"+pos);
        }
        else{
            System.out.println("data "+x+"tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Nim\t : "+x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        }
        else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
}

