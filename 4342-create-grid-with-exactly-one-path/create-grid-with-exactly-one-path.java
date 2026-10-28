class Solution {
    public String[] createGrid(int m, int n) {
        String[] Array= new String[m];
        for(int i=0;i<m;i++){
            String ans="";
            for(int j=0;j<n;j++){
                if(i==j || j==(i+1)) ans+='.';
                else if(m<n && (j>=i && i==m-1)) ans+='.';
                else if(n<m && (i>=j && j==n-1)) ans+='.';
                else ans+='#';
            }
            Array[i]=ans;
        }
        return Array;
    }
}