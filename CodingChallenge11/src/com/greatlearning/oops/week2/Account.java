package com.greatlearning.oops.week2;

class Account

{
    String customerName;
	int accountNo;
      

        Account(String a, int b)

        {
            customerName=a;
        	accountNo=b;

         }

        void display()

       {    
        	System.out.println("Account Holder Name:"+customerName);
        	System.out.println("Account Number is:"+accountNo);

        }

}

