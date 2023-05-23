package Practicals;
import java.util.ArrayList;

public class Dupli_array {
    public static void array1(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            // int element = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    flag = true;
                }
            }
            if (!flag) {
                ans.add(arr[i]);
            }
            flag = false;
        }

        for (int j = 0; j < ans.size(); j++) {
            System.out.println(ans.get(j));
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 5, 4, 6, 6, 7, 8, 9 };
        int n = arr.length;
        array1(arr, n);
    }
}
