class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int majority = nums[0], freq = 1;

        for(int i = 1; i < nums.size(); i++){
            if(freq == 0){
                freq++;
                majority = nums[i];
            }
            else if(majority == nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return majority;
    }
};
//[2,2,1,1,1,2,2]