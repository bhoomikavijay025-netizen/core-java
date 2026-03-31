class ATMCardRunner {
    public static void main(String[] args) {

   ATMCard user1 = new ATMCard();
   user1.name = "Oggi";
   user1.cardNumber = 1111;
   user1.balance = 5000.50;
   user1.phoneNumber = 9876543210L;

   ATMCard user2 = new ATMCard();
   user2.name = "cockroach";
   user2.cardNumber = 2222;
   user2.balance = 7500.75;
   user2.phoneNumber = 9123456780L;
  ATMCard user3 = new ATMCard();
 user3.name = "Olivia";
 user3.cardNumber = 3333;
 user3.balance = 9000.00;
 user3.phoneNumber = 9988776655L;

  System.out.println(" ***** printing the information*****");
  System.out.println("user1 name: " + user1.name);
  System.out.println("user1 cardNumber: " + user1.cardNumber);
  System.out.println("user1 balance: " + user1.balance);
  System.out.println("user1 phone: " + user1.phoneNumber);

   System.out.println(" ***** printing the information*****");
   System.out.println("user2 name: " + user2.name);
   System.out.println("user2 cardNumber: " + user2.cardNumber);
   System.out.println("user2 balance: " + user2.balance);
  System.out.println("user2 phone: " + user2.phoneNumber);

   System.out.println(" ***** printing the information*****");
   System.out.println("user3 name: " + user3.name);
    System.out.println("user3 cardNumber: " + user3.cardNumber);
    System.out.println("user3 balance: " + user3.balance);
   System.out.println("user3 phone: " + user3.phoneNumber);

    }
}