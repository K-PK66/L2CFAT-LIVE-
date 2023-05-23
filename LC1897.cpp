class Solution {
public:
    bool makeEqual(vector<string>& words) {
        vector<int> ct(26);
        for(auto& w : words)
        {
            for(auto c : w)
                ct[c-'a']++;
        }
        int n = words.size();
        for(int i = 0; i < 26; ++i)
        {
            if(ct[i]%n != 0)
                return false;
        }
        return true;
    }
};
