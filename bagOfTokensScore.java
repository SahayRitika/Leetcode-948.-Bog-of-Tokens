class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==1){
            return (power-tokens[0]>=0 ? 1:0);
        }
        Arrays.sort(tokens);
        int score=0,max=0,l=0,r=tokens.length-1;
        while(l<r){
            while(tokens[l]<=power){
                power-=tokens[l];
                score++;
                l++;
            }
            max=Math.max(max,score);
            if(score>=1){
                power+=tokens[r];
                score--;
            }
            r--;
        }
        return max;
    }
}
