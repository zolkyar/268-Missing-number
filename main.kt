class Solution {
    fun missingNumber(nums: IntArray): Int {
        nums.sort()
        if (nums.size == 1){
            if(nums[0] == 0) {
                return 1
            }
            return 0
        }
        
        for (i in 1 .. nums.size-1) {
            if (nums[0] != 0) {
                return 0
            }
            
            if (nums[i-1] != nums[i] - 1) {
                return nums[i] - 1
            }
        }
        
        return nums.size
    }
}