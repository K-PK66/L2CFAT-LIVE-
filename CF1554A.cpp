#include<cstdio>
#include<cmath>
#include<algorithm>
#include<iostream>
using namespace std;

void solve(){
    int n;
    scanf("%d", &n);
    long long int a[n];
    for (int i = 0; i <= n - 1; i++)
    {
        scanf("%lld", &a[i]);
    }
    long long int result = 0;
    for (int i = 0; i <= n - 2; i++)
    {
        result = max(result, a[i] * a[i + 1]);
        
    }
    printf("%lld\n", result);
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
    return 0;
}
