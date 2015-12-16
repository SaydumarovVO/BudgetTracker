package ru.ncedu.java.tasks;

import java.util.Scanner;

/**
 * Created by Валера on 18.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        BudgetTrackerImpl bt = new BudgetTrackerImpl();
        Scanner sc = new Scanner(System.in);
        double n = 0;
        bt.setCa(n);
        String s = sc.next();
        while(!(s.equals("end"))) {
            if (bt.balance(s) != null){
                System.out.print(bt.balance(s) + "\n");
            }
            bt.setDefault(s);

            if (bt.checkString(s)){
                bt.active(bt.parse(s));
                System.out.print(bt.getCa() + "\n");
            }
            if (bt.getCa() < 0){
                System.out.print(" Warning! Your balance is negative!\n");
            }
            s = sc.next();
        }
    }
}
