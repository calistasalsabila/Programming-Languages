#include <stdio.h>

struct date
{
    int day;
    int month;
    int year;
};
int main(){
    struct date today1 [5] = {{3,3,2025}, {2,2,2025}, {1,1, 2025}};
    struct date today2 [5] = { [2] = {28,2,2025}};
    struct date today3 [5] = {[1].month = 12, [1].day = 30};

    printf("tanggal %d/%d/%d", today1[0].day, today1[1].month, today1[0].year); //3/2/2025
    printf("\ntanggal %d/%d/%d", today2[2].day, today2[2].month, today2[2].year); //28/2/2025
    printf("\ntanggal %d/%d/%d", today3[1].day, today3[1].month, today3[0].year); //30/12/0

    return 0;
}


