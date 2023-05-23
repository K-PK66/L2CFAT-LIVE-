#include<stdio.h>
#include<math.h>

int main(){
    int t;
    scanf("%d", &t);
    for (int i = 1; i <= t; i++){
        int s;
        scanf("%d", &s);
        int size;
        int tmp = sqrt(s)/1;
        if (tmp*tmp==s){
            size = tmp;
        }
        else{
            size = tmp + 1;
        }
        printf("%d\n", size);
    }
}
