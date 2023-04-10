package org.ness;

import java.util.Scanner;
public class ItemType {
    private String name;
    private Double costPerDay;
    private Double deposit;
    public String getName() {
        return name;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = Math.round(costPerDay*100.0)/100.0;
    }

    public void setDeposit(Double deposit) {
        this.deposit = Math.round(deposit*100.0)/100.0;
    }
    public void display(){
        System.out.println("Item type details");
        System.out.println("Name :"+this.name);
        System.out.println("CostPerDay :"+this.costPerDay);
        System.out.println("Deposit :"+this.deposit);

    }
}

