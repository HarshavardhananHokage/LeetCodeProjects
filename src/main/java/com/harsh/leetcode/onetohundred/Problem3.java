package com.harsh.leetcode.onetohundred;

import java.util.*;

public class Problem3 {

    public int lengthOfLongestSubstring(String s) {

        String longSubString = "";
        int length = 0;
        for(int i = 0; i < s.length(); i++){
            String check = Character.toString(s.charAt(i));
            if(longSubString.contains(check)){
                //System.out.println("If Before: " +longSubString);
                if(length < longSubString.length())
                    length = longSubString.length();
                longSubString = longSubString.substring(longSubString.indexOf(check) + 1);
                //System.out.println("If After: " +longSubString);
            }
            longSubString = longSubString + s.charAt(i);
        }
        if(length < longSubString.length())
            length = longSubString.length();
        //System.out.println(longSubString);

        return length;
    }

    /*
     ********FOR TESTING IN MAIN METHOD,********
     ********COPY THE BELOW LINES IN METHOD********
     */
    public void copyToMainForTest() {
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.lengthOfLongestSubstring("dvdf"));
    }
}
