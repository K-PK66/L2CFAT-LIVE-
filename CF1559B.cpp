#include <stdio.h>
#include <cstring>
#include <string>
#include<iostream>
using namespace std;

void solve(){
    int n;
    scanf("%d", &n);
    string s;
    cin >> s;
    for (int _ = 1; _ <= 100; _++)
    {
        for (int i = 0; i <= n - 1; i++)
        {
            if (s[i] != '?')
            {
                if (s[i - 1] == '?')
                {
                    s[i - 1] = (s[i] == 'R' ? 'B' : 'R');
                }
                else if (s[i + 1] == '?')
                {
                    s[i + 1] = (s[i] == 'R' ? 'B' : 'R');
                }
            }
        }
    }
    for (int i = 0; i <= n - 1;i++){
        if(s[i]=='?'){
            if(s[i-1]=='B'){
                s[i] = 'R';
            }
            else if(s[i-1]=='R'){
                s[i] = 'B';
            }
            else if(s[i+1]=='B'){
                s[i] = 'B';
            }
            else if(s[i+1]=='R'){
                s[i] = 'R';
            }
            else{
                s[i] = 'B';
            }
        }
    }
    cout << s << endl;
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
    return 0;
}
