
public class BelajarMethod {
    public static void main(String[] args) {
        String teks = tambahKata("kalimat awal");
        System.out.println(teks);
        String teksDuaparameter = tambahKataDuaParameter("kalimat awal ", "kalimat kedua");
        System.out.println(teksDuaparameter);
    }

    public static void menampilkanTeks() {
        System.out.println("Halo");
        System.out.println("Selamat pagi");
        System.out.println("Saya sedang");
        System.out.println("mencoba");
    }

    public static void cobacoba() {
        System.out.println("Menampilkan teks yang lain");
    }

    public static void teksDenganParameter(String nama) {
        System.out.println("Nama anda adalah");   
    }

    public static String tambahKata(String kataAwal) {
        String kalimat = "Ini adalah kalimat tambahan dari " + kataAwal;
        return kalimat; 
    }

    public static String tambahKataDuaParameter(String katapertama, String katakedua) {
        String kalimat = "Ini adalah kalimat tambahan " + katapertama + katakedua;
        return kalimat;   
    }
}
