# -> Syntax
# tuple.nama_method

# Tuple dengan satu tipe data
a = (1,2,3)
print(a)

# Tuple dengan tipe data objek yang berbeda
b = (1, 2, "tiga", [4])
print(b)

# Nested Tuple
c = (1, (2,3), 4)
print(c)

# -> Sifat dan Properti Tipe Data Tuple
d = (1,2,3,4,5)

# Indexing dan Slicing
print(d[0]) #1
print(d[1:4]) #2 3 4

# Tuple bersifat immutable -> nilai indeknya tidak dapat di ubah

# Concatenation and Multiplication
e = (1,2,3)
f = (4,5,6)
print(e+f) #(1, 2, 3, 4, 5, 6) 
print(e*2) #(1, 2, 3, 1, 2, 3)

# -> Method Tuple
# Count -> menghitung jumlah data tertentu dalam tuple
g = (1,1,2,3,4,5,6,7,7)
print(g.count(7)) #2

# Index -> mengembalikan index dari data tertentu
h = (1,2,3)
print(h.index(2)) #1

# -> Build in Function
i = [4, 5, 6]
print(tuple(i))




