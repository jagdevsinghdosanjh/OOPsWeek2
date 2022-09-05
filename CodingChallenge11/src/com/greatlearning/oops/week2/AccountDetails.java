package com.greatlearning.oops.week2;

class AccountDetails extends CurrentAccount
{
	int depositAmount, withdrawalAmount;
	
	AccountDetails(String a, int b, int c, int d, int e){
		super(a,b,c);
		depositAmount=d;
		withdrawalAmount=e;
      }

        void display()

        {      
        	super.display();
        	System.out.println("Deposit Amount:"+depositAmount);
        	System.out.println("Withdrawal Amount:"+withdrawalAmount);
        	
        }

}
