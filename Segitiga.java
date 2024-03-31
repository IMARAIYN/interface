public class Segitiga extends BangunDatar {
    
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi){

        this.alas = alas;
        this.tinggi = tinggi;
    }

    float getLuas(){
        return (float)0.5*alas*tinggi;
    }
}

