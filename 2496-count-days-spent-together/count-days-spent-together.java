class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int AliceA=covertIntoDays(arriveAlice);
        int AliceL=covertIntoDays(leaveAlice);
        int BobA=covertIntoDays(arriveBob);
        int BobL=covertIntoDays(leaveBob);
        int start=Math.max(AliceA,BobA);
        int end=Math.min(AliceL,BobL);
        return Math.max(0,end-start+1);
    
    }
    int covertIntoDays(String Date){
        int[] Days={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(Date.substring(0,2));
        int day=Integer.parseInt(Date.substring(3,5));
        int total=day;
        for(int i=0;i<month-1;i++){
            total+=Days[i];
        }
        return total;
    }
}