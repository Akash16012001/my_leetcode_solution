class Solution {
public:

    int singleNumber(vector<int>& nums) {
        int res = 0;
        for(int ans : nums){
            res ^= ans;
        }
        return res;
    }
};