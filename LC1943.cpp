const int N = 1e5 + 5;

long long s[N];
bool st[N];

class Solution {
public:
    vector<vector<long long>> splitPainting(vector<vector<int>>& seg) {
        memset(s, 0, sizeof s);
        memset(st, 0, sizeof st);

        int n = 0;
        for (int i = 0; i < seg.size(); i++) {
            s[seg[i][0]] += seg[i][2];
            s[seg[i][1]] -= seg[i][2];
            st[seg[i][1]] = true;
            n = max(n, seg[i][1]);
        }

        for (int i = 1; i <= n; i++) s[i] += s[i - 1];

        vector<vector<long long>> res;
        for (int i = 0; i < n; i++) {
            if (!s[i]) continue;
            int ss = i++, se;
            if (s[i]) {
                while (i < n && s[i] == s[ss] && st[i] == false) i++;
            }
            se = i;
            vector<long long> v;
            v.push_back(ss);
            v.push_back(se);
            v.push_back(s[ss]);
            res.push_back(v);
            ss = se;
            i--;
        }

        return res;
    }
};
