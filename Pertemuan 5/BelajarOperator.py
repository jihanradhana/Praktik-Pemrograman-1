a = input("Masukkan nilai A = ")
b = input("Masukan nilai B =")

print ("A == B " + str(a==b))
print ("A != B " + str(a!=b))
print ("A <= B " + str(a<=b))
print ("A >= B " + str(a>=b))
print ("A < B " + str(a<b))
print ("A > B " + str(a>b))

x = int(a) < 5 and int(b) > 4
print("A < 5 dan B > 4 = " + str(x))
print("A < 5 dan B > 4 = " + str(int (a) < 5 or int(b) > 4))
print("A < 5 dan B > 4 = " + str(not(int(a) < 5)))
