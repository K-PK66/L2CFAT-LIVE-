#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>

using namespace std;

const int N = 1010;
const double eps = 1e-8;
int n;

int main()
{
    cin >> n;
    double tot = 0;
  double a[n+1], b[n+1];
    for (int i = 1; i <= n; i++)
    {
        cin >> a[i] >> b[i];
        tot += a[i] / b[i];
    }

    tot *= 0.5;

    int i = 1;
    double res = 0;

    while (tot != 0)
    {
        double temp = a[i] / b[i];
        if (tot > temp)
        {
          
            res += a[i++];
            tot -= temp;
        }
        else
        {
            res += b[i] * tot;
            break;
        }
    }

    cout << res << endl;
    return 0;
}
