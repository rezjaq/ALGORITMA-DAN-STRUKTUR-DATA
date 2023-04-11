public class kerucut {
    double jari,sisiMiring;
    public kerucut(double j, double sm){
        jari=j;
        sisiMiring=sm;
    }
    public double hitungLuasPermukaan(){
        return Math.PI*jari*(jari+sisiMiring);
    }
    public double hitungVolume(){
        return (1.0*3.0)*Math.PI*jari*jari*(sisiMiring/3.0);
    }
}
