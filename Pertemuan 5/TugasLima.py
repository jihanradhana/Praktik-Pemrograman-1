print("Silahkan masukkan nama, NIM, IPK ", end=" ")
print("(dengan format dua angka di belakang koma, contoh : 3.71)", end=" ")
print("dan waktu lama anda menempuh pembelajaran untuk melihat predikat yang berhasil anda capai.")

namaLengkap = input("Nama Lengkap              : ")

nim = input("Nomor Induk Mahasiswa     : ")

ipk = input("IPK                       : ")
ipk = float(ipk)

lamaStudi = input("Lama belajar (dalam tahun): ")
lamaStudi = float(lamaStudi)

print("PENGUMUMAN HASIL CAPAIAN PREDIKAT LULUSAN S1 TAHUN 2025")
print("Nama                       : " + namaLengkap)
print("NIM                        : " + nim)
print("IPK                        : " + str(ipk))
print("Lama belajar (dalam tahun) : " + str(lamaStudi))

if (ipk >= 3.51 and ipk <= 4.00 and lamaStudi <= 4):
    print("Selamat! Anda berhasil lulus dengan predikat Pujian Tertinggi (Summa Cumlaude).")

elif (ipk >= 3.51 and ipk <= 4.00):
    print("Selamat! Anda berhasil lulus dengan predikat pujian (Cumlaude).")

elif (ipk >= 3.01 and ipk < 3.51):
    print("Selamat! Anda berhasil lulus dengan predikat sangat memuaskan.")

elif(ipk >= 2.76 and ipk < 3.01):
    print("Selamat! Anda berhasil lulus dengan predikat memuaskan.")

elif(ipk >= 2.00 and ipk < 2.76):
    print("Selamat! Anda berhasil lulus dengan predikat cukup.")

elif(ipk < 2.00):
    print("Mohon maaf, anda dinyatakan tidak lulus, silahkan mengulang kembali pada periode berikutnya. ", end=" ")
    print("Jangan putus asa dan tetap semangat!")

else:
    print("Nilai IPK yang anda masukkan tidak valid. Silahkan mencoba kembali ", end=" ")
    print("dan pastikan nilai yang anda berikan sesuai format.")