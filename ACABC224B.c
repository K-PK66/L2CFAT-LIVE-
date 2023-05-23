#include<stdio.h>

int main(){
    int H, W;
    scanf("%d %d", &H, &W);
    int A[H + 1][W + 1];
    for (int i = 1; i <= H;i++){
        for (int j = 1; j <= W;j++){
            scanf("%d", &A[i][j]);
        }
    }
    int flag = 1;
    for (int i1 = 1; i1 <= H - 1; i1++)
    {
        for (int i2 = i1 + 1; i2 <= H;i2++){
            for (int j1 = 1; j1 <= W - 1;j1++){
                for (int j2 = j1 + 1; j2 <= W;j2++){
                    if(A[i1][j1]+A[i2][j2]>A[i2][j1]+A[i1][j2]){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 0)break;
            }
            if (flag == 0)
                break;
        }
        if (flag == 0)
            break;
    }
    if(flag == 1){
        printf("Yes");
    }
    else{
        printf("No");
    }
}
