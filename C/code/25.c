#include <stdio.h>
#include <stdlib.h>

struct item{
    char *itemName;
    int quantity;
    float price;
    float amount;
};

void readItem(struct item *i);
void printItem(struct item *i);

int main(){
    struct item item1 = {NULL, 0, 0.0, 0.0};
    struct item *pItem = NULL;

    pItem = &item1;

    pItem->itemName = (char *)malloc(30*sizeof(char));

    if(pItem == NULL){
        printf("gagal mengalokasikan memori");
    }
    
    readItem(pItem);

    printItem(pItem);

    return 0;
}

void readItem(struct item *i){
    printf("masukkan nama item: ");
    scanf("%s", i->itemName);

    printf("masukkan quantity: ");
    scanf("%d", &i->quantity);

    printf("masukkan harga: ");
    scanf("%f", &i->price);

    i->amount = (float)i->quantity*i->price;

}

void printItem(struct item *i){
    printf("nama item %s\n", i->itemName);
    printf("jumlahnya adalah: %d\n", i->quantity);
    printf("total harganya adalah: %2.f", i->amount);

}