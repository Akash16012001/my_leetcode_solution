/**
 Do not return anything, modify nums in-place instead.
 */
function sortColors(nums: number[]): void {
    let zeroCount: number = 0
    let oneCount: number = 0
    let twoCount: number = 0
    let idx: number = 0

    nums.forEach(function(num: number){
        if(num == 0){
            zeroCount++;
        } else if(num == 1){
            oneCount++;
        } else {
            twoCount++;
        }
    })

    for(let i = 0; i < zeroCount; i++){
        nums[idx++] = 0
    }

    for(let i = 0; i < oneCount; i++){
        nums[idx++] = 1
    }

    for(let i = 0; i < twoCount; i++){
        nums[idx++] = 2
    }
};