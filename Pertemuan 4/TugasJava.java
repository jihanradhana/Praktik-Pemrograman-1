import java.util.Scanner;

public class TugasJava {
    public static void main(String[] args) {
        System.out.println("Assalamu'alaikum warahmatullahi wabarokatuh"); //pembuka
        System.out.print("Pada tugas kali ini, saya akan membuat suatu Program Java yang bisa membaca dua input nilai, "); 
        System.out.println("dan juga menampilkan hasil dari penjumlahan, pengurangan, perkalian, pembagian, serta modulus dari kedua bilangan tersebut.");
        System.out.println("Berikut adalah hasil dari tugas saya.");
        System.out.println();
    
            Scanner j = new Scanner(System.in);
            
            System.out.print("Masukkan nilai dari x : "); 
            double x = j.nextDouble();

            System.out.print("Masukkan nilai dari y : ");
            double y = j.nextDouble();

                double hasilTambah = x + y; //pertambahan
                System.out.println("Pertambahan dari nilai x dan y akan menghasilkan nilai sebesar " + hasilTambah);

                double hasilKurang = x - y; //pengurangan
                System.out.println("Pengurangan dari nilai x dan y akan menghasilkan nilai sebesar " + hasilKurang);

                double hasilKali = x * y; //perkalian
                System.out.println("Perkalian dari nilai x dan y akan menghasilkan nilai sebesar " + hasilKali);

                double hasilBagi = x / y; //pembagian
                System.out.println("Pembagian dari nilai x dan y akan menghasilkan nilai sebesar " + hasilBagi);

                double hasilModulus = x % y; //modulus
                System.out.println("Modulus dari x dan y adalah " +hasilModulus);

        System.out.println(); //penutup
        System.out.println("Sekian untuk tugas saya kali ini, mohon maaf jika ada kesalahan, terima kasih.");
        System.out.println("Wassalamu'alaikum warahmatullahi wabarokatuh");
    }
}