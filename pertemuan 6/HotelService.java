public class HotelService {
    hotel room [] = new hotel[5];
    int idx;

    void tambah(hotel h){
        if(idx<room.length){
            room[idx] = h;
            idx++;
        }
        else{
            System.out.println("Peringatan data hotel sudah penuh");
        }
    }

    void tampil(){
        for(hotel h : room){
            h.tampilHotel();;
            System.out.println("---------------------------");
        }
    }

    void bubleShort(){
        for(int i=0; i<room.length; i++){
            for(int j=1; j<room.length; j++){
                hotel tmp = room[j];
                room[j] = room[j-1];
                room[j-1] = tmp;
            }
        }
    }

    void bubbleSortAscending(){
    for(int i=0; i<room.length; i++){
        for(int j=1; j<room.length; j++){
            if(room[j].harga < room[j-1].harga){ 
                hotel tmp = room[j];
                room[j] = room[j-1];
                room[j-1] = tmp;
            }
        }
    }
}

    void selectionShort(){
        for(int i=0; i<room.length-1; i++){
            int idxMin = i;
            for(int j=i=1; j<room.length; j++){
                if(room[j].harga < room[idxMin].harga){
                    idxMin = j;
                }
            }
            hotel tmp = room[idxMin];
            room[idxMin] = room[i];
            room[i] = tmp;
        }
    }

    void selectionSortDiscending(){
    for(int i=0; i<room.length-1; i++){
        int idxMax = i;
        for(int j=i+1; j<room.length; j++){ // modifikasi pada bagian ini
            if(room[j].harga > room[idxMax].harga){
                idxMax = j;
            }
        }
        hotel tmp = room[idxMax];
        room[idxMax] = room[i];
        room[i] = tmp;
    }
}
}
