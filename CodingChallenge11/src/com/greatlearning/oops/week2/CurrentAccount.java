package com.greatlearning.oops.week2;

class CurrentAccount extends Account

{

        int currentBalance;

        CurrentAccount(String a, int b, int c)

        {

                super(a,b);

                currentBalance=c;

        }

        void display()

        {

                super.display();

                System.out.println ("Current Balance: "+currentBalance);

        }

}