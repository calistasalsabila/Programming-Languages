"""
--> Syntax
    - Petik satu ('...')
    - Petik dua  ("...")
"""
nama = "Kim Dokja"
title = 'The King of No Killing '

print(nama, title)

"""
--> Sifat data string
    - String bersifat berurutan berdasarkan undexnya
    - Terdapat indexing dan slicing
        -> indexing
            - Mengambil nilai dengan index
             ex : Python
             -> 0 1 2 3 4 5 
             -> -6 -5 -4 -3 -2 -1
            - Mengambil nilai string pada index ke-i dengann menggunakan []
        -> slicing 
             - Mengambil potongan nilai pada data sequential
             - Slicing/irisan dilakukan dengan [] kemudian index dari irisannya [start:stop:step]
"""
#indexing
mc = "Kim Dokja"
print(mc[2]) 
print (mc[-1])
# m a

#slicing [start:stop:step]
anothermc = "Sung Jin woo"
print(anothermc [0:4])
#output sung

print(anothermc[5:12])
#output Jin woo

print(anothermc[5:])
#Output Jin woo

print(anothermc[:12])
#Output Sung Jin woo

print(anothermc[:])
#Output Sung Jin woo

print(anothermc[:4:2])
#Output Sn

print(anothermc[::3])
#Output Sgiw

print(anothermc[::-1])
#Output oow niJ gnuS

#String bersifat immutable (nilai pada indexnya tidak dapat diubah)
titleanothermc = "Shadow Monarch"
print(titleanothermc[0])
#outputnya S
'''
titleanothermc [o] = N
Eror
'''

#Concatenation and Multiplication
#Concatenation
nama = " Cale"
nama += " Henituse"
print(nama)
#Output Cale Henituse

#Multiplication
print(nama*10)