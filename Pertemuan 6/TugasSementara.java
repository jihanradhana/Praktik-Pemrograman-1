import java.util.Scanner;
    public class TugasSementara {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Selamat datang di Program Siakad.");

        System.out.println();
        System.out.println("MENU SIAKAD : ");
        System.out.println("1. Tambah Data");
        System.out.println("2. Edit Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");

        System.out.println("Silahkan pilih salah satu menu : ");
        int pilihanMenu = s.nextInt();
            if (pilihanMenu == 1) {
                System.out.println("Silahkan pilih menu antara nomor 1 - 4 :");
                int yangDipilih = s.nextInt();

                if (yangDipilih == 1){
                Scanner sSatu = new Scanner (System.in);
                System.out.print("Masukkan nama lengkap Mahasiswa yang ingin anda tambahkan : ");
                String namaMhs = sSatu.nextLine();
                System.out.println("Mahasiswa yang anda masukkan " + namaMhs);
                }

                else if (yangDipilih == 2){
                Scanner sDua = new Scanner (System.in);
                System.out.print("Masukkan mata kuliah yang ingin Anda tambahkan : ");
                String matKul = sDua.nextLine();
                System.out.println("Mata kuliah yang ingin anda tambahkan adalah " + matKul);
                }

                else if (yangDipilih == 3) {
                System.out.println("Anda telah kembali ke menu. Terima kasih telah mengunjungi SIAKAD.");
                }
            }
            else if (pilihanMenu == 2) {
                System.out.println("Fitur belum tersedia.");
            }

            else  if (pilihanMenu == 3) {
                System.out.println("Fitur belum tersedia.");
            }

            else  if (pilihanMenu == 4) {
                System.out.println("Fitur belum tersedia.");
            }
            
            else {
                System.out.println("Menu tidak tersedia.");
            }

            }

    }

