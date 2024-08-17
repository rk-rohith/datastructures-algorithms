class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> resultMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            resultMap.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diffVal = target-nums[i];
            if(resultMap.containsKey(diffVal) && resultMap.get(diffVal)!=i){
                return new int []{i,resultMap.get(diffVal)};
            }
        }
        return null;
    }
}