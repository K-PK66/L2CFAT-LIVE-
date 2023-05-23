#include <stdio.h>

int main(){
    char N[4];
    int NInt;
    scanf("%d", &NInt);
    int digit[4]={10,10,10,10};
    int i = 0;
    while (NInt != 0)
    {
        digit[i] = NInt % 10;
        i++;
        NInt /= 10;
    }
    i = 3;
    while(digit[i]==10){
        digit[i] = 0;
        i--;
    }
    printf("%d%d%d%d", digit[3], digit[2], digit[1], digit[0]);
    return 0;
}
