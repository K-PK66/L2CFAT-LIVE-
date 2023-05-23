class Solution {
public:
    bool areOccurrencesEqual(string s) {
        int repeat[26]={0};
        for (auto c:s){
            repeat[c-'a']++;
        }
        int NewRepeat[26];
        int k=0;
        for(int i=0;i<=24;i++){
            if(repeat[i]!=0){
                NewRepeat[k]=repeat[i];
                k++;
            }
        }
        for(int j=0;j<=k-2;j++){
            if(NewRepeat[j]==NewRepeat[j+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
};
