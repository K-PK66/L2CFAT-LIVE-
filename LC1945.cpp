class Solution {
public:
    int getLucky(string s, int k) {
        int sum;
        for(int i=1;i<=k;i++){
            sum=0;
            for(auto c : s){
                if(c>='a' && c<='z'){
                    int rank = c-'a'+1;
                    if(rank==1||rank==10){
                        sum+=1;
                    }
                    else if(rank==2||rank==11||rank==20){
                        sum+=2;
                    }
                    else if(rank==3||rank==12||rank==21){
                        sum+=3;
                    }
                    else if(rank==4||rank==13||rank==22){
                        sum+=4;
                    }
                    else if(rank==5||rank==14||rank==23){
                        sum+=5;
                    }
                    else if(rank==6||rank==15||rank==24){
                        sum+=6;
                    }
                    else if(rank==7||rank==16||rank==25){
                        sum+=7;
                    }
                    else if(rank==8||rank==17||rank==26){
                        sum+=8;
                    }
                    else if(rank==9||rank==18){
                        sum+=9;
                    }
                    else if(rank==19){
                        sum+=10;
                    }
                }
                else{
                    sum+=c-'0';
                }
            }
            s=std::to_string(sum);
        }
        return sum;
    }
};
