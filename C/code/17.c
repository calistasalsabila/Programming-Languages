#include <stdio.h>

struct employe{
    char name [12];
    int hireDate;
    float salary;
    
};

int main(){
    struct employe satu = {"Dokja", 12, 22.5};
    printf("%s, %d, %.2f", satu.name, satu.hireDate, satu.salary);
    return 0;
}