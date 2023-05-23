#include<stdio.h>

long long int FastPower(int x, int n){
    if(n==0)
        return 1;
    if(n%2==0){
        return FastPower(x, n / 2) * FastPower(x, n / 2);
    }
    else{
        return x * FastPower(x, n - 1);
    }
}
void solve(){
    int n;
    scanf("%d", &n);
    long long int a[n];
    int zeroCount = 0;
    int oneCount = 0;
    for (int i = 0; i < n; i++)
    {
        scanf("%lld", &a[i]);
        if(a[i]==0){
            zeroCount++;
        }
        if(a[i]==1){
            oneCount++;
        }
    }
    long long int ans;
    long long int selectZero = FastPower(2, zeroCount);
    ans = selectZero * oneCount;
    printf("%lld\n", ans);
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
    return 0;
}
