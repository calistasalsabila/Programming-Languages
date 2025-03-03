#include <stdio.h>

int arraySum (int array [], const int n){
    int sum = 0, *ptr;
    int *const arrayEnd = array + n;

    for( ptr = array ; ptr < arrayEnd ; ptr++) 
        sum += *ptr;
        return sum;
}
void main (void){
    int arraySum (int array [], const int n);
    int values [3] = {0,1,2};
    printf("The sum is %d", arraySum(values,3));
}