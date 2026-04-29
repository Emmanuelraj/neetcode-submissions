class Solution {
    public boolean hasDuplicate(int[] nums) {



// T.C = O(n log n) and S.C = O(n)

Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){

           if(nums[i]==nums[i-1]){
             return true;
           }
        }
        return false;
    }
}