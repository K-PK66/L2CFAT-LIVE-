#include<stdio.h>

int main(){
    char s[20];
    int i = 0;
    do
    {
        scanf("%c", &s[i]);
        i++;
    } while (s[i - 1] != '\n');
    if(s[i-2]=='t'){
        printf("ist");
    }
    if(s[i-2]=='r'){
        printf("er");
    }
    return 0;
}
