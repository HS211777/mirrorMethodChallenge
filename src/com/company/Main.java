package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the number of elements in the list");
        getArrayInts(getIntInput());

    }
    public static ArrayList<Integer> getArrayInts(int numElements){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < numElements; i++){
            numbers.add(input.nextInt());
        }
        return numbers;
    }
    public static int getIntInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int maxMirror(ArrayList<Integer> numbers){
        int maxm = 0;
        int count = 0;
        String nums = "";
        for (int i = 0; i < numbers.size(); i++){
            nums = nums + numbers.get(i).toString();
        }
        for (int i = 0; i < numbers.size()/2; i++){
            String key = nums.subString(0,1+i);
            key = reverseString(key);
        }


        return maxm;
    }
    public static String reverseString(String str){
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            chars.add(str.charAt(i));
        }
        Collections.reverse(chars);
        String out = "";
        for (int i = 0; i < chars.size(); i++){
            out = out + chars.get(i);
        }
        return out;
    }
}
