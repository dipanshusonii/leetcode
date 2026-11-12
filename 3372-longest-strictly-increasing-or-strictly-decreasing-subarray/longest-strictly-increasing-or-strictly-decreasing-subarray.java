class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlen = 0;
        for(int i=0 ; i<nums.length ; i++){
            int inclen = 1 , declen = 1;
            int j = i+1;
            while(j!=nums.length && nums[j-1] > nums[j]){
                declen++;
                j++;
            }
            j = i+1;
            while(j!=nums.length && nums[j-1] < nums[j]){
                inclen++;
                j++;
            }
            if(inclen > declen) {
                if(inclen>maxlen)
                maxlen = inclen;
                }
            else {
                if(declen>maxlen)
                maxlen = declen;
            }
        }
        return maxlen;
    }
}