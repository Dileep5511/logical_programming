/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int len = 0; len <= arr.length; len++) {
            if (len == 0) {
                result.add(new ArrayList<>());
            } else {
                for (int i = 0; i < arr.length - len + 1; i++) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int j = i; j < i + len; j++) {
                        temp.add(arr[j]);
                    }
                    result.add(temp);
                }
            }
        }

        result.forEach(System.out::println);
    }
}
