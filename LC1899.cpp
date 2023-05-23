class Solution {
public:
    bool mergeTriplets(vector<vector<int>>& triplets, vector<int>& target) {
        bool f0 = false, f1 = false, f2 = false;
        for(auto& t : triplets)
        {
            if(t[0] > target[0] || t[1] > target[1] || t[2] > target[2])
                continue;
            if(t[0] == target[0]) f0 = true;
            if(t[1] == target[1]) f1 = true;
            if(t[2] == target[2]) f2 = true;
        }
        return f0&&f1&&f2;
    }
};
