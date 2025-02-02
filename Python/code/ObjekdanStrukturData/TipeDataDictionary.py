"""
-> Syntax 
 {"key" : "value"}

-> Acess the elemen dictionary
 - Menggunakan key
    nama_dict[nama_key]
 - Menggunakan method get
    nama_dict.get(nama_key)

-> Sifat dan Properti Tipe Data Dictionary
 - Key dictionary bersifat unik
 - Valuenya bersifat mutable
 - Dictionary bersifat heterogen

-> Dictionary Methods
 -  Synatx
    dict.nama_method()
 - Example
    keys(), values(), items()

-> Built in Function dict()
 - Mengkonversikan data menjadi tipe data dictionary
 """
# Syntax
# -> Dictionary berisi key dan value
print({1:'a', 2: 'b'})

# -> Value di dalam dictionary dapat berisi apa saja
print({1:[1,2,3], 2:[1,2,3]})

# Acess the elemen
orv = {"nama": ["Kim Dokja", "Reader"], "title":["Demon King of Salvation", "Oldest Dream"]}
print(orv["nama"]) #['Kim Dokja', 'Reader']

# Sifat pada Dictionary
# -> Key bersifat unik tetapi values tidak
print({1:'a', 1:'b'}) #{1: 'b'}
print({1:'a', 2:'a'}) #{1: 'a', 2: 'a'}

# -> Dictionary bersifat mutable
a = {1:'a'}
a[1] = 'b' 
print(a) #{1: 'b'}

# Method
# -> get() = mendapatkan value dictionary pada elemen key tertentu
print(orv.get("title")) #['Demon King of Salvation', 'Oldest Dream'] 

# -> keys() = mengakses semua keys pada dictionary
print(orv.keys()) #dict_keys(['nama', 'title'])

# -> values() = mengakses semua values pada dictionary
print(orv.values()) #dict_values([['Kim Dokja', 'Reader'], ['Demon King of Salvation', 'Oldest Dream']])

# -> dst

# Build in Function
# -> dict() = membuat tipe data dictionary
b = dict()
b["name"] = 'dokja' 
print(b) #{'name': 'dokja'}


