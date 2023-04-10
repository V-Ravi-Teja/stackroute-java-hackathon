package org.ness;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int intArr[] = new int[n];
        String strArr[] = new String[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.nextLine();
        }
        sc.close();
        //Printing out outputs
        System.out.println("Displaying numbers");
        for (int i : intArr) {
            System.out.println(i);
        }
        System.out.println("Displaying strings");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}