package day19;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        answer = (long)Math.sqrt(n);

        if(n == (long)Math.pow(answer,2)){
            answer = (long)Math.pow(answer+1,2);
        } else{
            answer = -1;
        }


        return answer;
    }

}
