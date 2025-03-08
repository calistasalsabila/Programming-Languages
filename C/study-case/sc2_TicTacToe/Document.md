# 🎮 Tic-Tac-Toe Game in C

## 📌 Introduction
Tic-Tac-Toe is a classic two-player game where players take turns marking spaces on a 3x3 grid. The first player to align three of their marks (horizontally, vertically, or diagonally) wins the game! If all spaces are filled and no player has won, the game ends in a draw.

This documentation explains the C implementation of a **Tic-Tac-Toe** game.

---

## 🛠️ Features
- Two-player gameplay (Player 1: `X`, Player 2: `O`)
- Interactive turn-based system
- Win, draw, and ongoing game state detection
- Clear console display for the game board

---

## 📜 Code Breakdown
### 1️⃣ **Global Variables**
```c
char posisikotak[10] = { 'o', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
int pilihan = 0, pemain = 0;
```
- `posisikotak[10]` stores board positions.
- `pilihan` stores the selected board number.
- `pemain` keeps track of whose turn it is.

---
### 2️⃣ **Game Flow (`main` function)**
```c
int main() {
    int gameStatus = 0;
    char mark = ' ';
    pemain = 1;

    do {
        displaypapan();
        pemain = (pemain % 2) ? 1 : 2;
        printf("pemain %d, pilih papan nomor berapa?: ", pemain);
        scanf("%d", &pilihan);
        mark = (pemain == 1) ? 'X' : 'O';
        markpapan(mark);
        gameStatus = cekwinordraw();
        pemain++;
    } while (gameStatus == -1);

    displaypapan();
    if (gameStatus == 1)
        printf("==> \apemain %d menang! 🎉\n", --pemain);
    else
        printf("==> \aHasil imbang! 🤝\n");

    return 0;
}
```
- Uses a loop to continue the game until a win (`1`) or draw (`0`).
- Alternates turns between Player 1 and Player 2.
- Calls `displaypapan()` to show the board and `markpapan()` to update moves.

---
### 3️⃣ **Check Win or Draw (`cekwinordraw` function)**
```c
int cekwinordraw() {
    if (posisikotak[1] == posisikotak[2] && posisikotak[2] == posisikotak[3]) return 1;
    if (posisikotak[4] == posisikotak[5] && posisikotak[5] == posisikotak[6]) return 1;
    if (posisikotak[7] == posisikotak[8] && posisikotak[8] == posisikotak[9]) return 1;
    if (posisikotak[1] == posisikotak[4] && posisikotak[4] == posisikotak[7]) return 1;
    if (posisikotak[2] == posisikotak[5] && posisikotak[5] == posisikotak[8]) return 1;
    if (posisikotak[3] == posisikotak[6] && posisikotak[6] == posisikotak[9]) return 1;
    if (posisikotak[1] == posisikotak[5] && posisikotak[5] == posisikotak[9]) return 1;
    if (posisikotak[3] == posisikotak[5] && posisikotak[5] == posisikotak[7]) return 1;
    
    for (int i = 1; i <= 9; i++) {
        if (posisikotak[i] == ('0' + i)) return -1;
    }
    return 0;
}
```
- Checks all possible win conditions (rows, columns, diagonals).
- If no moves left, returns `0` for a **draw**.
- If no winner yet, returns `-1` to **continue the game**.

---
### 4️⃣ **Display Board (`displaypapan` function)**
```c
void displaypapan() {
    system("cls");
    printf("\n\n\tTic Tac Toe\n\n");
    printf("pemain 1 (X)  -  pemain 2 (O)\n\n\n");
    printf("     |     |     \n");
    printf("  %c  |  %c  |  %c \n", posisikotak[1], posisikotak[2], posisikotak[3]);
    printf("_____|_____|_____\n");
    printf("     |     |     \n");
    printf("  %c  |  %c  |  %c \n", posisikotak[4], posisikotak[5], posisikotak[6]);
    printf("_____|_____|_____\n");
    printf("     |     |     \n");
    printf("  %c  |  %c  |  %c \n", posisikotak[7], posisikotak[8], posisikotak[9]);
    printf("     |     |     \n\n");
}
```
- Prints the **game board** dynamically with updated marks.

---
### 5️⃣ **Marking Board (`markpapan` function)**
```c
void markpapan(char mark) {
    if (posisikotak[pilihan] == ('0' + pilihan)) {
        posisikotak[pilihan] = mark;
    } else {
        printf("Nomor sudah terisi! Coba lagi.\n");
        pemain--;
        getchar();
    }
}
```
- Places the `X` or `O` mark on the chosen position.
- Checks if the space is already occupied.

---
## 🎯 Example Gameplay
```
Tic Tac Toe

pemain 1 (X)  -  pemain 2 (O)

     |     |     
  1  |  2  |  3  
_____|_____|_____
     |     |     
  4  |  5  |  6  
_____|_____|_____
     |     |     
  7  |  8  |  9  
     |     |     

pemain 1, pilih papan nomor berapa?: 5
```
Game continues until someone wins or the game ends in a draw.

---
## 🏁 Conclusion
✅ This program is a simple **console-based** Tic-Tac-Toe game.
✅ Players take turns, and the game determines a **win**, **draw**, or **continue playing**.
✅ You can modify the board size or add an AI opponent for more challenges!

---
💡 **Next Steps:** Try adding a **computer AI** player or making a **graphical version**! 🚀🎨