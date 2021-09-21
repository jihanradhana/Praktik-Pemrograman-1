y = input ("Masukkan nilai dari variabel y yang ingin dioperasikan : ")
z = input ("Masukkan nilai dari variabel x yang ingin dioperasikan : ")

print("Assalamu'alaikum warahmatullahi wabarokatuh") #pembuka
print("Pada tugas kali ini, saya akan membuat suatu Program Python yang bisa membaca dua input nilai", end=" ")
print("dan juga menampilkan hasil dari penjumlahan, pengurangan, perkalian, pembagian serta modulus dari kedua bilangan tersebut.")

hasilTambah = y + z #pertambahan
print("Hasil pertambahan = " + str(hasilTambah)) 

hasilKurang = (int(y) - int (z)) #pengurangan
print("Hasil pengurangan = " + str(hasilKurang)) 

hasilKali = (int(y) * int (z)) #perkalian
print("Hasil perkalian = " + str(hasilKali))

hasilBagi = (int(y) / int (z)) #pembagian
print("Hasil pembagian = " + str(hasilBagi)) 

hasilModulus = (int(y) % int (z)) #modulus
print("Hasil modulus = " + str(hasilModulus)) 

print("Sekian untuk tugas saya kali ini, mohon maaf jika ada kesalahan, terima kasih.") #penutup
print("Wassalamu'alaikum warahmatullahi wabarokatuh")