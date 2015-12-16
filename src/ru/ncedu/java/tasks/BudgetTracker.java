package ru.ncedu.java.tasks;

/**
 * Created by Валера on 18.10.2015.
 */
public interface BudgetTracker {

    public double getCa();

    public void setCa(double ca);

    public String condition();

    public void setDefault(String s);

    public double active(double n);

    public String balance(String s);

    public double parse (String s);

    public boolean checkString(String string);
}
