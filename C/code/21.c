#include <stdio.h>

struct intPtrs {
    int *p1;
    int *p2;
};

int main() {
    struct intPtrs pointers;  // Variabel struct

    int a = 10, b = 20;
    
    // Menyimpan alamat dari variabel a dan b ke pointer dalam struct
    pointers.p1 = &a;
    pointers.p2 = &b;
    *pointers.p2 = 25;

    // Mengakses nilai yang ditunjuk oleh pointer
    printf("p1 menunjuk ke: %d\n", *pointers.p1);
    printf("p2 menunjuk ke: %d\n", *pointers.p2); //25

    return 0;
}
