#include<stdio.h>
int abs(int a){
    return a > 0 ? a : -a;
}
void solve(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    int Duration1 = 0, Duration2 = 0;
    int baseC = c / 2;
    Duration1 += 3 * (baseC + c % 2);
    Duration2 += 3 * baseC;
    int minDuration = Duration1 < Duration2 ? Duration1 : Duration2;
    int maxDuration = Duration1 > Duration2 ? Duration1 : Duration2;
    int fillDemand = abs(minDuration - maxDuration) == 0 ? 0 : 1;
    minDuration += fillDemand * 2;
    b -= fillDemand;
    int baseB = b / 2;
    minDuration += 2 * (baseB + b % 2);
    maxDuration += 2 * baseB;
    int realMinDuration = minDuration < maxDuration ? minDuration : maxDuration;
    int realMaxDuration = minDuration > maxDuration ? minDuration : maxDuration;
    fillDemand = abs(realMinDuration - realMaxDuration) == 0 ? 0 : 1;
    realMinDuration += fillDemand;
    a -= fillDemand;
    int baseA = a / 2;
    realMinDuration += (baseA + a % 2);
    realMaxDuration += baseA;
    int ans = abs(realMinDuration - realMaxDuration);
    printf("%d\n", ans);
}
int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
    return 0;
}
