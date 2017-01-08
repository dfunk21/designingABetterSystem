package com.company;

/**
 * Created by dawsonfunk on 1/8/17.
 */
public class employee extends regularCustomer {

    public employee (String re)
    {
        super(re);
    }

    @Override
    public void memberships() {
        priceM = 1;
        super.memberships();
    }

    @Override
    public void classes() {
        priceC = 3;
        super.classes();
    }

    public void employeeRetail()
    {
        System.out.println("So You Know: If you would like to purchase retail you will get 10% off!");
    }

    @Override
    public void aquatics() {
        priceA = 7;
        super.aquatics();
    }

    @Override
    public void personalTrainer() {
        ratePT = 15;
        super.personalTrainer();
    }

    @Override
    public double bill() {
        return super.bill();
    }
}
