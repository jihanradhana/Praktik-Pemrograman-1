y = input ("Masukkan nilai dari variabel y yang ingin dioperasikan : ")

z = input ("Masukkan nilai dari variabel x yang ingin dioperasikan :")


hasilTambah = y + z
hasilKurang = (int(y) - int (z))
hasilKali = (int(y) * int (z))
hasilBagi = (int(y) / int (z))
hasilModulus = (int(y) % int (z))


print("Hasil pertambahan = " + str(hasilTambah))
print("Hasil pengurangan = " + str(hasilKurang))
print("Hasil perkalian = " + str(hasilKali))
print("Hasil pembagian = " + str(hasilBagi))
print("Hasil modulus = " + str(hasilModulus))