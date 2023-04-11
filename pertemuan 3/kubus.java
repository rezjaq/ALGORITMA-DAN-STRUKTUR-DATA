class kubus{
    public int sisi ;
    public kubus(int s){
        sisi = s;
    }
    public int hitungVolume(){
        return sisi*sisi*sisi;
    }
    public int hitungLuasPermukaan(){
        return 6*sisi*sisi;
    }
}