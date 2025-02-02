"""
--> Pengenalan Boolean
    Terdiri dari dua nilai yaitu True dan False
    Syntax = True 
             False
    
--> Built in Function bool ()
    Nilai 0 = False
         != = True
"""

#Operasi dasar dengan boolean

is_sunny = True
is_raining = False

can_go_outside = is_sunny and not is_raining

print("Is it sunny?", is_sunny)
print("Is it raining?", is_raining)
print("Can I go outside?", can_go_outside)

"""
Output
Is it sunny? True
Is it raining? False
Can I go outside? True
"""

#Fungsi mengembalikan boolean
def is_even(number):
    return number % 2 == 0

num = 4
print(f"Is {num} even? {is_even(num)}")

"""
Output
Is 4 even? True
"""

#Penggunaan boolean di if statement
age = 20
has_permission = True

if age >= 18 and has_permission:
    print("You are allowed to enter.")
else:
    print("You are not allowed to enter.")

"""
Output
You are allowed to enter.
"""
