/*
TUGAS PROYEK PRAKTIK PEMROGRAMAN 1
Nama   = Jihan Ramadhana
NIM    = 21537144008
Kelas  = J1
Prodi  = S1 Teknologi Informasi
Bahasa = Java
*/


import java.util.Scanner; 
    public class Siakad {
        Mahasiswa[] mahasiswa = new Mahasiswa[1000];
        private int jumlahData = 0;

        public static void main(String[] args) {

            System.out.println();
            Siakad siakad = new Siakad();
            int menu = 0; // deklarasi menu
            while (menu!=5) { //nampilin menu
                menu = displayMenu(); 
                if (menu == 1) { // lihat data
                    siakad.lihatData();
                } else if (menu == 2) {
                    siakad.tambahData();
                } else if (menu == 3 ) {
                    siakad.ratarataIpk();
                } else if (menu == 4) {
                    siakad.ratarataIpk();
                }
            }
        }

        private static int displayMenu() {
            System.out.println();
            System.out.println("Selamat datang di Sistem Informasi Akademik Universitas Negeri Yogyakarta");
            System.out.println("Menu : ");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Rata-rata IPK");
            System.out.println("4. Edit Data");
            System.out.println("5. Keluar");
            System.out.print("Silahkan pilih menu = ");
            Scanner scanMenu = new Scanner (System.in);
            int menu = scanMenu.nextInt();
            return menu;
        }

        private void lihatData() {
            if (jumlahData == 0) {
                System.out.println();
                System.out.println("Data belum ter-input");
            } else {
                System.out.println();
                System.out.println("Data mahasiswa : ");
                for (int i = 0; i < jumlahData; i++) {
                   mahasiswa[i].getDetail();
                }
                System.out.println();
                ratarataIpk();
            }
        }

        private void tambahData() {
            Scanner tambah = new Scanner(System.in);
            System.out.println();

            System.out.print("Masukkan 11 digit NIM                  : ");
            String studID = tambah.nextLine();

            System.out.print("Masukkan nama lengkap Mahasiswa        : ");
            String fullName = tambah.nextLine();

            System.out.print("Masukkan semester Mahasiswa            : ");
            int studSems = tambah.nextInt();

            System.out.print("Masukkan IPK Mahasiswa (contoh = 3.76) : ");
            double gpa  = tambah.nextDouble();

            System.out.print("Masukkan berat badan Mahasiswa         : ");
            double weight = tambah.nextDouble();

            Mahasiswa inputMahasiswa = new Mahasiswa (studID, fullName, studSems, gpa);
            inputMahasiswa.setweight(weight);
            mahasiswa[jumlahData] = inputMahasiswa;

            jumlahData++; // ngasih tau jumlah data naik terus
            lihatData();
        }

        public void cariData() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Masukkan NIM yang ingin dicari =  ");
            String nim = scan.nextLine();
        }
        
        public void ratarataIpk() {
            double totalIpk = 0.0;
            for (int i = 0; i < jumlahData; i++) {
                totalIpk += mahasiswa[i].getgpa();
            }
            double ratarata = totalIpk / jumlahData;

            System.out.println("Rata-rata IPK dari Mahasiswa tersebut adalah : " + ratarata);
        }
    }

