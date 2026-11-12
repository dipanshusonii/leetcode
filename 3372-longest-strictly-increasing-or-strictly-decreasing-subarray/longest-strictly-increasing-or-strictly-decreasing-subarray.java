class Solution {
    public int longestMonotonicSubarray(int[] a) {
        // int maxlen = 0;
        // for(int i=0 ; i<nums.length ; i++){
        //     int inclen = 1 , declen = 1;
        //     int j = i+1;
        //     while(j!=nums.length && nums[j-1] > nums[j]){
        //         declen++;
        //         j++;
        //     }
        //     j = i+1;
        //     while(j!=nums.length && nums[j-1] < nums[j]){
        //         inclen++;
        //         j++;
        //     }
        //     if(inclen > declen) {
        //         if(inclen>maxlen)
        //         maxlen = inclen;
        //         }
        //     else {
        //         if(declen>maxlen)
        //         maxlen = declen;
        //     }
        // }
        // return maxlen;
        int maxi1 = 1,maxi2 =1,c1 = 1,c2 =1,count1  = 1 ,count2 = 1;
        for(int i = 0; i<a.length-1; i++){
         if(a[i]<a[i+1]){
                  c1++;
           count1 = Math.max(c1,count1);
           
            }
            else{
                c1 =1;
            }
             if(a[i]>a[i+1]){
                 c2++;
              count2 =   Math.max(c2,count2);
            }
            else{
                c2 =1;
            }
        }
        if(count1>count2){
            return count1;
        }
       return  count2;
    }
}