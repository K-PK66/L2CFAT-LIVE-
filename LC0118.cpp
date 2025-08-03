class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        std::vector<std::vector<int>> result;
        for (int i = 0; i < numRows; i++) {
            std::vector<int> row;
            row.push_back(1);
            for (int j = 1; j <= i; j++) {
                row.push_back(row.back() * (i + 1 - j) / j);
            }
            result.push_back(row);
        }
        return result;
    }
};
