# 🎯 Guess the Number Game - Documentation

## 📌 Introduction
This program is a simple **"Guess the Number"** game written in C. The program generates a random number between **1 to 10**, and the player has **three chances** to guess the correct number.

## 🔧 How It Works
- The program initializes a random number using `rand()`.
- The user is prompted to guess a number between **1 and 10**.
- The user gets **three attempts** to guess the number correctly.
- The program provides hints if the guess is too **high** or **low**.
- If the user fails after three attempts, the correct number is revealed.

## 🖥️ Code Breakdown

### 1️⃣ Importing Libraries
```c
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
```
- `stdio.h` → Standard input-output functions (`printf`, `scanf`)
- `stdlib.h` → Used for `rand()` function
- `time.h` → Used to seed `rand()` for better randomness

### 2️⃣ Initializing Variables
```c
int random = 0;
int kesempatan = 0;
int yournumber = 0;
time_t t = 0;
```
- `random` → Stores the randomly generated number
- `kesempatan` → Tracks the remaining attempts
- `yournumber` → Stores the user’s guessed number
- `t` → Used for random seed initialization

### 3️⃣ Generating a Random Number
```c
srand ((unsigned) time (&t));
random = rand() % 11;
```
- `srand(time(&t))` → Seeds the random number generator
- `rand() % 11` → Generates a random number between **0 and 10**

### 4️⃣ Displaying Game Instructions
```c
printf("This is game guess the number");
printf("\nPilih nomor 1-10");
printf("\nHanya ada tiga kesempatan");
```
- Prints the **game instructions** for the user

### 5️⃣ Game Loop (3 Attempts)
```c
for(kesempatan = 3 ; kesempatan > 0 ; --kesempatan ) 
```
- Loops **three times** (3 attempts)
- Decreases `kesempatan` after each guess

### 6️⃣ Getting User Input
```c
printf("kamu punya sisa kesempatan %d ", kesempatan);
printf("\nmasukkan angka yang ingin kamu tebak =    ");
scanf("%d", &yournumber);
```
- Asks user to input a number
- Stores the input in `yournumber`

### 7️⃣ Checking the Guess
```c
if (yournumber == random ) {
    printf("Congrats your number is true :D");
    return 0;
}
```
- If the guess is **correct**, print a success message and exit

### 8️⃣ Handling Incorrect Guesses
```c
else if (yournumber < 0 || yournumber > 10)
    printf ("Masukkan angka 1 - 10");
else if (yournumber > random)
    printf("Nomormu lebih besar daripada jawaban");
else if (yournumber < random)
    printf ("Nomormu lebih kecil dari jawaban");
```
- If input is **out of range**, warn the user
- If guess is **too high**, notify the user
- If guess is **too low**, notify the user

### 9️⃣ Game Over Message
```c
printf("\nFailed");
printf("\nJawaban adalah %d ", random);
```
- If the player **fails all three attempts**, reveal the correct answer

## 🔥 Example Run
```
This is game guess the number
Pilih nomor 1-10
Hanya ada tiga kesempatan
kamu punya sisa kesempatan 3 
masukkan angka yang ingin kamu tebak = 5
Nomormu lebih kecil dari jawaban
kamu punya sisa kesempatan 2 
masukkan angka yang ingin kamu tebak = 8
Nomormu lebih besar daripada jawaban
kamu punya sisa kesempatan 1 
masukkan angka yang ingin kamu tebak = 7
Congrats your number is true :D
```

## 📌 Key Takeaways
- **`rand()`** generates random numbers
- **User input is validated** (must be between 1-10)
- **Loop** ensures the user gets three attempts
- **Game gives hints** to help user guess correctly

🚀 *Enjoy coding and improving this game!* 🎮