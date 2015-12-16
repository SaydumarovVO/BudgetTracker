package ru.ncedu.java.tasks;

import java.util.Scanner;

public class BudgetTrackerImpl implements BudgetTracker{

    private double ca;

    public double getCa(){
        return ca;
    }

    public void setCa(double ca){
        this.ca = ca;
    }

    public String condition(){
        String s = "Your current budget is ";
        return s;
    }

    public void setDefault(String s){
        if (s.equals("default")){
            this.ca = 0;
        }
    }

    public double active(double n){
        this.ca = this.ca + n;
        return this.ca;
    }

    public String balance(String s){
        if (s.equals("balance")){
            s = "Your current budget is " + this.ca;
            return s;
        }
        else{
            return null;
        }
    }

    public double parse(String s){
        double d = Double.parseDouble(s.replaceAll(" ","").replace(',','.'));
        return d;
    }


    public boolean checkString(String s){
        if (s == null) return false;
        return s.matches("^-?\\d+$");
    }
}