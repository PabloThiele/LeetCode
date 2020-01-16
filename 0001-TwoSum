class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0,0};
        if(nums == null || nums.length == 0){
            return result;
        }
        
        Map<Integer, Integer> valuePosition  = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(valuePosition.containsKey(target - nums[i])){
                result =  new int[]{valuePosition.get(target - nums[i]), i};
            }else{
                valuePosition.put(nums[i], i);
            }
        }
        return result;
    }
}
