#include <stdio.h>

struct date {
    int year;
    int month;
    int day;
};
int main(){

struct date today, *dateptr;

dateptr = &today;

dateptr-> year = 25;
dateptr-> month = 3;
dateptr-> day = 7;

printf("%d/%d/%d", dateptr->day, dateptr->month,dateptr->year);

return 0;

}
