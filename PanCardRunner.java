class PanCardRunner {
    public static void main(String[] args) {

  PanCard person1 = new PanCard();
  person1.name = "ruby";
 person1.age = 25;
 person1.panNumber = "ABCDE1234F";
   person1.isValid = true;

  PanCard person2 = new PanCard();
 person2.name = "muddu";
   person2.age = 30;
 person2.panNumber = "PQRSX5678L";
  person2.isValid = true;

   PanCard person3 = new PanCard();
   person3.name = "mudduma";
   person3.age = 28;
   person3.panNumber = "LMNOP4321K";
   person3.isValid = false;

       System.out.println("##### pancard info #####");
        System.out.println("person1 name: " + person1.name);
        System.out.println("person1 age: " + person1.age);
        System.out.println("person1 panNumber: " + person1.panNumber);
        System.out.println("person1 isValid: " + person1.isValid);

  System.out.println("##### pancard info #####");
  System.out.println("person2 name: " + person2.name);
   System.out.println("person2 age: " + person2.age);
  System.out.println("person2 panNumber: " + person2.panNumber);
  System.out.println("person2 isValid: " + person2.isValid);

  System.out.println("##### pancard info #####");
  System.out.println("person3 name: " + person3.name);
  System.out.println("person3 age: " + person3.age);
 System.out.println("person3 panNumber: " + person3.panNumber);
  System.out.println("person3 isValid: " + person3.isValid);

  
  
 }
}