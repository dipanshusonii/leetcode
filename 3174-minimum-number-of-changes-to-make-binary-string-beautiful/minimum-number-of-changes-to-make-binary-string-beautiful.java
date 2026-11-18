class Solution {
    public int minChanges(String str) {
        char[] s = str.toCharArray();
        int ans = 0;
        for(int i = 1 ; i < s.length ; i++){
            if(s[i] != s[i-1]){
                s[i] = s[i-1];
                ans++;
            }
            i++;
        }
        return ans;
    }
}