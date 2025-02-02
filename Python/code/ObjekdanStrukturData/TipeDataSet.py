"""
-> Introducing Set
- Tipe data bebas

-> Sifat dan Properti Tipe Data Set
- Tipe data set tidak berurutan
- set bersifat mutable
- tidak ada elemen atau data yang sama

-> Set Operation
- Union = menggabungkan set dengan set
- Intersection = menemukan elemen yang sama antar set
- Difference = menemukan elemen yang ada pada set1 tetapi tidak ada pada set2
- Synnetric difference = menemukan elemen elemen yang unik hanya aa di dalam set1 dan hanya ada di dalam set2

-> Set Methods
- Fungsi yang terdapat pada test
- Contoh sintak -> set.nama_method()
- Ex = add (), update(), remove ()

-> Build in Function set () 
- Berfungsi mengkonversi tipe data set 

-> Tipe Data Frozenset
- Perbedaannya adalah dapat menambahkan atau mengurangkan elemen
- Syntax = frozen()
"""

# Syntax
a = {1, 1.2 , 'F'}
print(a)

# Sifat Tipe Data Set
#-> Tidak berurutan 
b = {2, 1}
print(b)

#->  Elemen tidak boleh sama 
c = {1,1}
print(c) #1

# Set Operation
d = {1, 2, 3}
e = {'a', 'b', 'c', 2}

#-> Union -> menggabungkan
print(d.union(e)) #{1, 2, 3, 'c','b', 'a' }
print(d|e) #{1, 2, 3, 'c','b', 'a' }

#-> Intersection -> menemukan elemen yang sama
print(d.intersection(e)) #2
print(d&e) #2

#-> Difference -> menemukan elemen yang hanya ada di set1 
print(d.difference(e)) #1 3
print(d-e) #1 3

#-> Symmetric Difference -> menemukan elemen yang berbeda
print(d.symmetric_difference(e)) #{1, 3, 'c', 'b', 'a'}
print(d^e) #{1, 3, 'c', 'b', 'a'}

# Methods 
f = {1,2}
g = {'a'}

#-> add () -> menambahkan anggota set
f.add(3)
print(f) #{1, 2, 3}

#-> update () -> menambahkan beberapa anggota sekaligus
f.update((4,5,6))
print(f) #{1, 2, 3, 4, 5, 6}

#-> remove () -> menghapus anggota list
g.remove('a')
print(g) # set()

# Build in Function
#-> set() = konversi menjadi tipe data set
h = [1, 2, 3, 3]
print(set(h)) # 1 2 3 

# Tipe Data Frozenset ()
# Immutable (tidak dapat ditambahkan maupun di kurangi)
g = frozenset(h)
print(g) # frozenset({1, 2, 3})







