public class limas {
    double panjangSisiAlasLimas, tinggiLimas;
    public limas (double p, double t){
        panjangSisiAlasLimas = p;
        tinggiLimas = t;
    }
    public double hitungLuasPermukaan(){
        double luasAlas = panjangSisiAlasLimas*tinggiLimas;
        double luasSisi =  4*(0.5*panjangSisiAlasLimas*tinggiLimas)/2.0;
        return luasAlas+luasSisi;
    }
    public double hitungVolume(){
        double luasAlas = panjangSisiAlasLimas*panjangSisiAlasLimas;
        return (1.0/3.0)*luasAlas*tinggiLimas;
    }
}
