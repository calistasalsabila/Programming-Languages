# 📌 Simple Calculator Documentation

## 📖 Introduction

This is a simple calculator program written in Python that provides basic arithmetic operations along with some advanced mathematical functions.

## 🚀 Features

- Addition ➕
- Subtraction ➖
- Multiplication ✖️
- Division ➗
- Exponentiation 🔼
- Square Root 🏗️
- Logarithm (base 10) 🔢
- Trigonometric Functions (Sin, Cos, Tan) 📐

## 🛠️ How to Use

1. Run the program.
2. Choose a number (0 - 10) from the menu.
3. Input the required values.
4. Get the result instantly!

## 📜 Menu Options

| Option | Operation           |
| ------ | ------------------- |
| 1️⃣    | Addition            |
| 2️⃣    | Subtraction         |
| 3️⃣    | Multiplication      |
| 4️⃣    | Division            |
| 5️⃣    | Exponentiation      |
| 6️⃣    | Square Root         |
| 7️⃣    | Logarithm (base 10) |
| 8️⃣    | Sinus Function      |
| 9️⃣    | Cosine Function     |
| 🔟     | Tangent Function    |
| 0️⃣    | Exit Program        |

## 💻 Code Implementation

```python
import math

def kalkulator():
    print("Kalkulator kalkultor an aowkw")
    print("1. Penjumlahan")
    print("2. Pengurangan")
    print("3. Perkalian")
    print("4. Pembagian")
    print("5. Pangkat")
    print("6. Akar Kuadrat")
    print("7. Logaritma (basis 10)")
    print("8. Sinus")
    print("9. Kosinus")
    print("10. Tangen")
    print("0. Keluar")

    while True:
        choose = input("\n Choose number 0 - 10 : ")

        if choose == "0":
            print("Thanks for using this calculatorrr")
            break

        elif choose in ["1", "2", "3", "4", "5"]:
            a = float(input("Masukkan angka pertama: "))
            b = float(input("Masukkan angka kedua: "))
            if choose == "1":
                hasil = a + b
                print(f"Hasil: {a} + {b} = {hasil}")
            elif choose == "2":
                hasil = a - b
                print(f"Hasil: {a} - {b} = {hasil}")
            elif choose == "3":
                hasil = a * b
                print(f"Hasil: {a} * {b} = {hasil}")
            elif choose == "4":
                if b != 0:
                    hasil = a / b
                    print(f"Hasil: {a} ÷ {b} = {hasil}")
                else:
                    print("Error! Pembagian dengan nol tidak diperbolehkan.")
            elif choose == "5":
                hasil = a ** b
                print(f"Hasil: {a}^{b} = {hasil}")

        elif choose == "6":
            a = float(input("Masukkan angka: "))
            if a >= 0:
                hasil = math.sqrt(a)
                print(f"Akar kuadrat dari {a} adalah {hasil}")
            else:
                print("Error! Tidak bisa menghitung akar dari bilangan negatif.")

        elif choose == "7":
            a = float(input("Masukkan angka: "))
            if a > 0:
                hasil = math.log10(a)
                print(f"Logaritma basis 10 dari {a} adalah {hasil}")
            else:
                print("Error! Logaritma hanya bisa dihitung untuk angka positif.")

        elif choose in ["8", "9", "10"]:
            a = float(input("Masukkan sudut dalam derajat: "))
            rad = math.radians(a)
            if choose == "8":
                hasil = math.sin(rad)
                print(f"Sin({a}°) = {hasil}")
            elif choose == "9":
                hasil = math.cos(rad)
                print(f"Cos({a}°) = {hasil}")
            elif choose == "10":
                hasil = math.tan(rad)
                print(f"Tan({a}°) = {hasil}")

        else:
            print("Pilihan tidak valid! Silakan pilih kembali.")

kalkulator()
```

## 🔥 Example Usage

```
Choose number 0 - 10 : 1
Masukkan angka pertama: 5
Masukkan angka kedua: 3
Hasil: 5 + 3 = 8
```

## 📌 Notes

- Ensure that inputs are valid numbers to avoid errors.
- Division by zero is not allowed.
- Trigonometric functions use degree input, but calculations are performed in radians.

## 🎯 Future Improvements

- Add support for more mathematical operations.
- Implement a GUI version.
- Provide more error handling and user-friendly messages.

Enjoy coding! 😃🚀

