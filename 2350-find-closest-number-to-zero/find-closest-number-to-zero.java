class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int dis=Math.abs(nums[i]);
            if(dis<=min){
                if(dis==min){ans=Math.max(ans,nums[i]);}
                else ans=nums[i];
                min=dis;
            }
        }
        return ans;
    }
}