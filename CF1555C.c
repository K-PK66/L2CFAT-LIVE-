#include<iostream>

void solve(){
    long long int m;
    scanf("%lld", &m);
    long long int a[3][100001];
    long long int s1[100001], s2[100001];
    for (long long int i = 1; i <= m;i++){
        s1[i] = 0;
        s2[i] = 0;
    }
    for (long long int i = 1; i <= 2; i++)
    {
        for (long long int j = 1; j <= m; j++)
        {
            scanf("%lld", &a[i][j]);
            if(i==1){
                s1[j] += s1[j - 1] + a[i][j];
            }
            if(i==2){
                s2[j] += s2[j - 1] + a[i][j];
            }
        }
    }
    long long int answer = 1e18;
    for (long long int j = 1; j <= m;j++){
        long long int addOne = s1[m] - s1[j];
        long long int addTwo = s2[j - 1];
        long long int tmp = addOne > addTwo ? addOne : addTwo;
        answer = answer < tmp ? answer : tmp;
    }
    printf("%lld\n", answer);
}

int main(){
    int t;
    scanf("%d", &t);
    while(t--){
        solve();
    }
}
