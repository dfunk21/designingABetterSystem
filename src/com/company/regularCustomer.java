package com.company;
import java.util.*;
/**
 * Created by dawsonfunk on 1/8/17.
 */
public class regularCustomer {

    Scanner sr = new Scanner(System.in);

    public String rank;
    public double cost;

    public double priceM = 65;
    public double priceC = 10;
    public double ratePT = 25;
    public double priceA = 0;

    public regularCustomer (String r)
    {
        rank = r;
    }

    public void memberships()
    {
        cost = cost + priceM;
    }

    public void classes()
    {
        cost = cost + priceC;
    }

    public void retail()
    {
        System.out.println("So You Know: If you would like to purchase retail you will have to pay full price!");
    }

    public void aquatics()
    {
        cost = cost + priceA;
    }

    public void personalTrainer()
    {
        System.out.print("How many hours would you like to purchase for personal trainer?");
        int hours = sr.nextInt();
        double pricePT = ratePT * hours;
        cost = cost + pricePT;
    }

    public double bill ()
    {
        return cost;
    }



}
