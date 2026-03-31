class PassBookRunner {
    public static void main(String[] args) {

 PassBook acc1 = new PassBook();
    acc1.accountHolderName = "Bhim";
  acc1.accountNumber = 1001;
  acc1.balance = 25015;
  acc1.phoneNumber = 9876543210L;

  PassBook acc2 = new PassBook();
  acc2.accountHolderName = "Dolu";
  acc2.accountNumber = 1002;
  acc2.balance = 1800.50;
  acc2.phoneNumber = 9123456780L;

   PassBook acc3 = new PassBook();
   acc3.accountHolderName = "Bolu";
   acc3.accountNumber = 1003;
   acc3.balance = 3200;
  acc3.phoneNumber = 9988776655L;

   System.out.println(" +++++++ Acc HOlder details +++++++");
   System.out.println("acc1 name: " + acc1.accountHolderName);
   System.out.println("acc1 number: " + acc1.accountNumber);
   System.out.println("acc1 balance: " + acc1.balance);
     System.out.println("acc1 phone: " + acc1.phoneNumber);

   System.out.println(" +++++++ Acc HOlder details +++++++");
   System.out.println("acc2 name: " + acc2.accountHolderName);
  System.out.println("acc2 number: " + acc2.accountNumber);
   System.out.println("acc2 balance: " + acc2.balance);
   System.out.println("acc2 phone: " + acc2.phoneNumber);

   System.out.println(" +++++++ Acc HOlder details +++++++");
   System.out.println("acc3 name: " + acc3.accountHolderName);
   System.out.println("acc3 number: " + acc3.accountNumber);
   System.out.println("acc3 balance: " + acc3.balance);
   System.out.println("acc3 phone: " + acc3.phoneNumber);

   
   
    }
	}