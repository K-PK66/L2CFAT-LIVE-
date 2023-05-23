class Solution {
public:
    int maximumRemovals(string s, string p, vector<int>& removable) {
        int n = removable.size();
        //搜索区间范围[l, r)
        int l = 0, r = n;
        while(l < r){
            int mid = (r - l) / 2 + l;
            if(check(s, p, removable, mid)){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
    //检查p字符串与移除一定字符的s串是否匹配
    bool check(string& s, string& p, vector<int>& removable, int mid){
        int ns = s.size();
        int np = p.size();
        //标志s的每一个字符状态，1表示保留，0表示移除
        vector<bool> state(ns, 1);
        for(int i=0; i<=mid; i++){
            state[removable[i]] = 0;
        }
        //双指针检查子串
        int j = 0;
        for(int i=0; i<ns; i++){
            //如果s[i] 与 p[j]匹配，j指针右移
            if(state[i] && s[i] == p[j]){
                j++;
                //如果全部匹配，说明p是子串，返回true
                if(j == np) return true;
            }
        }
        return false;
    }
};
