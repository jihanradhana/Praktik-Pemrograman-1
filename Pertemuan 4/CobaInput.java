import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan nama Anda : ");
        String namaLengkap = data.nextLine();

        System.out.print("Masukkan umur Anda : ");
        int umur = data.nextInt();

        System.out.println("Nama saya adalah " + namaLengkap);
        System.out.println("Umur saya " + umur);
    }
}
