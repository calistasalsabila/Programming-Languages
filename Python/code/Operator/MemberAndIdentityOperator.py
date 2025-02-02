"""
-> Member Operators 
    - Mengetahui nilai tertentu berada dalam objek tertentu 
    - Menghasilkan nilai boolean
    - in 
    - not in
-> Identity Operators
    - Mengetahui apakah dua nilai tertentu merupakan objek yang sama di dalam 'memori'
    - is
    - is not
"""
# Operator Keanggotaan 
a = [1, 2, 3]
#-> In
print(1 in a) #True

#-> Not In
print(2 not in a) #False

# Operator Identitas
b = [1,2,3]
c = [1,2,3]
d = b
#-> Is
print(b is b) #True
print(c is b) #False  

#-> Is Not
print(d is not b) #False


