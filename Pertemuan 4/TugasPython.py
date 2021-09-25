#Tugas Pertemuan Ke-Empat Praktik Pemrograman 1
print("Program Python ini bisa membaca dua input nilai", end=" ") #pembuka
print("dan juga menampilkan hasil dari penjumlahan, pengurangan, perkalian, pembagian serta modulus dari kedua bilangan tersebut.")

y = input ("Silahkan masukkan nilai dari variabel y yang ingin dioperasikan : ")
z = input ("SIlahkan masukkan nilai dari variabel x yang ingin dioperasikan : ")


hasilTambah = y + z #pertambahan
print("Pertambahan dari x dan y akan menghasilkan nilai sebesar " + str(hasilTambah)) 

hasilKurang = (int(y) - int (z)) #pengurangan
print("Pengurangan dari x dan y akan menghasilkan nilai sebesar " + str(hasilKurang)) 

hasilKali = (int(y) * int (z)) #perkalian
print("Perkalian dari x dan y akan menghasilkan nilai sebesar " + str(hasilKali))

hasilBagi = (int(y) / int (z)) #pembagian
print("Pembagian dari x dan y akan menghasilkan nilai sebesar " + str(hasilBagi)) 

hasilModulus = (int(y) % int (z)) #modulus
print("Hasil modulus dari nilai x dan y adalah " + str(hasilModulus)) 

