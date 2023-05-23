#include<stdio.h>
#include<math.h>
int main(){
    long long int exception = 0;
    long long int N;
    scanf("%lld", &N);
    long long int ans = N * (N - 1) * (N - 2) / 6;
    long long int X[N + 1], Y[N + 1];
    for (long long int i = 1; i <= N;i++){
        scanf("%lld %lld", &X[i], &Y[i]);
    }
    long long int a[4];
    for (int i = 1; i < N; i++)
    {
        for (int j = i + 1; j <= N;j++){
            for (int k = j + 1; k <= N;k++){
                a[1] = (Y[i] - Y[j]) * (X[i] - X[k]);
                a[2] = (Y[i] - Y[k]) * (X[i] - X[j]);
                if(a[1]==a[2]){
                    exception++;
                }
            }
        }
    }
    printf("%lld", ans-exception);
    return 0;
}
