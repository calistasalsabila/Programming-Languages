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