class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            max=Integer.max(nums[i],max);
        }
        for(int i=0;i<nums.length;i++){
            count+=(max-nums[i]);
        }
        return count;

    }
}