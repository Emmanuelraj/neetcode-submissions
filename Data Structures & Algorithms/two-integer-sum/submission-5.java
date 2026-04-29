class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hashMap= new HashMap<>();

        int i = 0;
        for(int num: nums){
            
            if(hashMap.containsKey(num)){
                int idx = hashMap.get(num);
                return new int[]{idx, i};

            }else{
                hashMap.put(target-num, i);
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
