import java.util.Scanner;

    public class TugasLima {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Silahkan masukkan nama lengkap, NIM, nilai IPK");
            System.out.print("(dengan format dua angka di belakang koma, contoh : 3.71)");
            System.out.println("dan periode Anda menempuh pembelajaran S1 untuk melihat predikat yang berhasil anda raih.");

                System.out.println("Nama Lengkap               : ");
                String namaLengkap = scanner.nextLine();

                System.out.println("Nomor Induk Mahasiswa      : ");
                String nim = scanner.nextLine();

                System.out.println("Nilai IPK                  : ");
                double ipk = scanner.nextDouble();

                System.out.println("Lama belajar (dalam tahun) : " );
                int lamaStudi = scanner.nextInt();

                    System.out.println();
                    System.out.println("PENGUMUMAN HASIL CAPAIAN PREDIKAT LULUSAN S1 TAHUN 2021");
                    System.out.println("Nama                       : " + namaLengkap);
                    System.out.println("Nomor Induk Mahasiswa      : " + nim);
                    System.out.println("IPK                        : " + ipk);
                    System.out.println("Lama belajar (dalam tahun ): ");

                        if (ipk >= 3.51 && ipk <= 4.00 && lamaStudi <= 4) {
                            System.out.println("Selamat! Anda berhasil lulus dengan predikat Pujian Tertinggi (Summa Cumlaude).");
                        }
                        else if (ipk >= 3.51 && ipk <= 4.00){
                            System.out.println("Selamat! Anda berhasil lulus dengan predikat pujian (Cumlaude).");
                        }
                        else if (ipk >= 3.01 && ipk < 3.51){
                            System.out.println("Selamat! Anda berhasil lulus dengan predikat sangat memuaskan.");
                        }
                        else if (ipk >= 2.76 && ipk < 3.01){
                            System.out.println("Selamat! Anda berhasil lulus dengan predikat memuaskan.");
                        }
                        else if (ipk >= 2.00 && ipk < 2.76){
                            System.out.println("Selamat! Anda berhasil lulus dengan predikat cukup.");
                        }
                        else if (ipk < 2.00){
                            System.out.print("Mohon maaf, anda dinyatakan tidak lulus, silahkan mengulang kembali pada periode berikutnya. ");
                            System.out.println("Jangan putus asa dan tetap semangat!");
                        }
                        else {
                            System.out.print("Nilai IPK yang anda masukkan tidak valid. Silahkan mencoba kembali ");
                            System.out.println("dan pastikan nilai yang anda berikan sesuai format.");
                        }
            scanner.close();
        }
}
