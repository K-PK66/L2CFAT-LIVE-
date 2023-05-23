#include<stdio.h>
int absoluteValue(int a){
    return a >= 0 ? a : -a;
}
int main(){
    int t;
    scanf("%d", &t);
    for (int i = 1; i <= t;i++){
        int xA, yA, xB, yB, xF, yF;
        scanf("%d %d", &xA, &yA);
        scanf("%d %d", &xB, &yB);
        scanf("%d %d", &xF, &yF);
        int result = 0;
        int moveInSingleRow = absoluteValue(xA - xB);
        int moveInSingleColumn = absoluteValue(yA - yB);
        if(xA==xF && xB==xF){
            if ((yA < yF && yF < yB && yA < yB) || (yB < yF && yF < yA && yA > yB))
            {
                result = moveInSingleColumn + moveInSingleRow + 2;
            }
            else{
                result = moveInSingleColumn + moveInSingleRow;
            }
        }
        else if (yA==yF && yB==yF)
        {
            if ((xA < xF && xF < xB && xA < xB) || (xB < xF && xF < xA && xA > xB))
            {
                result = moveInSingleColumn + moveInSingleRow + 2;
            }
            else{
                result = moveInSingleColumn + moveInSingleRow;
            }
        }

        else{
            result = moveInSingleColumn + moveInSingleRow;
        }
        printf("%d\n", result);
    }
    return 0;
}
