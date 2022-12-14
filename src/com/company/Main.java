package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean arePermutation(String str1, String str2){

        //get length of the string
        int x = str1.length();
        int y = str2.length();

        //if length of both string is not same then it is not permutation
        if (x != y)
            return false;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        // sorting both the string
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // comparing both the string
        for (int i = 0; i < x; i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.next();
        System.out.println("Enter the second string: ");
        String str2 = sc.next();
        if (arePermutation(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
