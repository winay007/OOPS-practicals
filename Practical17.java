package Practicals;

import java.util.*;

// 17. Write a program to read 10 string from console and then print the sorted strings on
//  console (Use String Class).2) combine two string   3)reverse first string nd dispaly it .

public class Practical17 {

    static void sortingStrings(ArrayList<String> input){
        // System.out.println(input);
        Collections.sort(input);
        // for (int i = 0; i < input.size(); i++) {
        //     for (int j = i + 1; j < input.size(); j++) {
        //         if(input.get(i).charAt(0) > input.get(j).charAt(0)){
        //             String temp = input.get(i);
        //             input.add(i, input.get(j));
        //             input.add(j, temp);
        //         }
        //     }
        // }

        System.out.println(input);
    }

    static void combineString(ArrayList<String> input){
        String concat = input.get(0) + input.get(input.size()-1);
        System.out.println("Contacted string:" + concat);
    }

    static void reverseString(ArrayList<String> input){
        String temp = input.get(0);
        String rev = "";
        for (int i = 0; i < temp.length(); i++) {
            rev = temp.charAt(i) + rev; 
        }
        System.out.println("Reversed string: " + rev );
    }

    public static void main(String[] args) {
        ArrayList<String> input =  new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 strings:");
        int i = 0 ;
        while(i < 10) {
            String temp = sc.nextLine();
            input.add(temp);
            i++;
        }
        // System.out.println(input);
        sortingStrings(input);
        combineString(input);
        reverseString(input);
        sc.close();
    }
}
