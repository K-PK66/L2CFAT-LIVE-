---
--- Generated by EmmyLua(https://github.com/EmmyLua)
--- Created by gu.
--- DateTime: 2022/5/27 11:58
---
function solve()
    local a,b,c=io.read("*n","*n","*n")
    if a>=b and b>=c then print("Yes")
        elseif a<=b and b<=c then print("Yes")
        else print("No")
    end
end
solve()
--[[function main()
    local t=io.read("*n")
    for i=1,t do
        solve()
    end
end
--]]
