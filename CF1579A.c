#include<stdio.h>

void solve(){
    char s[51];
    int i = 1;
    s[0] = 0;
    int ACount = 0, BCount = 0, CCount = 0;
    while (s[i-1] != '\n')
    {
        scanf("%c", &s[i]);
        if(s[i]=='A'){
            ACount++;
        }
        else if(s[i]=='B'){
            BCount++;
        }
        else if(s[i]=='C'){
            CCount++;
        }
        i++;
    }
    if(ACount+CCount==BCount){
        printf("YES\n");
    }
    else{
        printf("NO\n");
    }
}
int main(){
    int t;
    char sacrifice;
    scanf("%d", &t);
    scanf("%c", &sacrifice);
    while (t--)
    {
        solve();
    }
    return 0;
}
