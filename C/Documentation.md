# Tic-Tac-Toe dalam C

## Deskripsi Program
Program ini adalah implementasi game **Tic-Tac-Toe** menggunakan bahasa pemrograman C. Permainan ini dimainkan oleh dua pemain, di mana masing-masing pemain memilih kotak untuk menempatkan tanda mereka ('X' atau 'O'). Pemain yang berhasil membuat tiga tanda berurutan dalam satu garis (horizontal, vertikal, atau diagonal) akan memenangkan permainan.

## Fitur Program
- **Menampilkan papan permainan**
- **Memproses input pemain**
- **Mengecek status kemenangan atau seri**
- **Menandai kotak dengan simbol pemain ('X' atau 'O')**

## Struktur Kode
Kode ini terdiri dari beberapa fungsi utama:

1. **`main()`**: Mengatur jalannya permainan.
2. **`displaypapan()`**: Menampilkan papan permainan.
3. **`markpapan(char mark)`**: Menempatkan tanda pada kotak yang dipilih pemain.
4. **`cekwinordraw()`**: Mengevaluasi status permainan, apakah ada pemenang atau permainan berakhir seri.

## Kode Program
```c
#include <stdio.h>
#include <stdlib.h>

char posisikotak[10] = { 'o', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
int pilihan = 0, pemain = 0;

int cekwinordraw();
void displaypapan();
void markpapan(char mark);

int main()
{
    int gameStatus = 0;
    char mark = ' ';
    pemain = 1;

    do
    {
        displaypapan();
        pemain = (pemain % 2) ? 1 : 2;

        printf("pemain %d, pilih papan nomor berapa?: ", pemain);
        scanf("%d", &pilihan);

        mark = (pemain == 1) ? 'X' : 'O';
        markpapan(mark);

        gameStatus = cekwinordraw();
        pemain++;
    } while (gameStatus == -1);

    if (gameStatus == 1)
        printf("==>\apemain %d menang ", --pemain);
    else
        printf("==>\aseri atau hasil imbang");

    return 0;
}
```

## Cara Kerja Program
1. **Menampilkan papan permainan**
   - Papan permainan ditampilkan dalam bentuk grid 3x3 dengan angka yang mewakili posisi kosong.

2. **Pemain memilih kotak**
   - Pemain memilih nomor kotak (1-9) untuk menempatkan tanda mereka ('X' atau 'O').

3. **Mengevaluasi hasil permainan**
   - Program memeriksa apakah ada pemain yang menang atau apakah permainan berakhir dengan hasil imbang.

4. **Menampilkan hasil**
   - Jika seorang pemain menang, program akan menampilkan pesan kemenangan.
   - Jika permainan seri, program akan menampilkan pesan "Hasil Imbang".

## Contoh Output
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

## Kesimpulan
Program ini menunjukkan bagaimana game Tic-Tac-Toe dapat diimplementasikan dalam C menggunakan array, fungsi, dan logika kontrol alur permainan. Program ini bisa dikembangkan lebih lanjut dengan fitur seperti antarmuka grafis atau kecerdasan buatan untuk bermain melawan komputer.
