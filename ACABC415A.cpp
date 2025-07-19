#include <bits/stdc++.h>

int main(){
    int n;
    std::cin >> n;
    std::vector<int> a(n);
    for (auto &member:a){
        std::cin >> member;
    }
    int x;
    std::cin >> x;
    std::cout << (a.end() - std::find(a.begin(), a.end(), x) ? "Yes" : "No") << std::endl;
}