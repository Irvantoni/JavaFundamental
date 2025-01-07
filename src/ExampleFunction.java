public class ExampleFunction {
    public static void main(String[] args) {
        morningGreetings("Ilham", "Batam"); // panggil function nya aja
        System.out.println(luasSegiTiga(30, 10)); // sout function nya, karena di function cuma return doang
        System.out.println(multiply(10, 15));
        System.out.println(hitungKata("saya ganteng"));
        jumlahKata("ilham");
    }

    static void morningGreetings(String nama, String asal) {
        System.out.println("Hello! Good morning " + nama + ", dari " + asal);
    }

    static double luasSegiTiga(double alas, double tinggi) {
        double luas = (alas * tinggi) / 2;
        return luas;
    }

    static int multiply(int angka1, int angka2) {
        int hasil = angka1 * angka2;
        return hasil;
    }

    static int hitungKata(String kata) {
        String[] hitung = kata.split(" ");
        return hitung.length;
    }

    static int jumlahKata(String kalimat) {
        if (kalimat.length() == 0 || kalimat == null || kalimat.isEmpty()) {
            return 0;
        }
        return 0;
    }

    // ilham -> dicek tiap karakter nya, gada spasi, maka itu 1 kata, tapi kalo nemu
    // 1
    // aja spasi, berarti itu 2 kata
}
