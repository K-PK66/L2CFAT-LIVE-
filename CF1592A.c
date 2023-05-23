#include <stdio.h>

void solve()
{
    int n;
    int H;
    scanf("%d %d", &n, &H);
    int a[n];
    int FirMax = 0, SecMax = 0;
    for (int i = 0; i <= n - 1; i++)
    {
        scanf("%d", &a[i]);
        if(a[i]>FirMax){
            SecMax = FirMax;
            FirMax = a[i];
        }
        else if(a[i]>SecMax){
            SecMax = a[i];
        }
    }
    int weaponCount = 0;
    int flag;
    flag = H % (FirMax + SecMax);
    if(flag==0){
        weaponCount = H / (FirMax + SecMax);
        weaponCount *= 2;
    }
    else{
        weaponCount = 2 * (H / (FirMax + SecMax));
        H -= weaponCount * (FirMax + SecMax) / 2;
        if(H-FirMax<=0){
            weaponCount++;
        }
        else{
            weaponCount += 2;
        }
    }
    printf("%d\n", weaponCount);
}
int main()
{
    int t;
    scanf("%d", &t);
    while (t--)
    {
        solve();
    }
    return 0;
}
