class Solution {
    public String maxSumOfSquares(int num, int sum) {
       if(num*9<sum) return "";
       StringBuilder st = new StringBuilder();
       for(int i=0;i<num;i++){
        int value= Math.min(9,sum);
            st.append(value);
            sum-=value;
       }
       return st.toString();
    }
}