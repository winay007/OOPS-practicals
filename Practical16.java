package Practicals;

import java.util.*;

// //16. Write a Java Program to count the number of words in a string using HashMap.Output:
// Input :Enter String: "This this is is done by Saket Saket";
// {Saket=2, by=1, this=1, This=1, is=2, done=1}


public class Practical16 {

    static void findDuplicates(String text) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int wStart = 0;
        String temp;
        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() - 1 || text.charAt(i) == ' ') {
                if (i == text.length() - 1)
                    temp = text.substring(wStart, i + 1);
                else
                    temp = text.substring(wStart, i);

                if (map.containsKey(temp))
                    map.put(temp, map.get(temp) + 1);
                else
                    map.put(temp, 1);

                // till start of next word
                while (text.charAt(i) == ' ')
                    i++;
                wStart = i;
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String text = sc.nextLine();
        findDuplicates(text);
        sc.close();
    }
}
