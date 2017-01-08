package com.company;

/**
 * Created by dawsonfunk on 1/8/17.
 */
public class membershipCustomer extends regularCustomer {



    public membershipCustomer (String rb)
    {
        super(rb);
    }

    @Override
    public void classes() {
        priceC = 8;
        super.classes();

    }

    public void memRetail()
    {
        System.out.println("So You Know: If you would like to purchase retail you will get 20% off!");
    }

    @Override
    public void aquatics() {
        priceA = 10;
        super.aquatics();
    }

    @Override
    public void personalTrainer() {
        ratePT = 20;
        super.personalTrainer();
    }

    @Override
    public double bill() {
        return super.bill();
    }
}
