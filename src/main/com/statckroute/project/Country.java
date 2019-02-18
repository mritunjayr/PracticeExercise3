//4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//        words in console
//        Input:
//        India
//        United States
//        Germany
//        Egypt
//        czechoslovakia
//        Output:
//        Place Name without Vowels:0 Ind
//        Place Name without Vowels:1 Untd Stts
//
//        Place Name without Vowels:2 Grmny
//        Place Name without Vowels:3 Egypt
//        Place Name without Vowels:4 czchslvk

package com.statckroute.project;

public class Country {
    public String[] removeVowels(String []input){
        String result[]=new String[input.length];
        int index=0;
        for(String element:input){
            String ans="";
            for(char character:element.toCharArray()){
                if("aeiou".contains(String.valueOf(character))){
                    continue;
                }
                ans+=character;
            }
            result[index++]=ans;
        }
        return result;
    }
}
