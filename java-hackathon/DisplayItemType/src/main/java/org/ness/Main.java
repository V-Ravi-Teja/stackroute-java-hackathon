package org.ness;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemType itemtype=new ItemType();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item type name");
        String name = sc.nextLine();
        System.out.println("Enter the cost per day");
        Double costPerDay = sc.nextDouble();
        System.out.println("Enter the deposit");
        Double deposit = sc.nextDouble();
        itemtype.setName(name);
        itemtype.setCostPerDay(costPerDay);
        itemtype.setDeposit(deposit);
        itemtype.display();
    }
}