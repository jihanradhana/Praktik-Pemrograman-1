//Tugas Pertemuan Ke-Empat Praktik Pemrograman 1
import java.util.Scanner;

public class TugasJava {
    public static void main(String[] args) {
        
        System.out.print("Program Java ini bisa membaca dua input nilai, "); //pembuka
        System.out.println("dan juga menampilkan hasil dari penjumlahan, pengurangan, perkalian, pembagian, serta modulus dari kedua bilangan tersebut.");
        System.out.println();
    
            Scanner j = new Scanner(System.in);
            
            System.out.print("Silahkan masukkan nilai x : "); 
            double x = j.nextDouble();

            System.out.print("Silahkan masukkan nilai y : ");
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
                System.out.println("Modulus dari x dan y adalah " + hasilModulus);

    }
}