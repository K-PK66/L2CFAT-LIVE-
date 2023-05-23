t=eval(input())
for i in range(1,t+1,1):
    n=input()
    maxInt=0
    for j in n:
        if int(j)>=maxInt:
            maxInt=int(j)
    print(maxInt)
    
