#include<stdio.h>

int main(){
    int N, P;
    scanf("%d %d", &N, &P);
    int a[N];
    int FailCount = 0, Success = 0;
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &a[i]);
        if(a[i]>=P){
            Success++;
        }
        else{
            FailCount++;
        }
    }
    printf("%d", FailCount);
    return 0;
}
