<<<<<<< HEAD
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
=======
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
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
