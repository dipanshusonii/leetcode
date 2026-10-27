class Solution {
    public String reverse(String word,int pos){
        char[] arr=word.toCharArray();
        int i=0,j=pos;
        while(i<j){
            char ch=arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++; 
            j--;
        }
        return new String(arr);
    }
    public String reversePrefix(String word, char ch) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                return reverse(word,i);
            }
        }
        return word;
    }
}