public class Main_BangunDatar {
    public static void main(String[] args) {
        BangunDatar segitiga = new Segitiga(12,20);
        BangunDatar lingkaran = new Lingkaran(60);

        System.out.println("Luas dari Bangun Datar segitiga :"+ segitiga.getLuas());
        System.out.println("Luas dari Bangun Datar lingkaran :"+ lingkaran.getLuas());
    }
}
