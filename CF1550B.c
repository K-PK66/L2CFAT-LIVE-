#include<stdio.h>

int main(){
    int t;
    scanf("%d", &t);
    for (int i = 1; i <= t;i++){
        int n, a, b;
        scanf("%d %d %d", &n, &a, &b);
        char s[n];
        int countZeroSeries = 0;
        int countOneSeries = 0;
        int x = 0;
        char sacrifice;
        scanf("%c", &sacrifice);
        for (int j = 0; j <= n - 1; j++)
        {
            scanf("%c", &s[j]);
            if(j>=1){
                if(s[j]!=s[j-1] && s[j]=='0'){
                    countZeroSeries += 1;
                }
                else if(s[j]!=s[j-1]&&s[j]=='1'){
                    countOneSeries += 1;
                }
                else{
                    countOneSeries += 0;
                    countZeroSeries += 0;
                }
            }
            else{
                if(s[j]=='0'){
                    countZeroSeries += 1;
                }
                if(s[j]=='1'){
                    countOneSeries += 1;
                }
            }
        }
        int Delete = (countOneSeries < countZeroSeries ? countOneSeries : countZeroSeries) + 1;
        int later;
        if(b>0){
            later = b * n;
        }
        else{
            later = b * Delete;
        }
        int finalScore;
        int formerFormula = a * n;
        finalScore = formerFormula + later;
        printf("%d\n", finalScore);
    }
    return 0;
}
