package com.clarabee.apimule.PracticeProblems;

/**
 * Created by claraburgos on 12/3/16.
 */


public class Practice {

    public static void main(String[] arg){

        printReverseString("Clara");

        printFactorial(8);

    }
    /*
    Write a method that will take a string as input,and return a new
    string with the same letters in reverse order.

    Don't use String's reverse method;that would be too simple.

    Difficulty:easy.

    */

    private static void printReverseString(String string){
        String newString = "";
        for(int i=string.length()-1; i>=0; i--){
            newString += string.charAt(i);
        }
        System.out.println(newString);
    }

    /*
    Write a method that takes an integer `n` in; it should return
    n*(n-1)*(n-2)*...*2*1. Assume n >= 0
    As a special case, `factorial(0) == 1`
    */

    private static void printFactorial(int n) {

        for(int i = n - 1; i >= 1; i--) {
            n = n * i;
        }
        System.out.println(n);
    }

}

