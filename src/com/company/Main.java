package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
System.out.println("Welcome to the Pennebacker Gym of Computing! How are you today?");
        String mood = sc.nextLine();
        System.out.println("That's amazing! Hopefully we can make your day even better!" +
                " Are you currently a member, employee, or regular customer? (Type regular, member, or employee)");
        String typeCustomer = sc.nextLine();

        if (typeCustomer.equalsIgnoreCase("regular")) {
            regularCustomer gym = new regularCustomer(typeCustomer);

            System.out.println("What would you like to purchase? The entire package includes membership, classes, retail, " +
                    "and a personal trainer. You can also purchase each individually\nType \"package\" to " +
                    "include everything or enter \"other\"");
            String purchase = sc.nextLine();
            if (purchase.equalsIgnoreCase("package"))
            {
                gym.memberships();
                gym.classes();
                gym.retail();
                gym.personalTrainer();
            }
            else {
                while (true) {
                    System.out.println("Enter item (Type- membership, classes, retail, or pt) or type any key to stop");
                    String item = sc.nextLine();
                    if(item.equals("membership"))
                    {
                        gym.memberships();
                    }
                    else if(item.equals("classes"))
                    {
                        gym.classes();
                    }
                    else if(item.equals("retail"))
                    {
                        gym.retail();
                    }
                    else if(item.equals("pt"))
                    {
                        gym.personalTrainer();
                    }
                    else {
                        break;
                    }
                }
            }

            System.out.println("Bill: $" + gym.bill());
        }

        else if(typeCustomer.equalsIgnoreCase("member")) {
            membershipCustomer mem = new membershipCustomer(typeCustomer);

            System.out.println("What would you like to purchase? You will have to purchase each item individually since " +
                    "you are a member");
                while (true) {
                    System.out.println("Enter item (Type- classes, retail, aquatics, or pt) or type any key to stop");
                    String item = sc.nextLine();
                    if(item.equals("aquatics"))
                    {
                        mem.aquatics();
                    }
                    else if(item.equals("classes"))
                    {
                        mem.classes();
                    }
                    else if(item.equals("retail"))
                    {
                        mem.memRetail();
                    }
                    else if(item.equals("pt"))
                    {
                        mem.personalTrainer();
                    }
                    else {
                        break;
                    }
                }

            System.out.println("Bill: $" + mem.bill());
        }
        else if(typeCustomer.equalsIgnoreCase("employee")) {
            employee emp = new employee(typeCustomer);

            System.out.println("What would you like to purchase? The entire package includes membership, classes, retail, " +
                    "aquatics, and a personal trainer. You can also purchase each individually\nType \"package\" to " +
                    "include everything or enter \"other\"");
            String purchase = sc.nextLine();
            if (purchase.equalsIgnoreCase("package"))
            {
                emp.memberships();
                emp.classes();
                emp.employeeRetail();
                emp.aquatics();
                emp.personalTrainer();
            }
            else {
                while (true) {
                    System.out.println("Enter item (Type- membership, classes, retail, aquatics, or pt) or type any key to stop");
                    String item = sc.nextLine();
                    if(item.equals("membership"))
                    {
                        emp.memberships();
                    }
                    else if(item.equals("classes"))
                    {
                        emp.classes();
                    }
                    else if(item.equals("retail"))
                    {
                        emp.employeeRetail();
                    }
                    else if(item.equals("aquatics"))
                    {
                        emp.aquatics();
                    }
                    else if(item.equals("pt"))
                    {
                        emp.personalTrainer();
                    }
                    else {
                        break;
                    }
                }
            }

            System.out.println("Bill: $" + emp.bill());
        }
        else {
            System.out.println("Oops! invalid response try again");
        }


    }
}
