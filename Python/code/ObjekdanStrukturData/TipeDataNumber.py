"""
--> Syntax Numbers
    Integer = 12, 0, -3
    Float   = 2.1, -3.9
    Complex = 2 + 4j, -7 + 6j

--> Operasi Aritmatika pada Numbers
    - Penjumlahan ( + )
    - Pengurangan ( - )
    - Pembagian   ( / )
    - Perkalian   ( * )
    - Pembagian dengan pembulatan ke bawah ( // )
    - Modulo      ( % )
    - Perpangkatan ( ** )

--> Built in Function untuk Number
    int ()      = Konversi nilai menjadi integer
    float ()    = Konversi nilai menjadi float
    complex ()  = Konversi nilai menjadi data complex
    abs ()      = Menghasilkan nilai absolut
    round ()    = Melakukan pembulatan
    -> syntax   = round(number, ndigits) 

"""
#Konversi nilai
a = "4"
a = int (a)
a = a + 7
print(a) 

b = "3.14"
b = float (b)
b = b / 3.14
print(b)

c = complex(2,4)
print(c)
#Outputnya 2 + 4j

#Absolute Value 
d = abs(-5)
print(d)
#5

#Pembulatan
e = round(9.91)
print(e)
#10

f = round(9.123, 2)
print(f)
#9.12




