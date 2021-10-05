import java.util.Scanner;
    public class TugasSementara {
    public static void main(String[] args) {
        Scanner sSatu = new Scanner (System.in);

        System.out.println("Selamat datang di Program Siakad.");

        System.out.println();
        System.out.println("PROGRAM SIAKAD : ");
        System.out.println("1. Tambah data");
        System.out.println("2. Edit data");
        System.out.println("3. Hapus data");
        System.out.println("4. Lihat data");
        System.out.println("5. Keluar");


        System.out.print("Silahkan pilih salah satu menu : ");
        int pilihanMenu = sSatu.nextInt();
            if (pilihanMenu == 1) {
                System.out.println("Daftar Menu Tambah Data : ");
                System.out.println("1. Tambah data mahasiswa");
                System.out.println("2. Tambah data mata kuliah");
                System.out.println("3. Kembali");
                System.out.print("Silahkan pilih salah satu menu : ");
                int yangDipilih = sSatu.nextInt();

                if (yangDipilih == 1) {
                Scanner sDua = new Scanner (System.in);
                System.out.print("Masukkan nama lengkap Mahasiswa yang ingin anda tambahkan : ");
                String namaMhs = sDua.nextLine();
                System.out.println("Mahasiswa yang anda masukkan adalah " + namaMhs);
                }

                else if (yangDipilih == 2){
                Scanner sTiga = new Scanner (System.in);
                System.out.print("Masukkan mata kuliah yang ingin Anda tambahkan : ");
                String matKul = sTiga.nextLine();
                System.out.println("Mata kuliah yang ingin Anda tambahkan adalah " + matKul);
                }

                else if (yangDipilih == 3) {
                System.out.println("Anda telah kembali ke menu awal.");
                }
            }

            else if (pilihanMenu == 2) {
                System.out.println("Fitur belum tersedia.");
            }else  if (pilihanMenu == 3) {
                System.out.println("Fitur belum tersedia.");
            }else  if (pilihanMenu == 4) {
                System.out.println("Fitur belum tersedia.");
            }else {
                System.out.println("Menu tidak tersedia.");
        }

    }

}

