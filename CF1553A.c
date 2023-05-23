#include <stdio.h>

void solve(){
    int n;
    scanf("%d", &n);
    int result;
    result = (n + 1) / 10;
    printf("%d\n", result);
}
int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
    return 0;
}
