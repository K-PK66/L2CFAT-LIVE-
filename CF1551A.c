#include<stdio.h>

int abs(int n){
    return n >= 0 ? n : -n;
}
void solve(){
    int n;
    scanf("%d", &n);
    long int c1, c2, minDif = 1000000000, dif, minc1, minc2;
    for (c1 = n / 3; c1 <= (n / 3) + 2; c1++)
    {
        for (c2 = n / 3; c2 <= (n / 3) + 2; c2 ++)
        {
            if (c1 + 2 * c2 == n){
                dif = abs(c1 - c2);
                if(dif<minDif){
                    minDif = dif;
                    minc1 = c1;
                    minc2 = c2;
                }
            }
        }
    }
    printf("%ld %ld\n", minc1, minc2);
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
}
