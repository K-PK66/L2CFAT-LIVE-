#include <stdio.h>

void solve(){
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i <= n - 1;i++){
        scanf("%d", &a[i]);
        if(i>0){
            a[0] &= a[i];
        }
    }
    printf("%d\n", a[0]);
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
    return 0;
}
