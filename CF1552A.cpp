#include <iostream>
#include <algorithm>
#include <string>
#include <cstring>
using namespace std;
void solve()
{
    int n;
    scanf("%d", &n);
    string s;
    cin >> s;
    string tmp = s;
    sort(tmp.begin(), tmp.end());
    int result = 0;
    for (int i = 0; i < n;i++){
        if(s[i]!=tmp[i]){
            result++;
        }
    }
    cout << result << endl;
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
    return 0;
}
