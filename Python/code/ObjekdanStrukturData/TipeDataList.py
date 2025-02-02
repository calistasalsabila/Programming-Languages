# --> Syntax

# List dengan tipe satu data
angka = [1,2,3,4,5]
print(angka)

# List dengan tipe data berbeda
number = [1,2,3, "four", "five"]
print(number)

# Nested list
chiffre = [1,[2,3],2,3,4,5]
print(chiffre)

# --> Sifat dan Properti Data List
a = [1,2,3]
b = [4,5,6]

# List bersifat berurutan, dapat dilakukan indexing, slicing, concantenating, dan multiplication
print(a[-1]) #3
print(b[:2]) # 4 5 

# List bersifat mutable ; dapat berubah ubah
a[0] = "satu"
print(a) #['satu', 2, 3]

# List dengan list (concantenation)
print(a+b) # ['satu', 2, 3, 4, 5, 6]

# List dengan Multiplication
print(b*2) #[4,5,6, 4, 5, 6]

# --> Metode

# Append -> menambahkan anggota list + berlaku juga untuk tipe data string
c = [1,3,5]
c.append(7)
print(c) #[1,3,5,7]
print(c.append(7)) #none

# Sort -> mengurutkan anggota list
d = [7, 1, 3]
d.sort()
print(d) #[1,3,7]
d.sort(reverse=True)
print(d) #[7,3,1]

# Reverse -> reverse urutan anggota list
e = ['b', 'd', 'a', 'c', 'e']
e.reverse()
print(e)

# Clear -> menghapus semua anggota list
f = [3, 2, 1]
f.clear()
print(f) #[]

# Pop -> mengembalikan dan menghapus list dengan indeks ke-i
g = [7, 8, 9]
print(g.pop(1)) #8
print(g) #[7, 9]

# Build in Function List

#Konversi menjadi tipe data list
h = (1,2) 
print(list(h)) #[1,2]

i = "dokja"
print(list(i)) #['d', 'o', 'k', 'j', 'a']

# Max -> mengambil nilai maximal
j = [1,2,3]
print(max(j)) #3

# Min -> mengambil nilai minimal
print(min(j)) #1

# type (), len (), print (), dst.
