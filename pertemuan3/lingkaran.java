public class lingkaran {
    double jari;
    public lingkaran(double j){
        jari = j;
    }
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }
    public double hitungVolume() {
        return (4.0/3.0) * Math.PI * jari * jari * jari;
    }
}
