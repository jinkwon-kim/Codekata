package day24;

import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }
}
