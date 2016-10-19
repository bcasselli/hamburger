package com.company;
import java.text.*;
public class Main {

public static class burger{
    public double c;
    public burger(int calorie){
        c = calorie;
    }

    public String percentage(){
        double p = c/2000;
        String value = String.format("%1$.3f", p);
        return value;
    }
    public String amount(){
        int a = 2000/((int)c);
        double a2 = 2000/c - a;
        if(a2 == 0.0){
            return String.valueOf(a);
        }
        else {
            String fraction = String.valueOf(a2);
            int numberOf = (int) Math.pow(10, fraction.length() - 2);
            return String.valueOf(a) + " " + String.valueOf(a2) + "/" + numberOf;
        }
    }
}
    public static void main(String[] args) {
        burger b = new burger(105);
        System.out.println(b.percentage());
        System.out.println(b.amount());
    }
}
