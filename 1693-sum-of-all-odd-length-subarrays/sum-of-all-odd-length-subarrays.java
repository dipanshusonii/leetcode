class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=0,c=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                c++;
                if(c%2!=0){
                    ans+=sum;
                }
            }
        }
        return ans;
    }
}