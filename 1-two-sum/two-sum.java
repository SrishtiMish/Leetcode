class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> mpp = new HashMap<> ();
        for(int i=0; i<nums.length; i++){
            int more = target - nums[i];
            if(mpp.containsKey(more)){
                return new int[]{mpp.get(more),i};
            }
            mpp.put(nums[i], i);
        }
        return new int[] {};
    }
}