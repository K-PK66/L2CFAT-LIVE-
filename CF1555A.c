#include<stdio.h>

void solve(){
    
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        long long int n;
        scanf("%lld", &n);
        long long int result = 0;
        if (n % 2 != 0)
        {
            n++;
        }
        if (n <= 6)
        {
            result = 15;
            printf("%lld\n", result);
            continue;
        }
        long long int s = n / 2;
        result = s * 5;
        printf("%lld\n", result);
    }
}
