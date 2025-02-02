print("Hello, World")

name = "Otosaka Yuu"
age = 15 
score = 9.99

print("the name of the main character in anime charlotte is %s"%(name))
print("the age of the mc is %d"%(age))
print("%s's score is %1.2f"%(name, score))
print("%s, %d, %1.3f "%(name, age, score))


"""
-> Escape Characters
    \n --> new line
    \t --> tab
    \\ --> backslash
    \' --> single quote
    \" --> double quote
    \r --> memindahkan kursor ke awal baris (carriage return)
    \b --> menghapus karakter sebelumnya
    dst

-> String formatting
    modulo ( % )
    string ( %s atau %r ) ; %r -> jadi ada petiknya
    integer ( %d )
    float ( %width.pression f)
"""
# Format
nama ="Fang"
teman = "Oboi"
print("Namanya adalah {}, {}'s friend".format(nama, teman))
#{} 1st -> Fang ; {} 2nd -> Oboi

# Index
print("Namanya adalah {1}, {0}'s friend".format(nama, teman))
#{} 1st -> Oboi ; {} 2nd -> Fang
print("{1} {0} {1}".format(nama, teman))
# Oboi Fang Oboi

#Keywoard
print("Namanya adalah {a}, {b}'s friend".format(a = nama, b =teman))
# Fang Oboi

#Sintak {value:width.precison f}
nama = "Otosaka Shunsuke"
nilai = 9.7
average = 9.2

print("The score is {c:2.1f} and the average is {d:2.1f}".format(c = nilai, d = average))

#Variabel
print(f'{nama} is smart')
print(f'nilai is {nilai:2.1f} and average is {average:2.1f}')



