package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number:");
	String s1 = sc.nextLine();
	System.out.println("Enter Second Number:");
	String s2 = sc.nextLine();

	String str1 = s1.replaceAll("//s","");
	String str2 = s2.replaceAll("//s","");
boolean status = true;
if (str1.length() != str2.length()){
    status = false;
}else {
    char[]arrayStr1 = str1.toCharArray();
    char[]arrayStr2 = str2.toCharArray();
    Arrays.sort(arrayStr1);
    Arrays.sort(arrayStr2);
    status = Arrays.equals(arrayStr1,arrayStr2);
}
if (status) {
    System.out.println(s1  +  " and "  +  s2  + " are Anagram ");
}else{
    System.out.println(s1  +  " and "  +  s2  + " are not Anagram ");

}

    }
}
