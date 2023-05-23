#include<stdio.h>
 
int main(){
    int t;
    scanf("%d",&t);
    long long int a, b;
    long long int maxGCD;
    long long int countForMoves, excitement;
    long long int minMove, decreases, increases;
    long long int x;
    for (int i = 1;i<=t;i++){
        scanf("%lld %lld", &a,&b);
        x = a - b;
        increases = 0;
        decreases = 0;
        if(x<0){
            x = -x;
        }
        excitement = x;
        if(x == 0){
            countForMoves = 0;
        }
        else if (x == 1) {
            countForMoves = 0;
        }
        else{
            int more = a/x+1, less = a/x;
            increases = more *x - a;
            decreases = a - less * x;
            minMove = increases<decreases?increases:decreases;
            countForMoves = minMove;
        }
        printf("%lld %lld\n",excitement, countForMoves);
    }
    return 0;
}
