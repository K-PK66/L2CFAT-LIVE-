#include<stdio.h>
#include<iostream>
#include<algorithm>
#include<iomanip>

using namespace std;
void solve()
{
    
}
int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        int W, H;
        scanf("%d %d", &W, &H);
        int x1, y1, x2, y2;
        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
        int w, h;
        scanf("%d %d", &w, &h);
        int w1, h1;
        w1 = x2 - x1;
        h1 = y2 - y1;
        if (w1 + w > W && h1 + h > H)
        {
            printf("%d\n", -1);
            continue;
        }
        double result1 = 1e9, result2 = 1e9;
        if (w1 + w <= W)
        {
            double left, right;
            left = x1;
            right = W - x2;
            result1 = w - (left > right ? left : right);
            if (result1 < 0)
            {
                result1 = 0;
            }
            if (result1 > (left < right ? left : right))
            {
                result1 = 1e9;
            }
        }
        if (h1 + h <= H)
        {
            double up, down;
            up = H - y2;
            down = y1;
            result2 = h - (up > down ? up : down);
            if (result2 < 0)
            {
                result2 = 0;
            }
            if (result2 > (up < down ? up : down))
            {
                result2 = 1e9;
            }
        }
        double answer = result1 < result2 ? result1 : result2;
        if (answer == 1e9)
        {
            answer = -1;
        }
        cout << setprecision(12) << answer << endl;
    }
}
