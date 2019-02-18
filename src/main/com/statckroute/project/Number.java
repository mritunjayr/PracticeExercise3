//6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//        assume the digits are a string and use split()
//        Input: 98,96,95,94,93
//        Output: 98,96,95,94,93 non consecutive numbers
//        Input: 54,53,52,51,50,49,48
//        Output : 54,53,52,51,50,49,48 are consecutive numbers
//        Input: 1,2,3,4,5,6,6
//        Output: 1,2,3,4,5,6,6 non consecutive numbers
//
package com.statckroute.project;

import java.util.Arrays;

public class Number {
    public boolean checkConsecutive(String input){
        String inputArray[]=input.split(",");
        Arrays.sort(inputArray);
        for(int i=0,j=1;i<inputArray.length-1;i++,j++){
            if(Integer.valueOf(inputArray[j])-Integer.valueOf(inputArray[i])==1){
                continue;
            }
            return false;
        }
        return true;
    }
}
