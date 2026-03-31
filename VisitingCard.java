class VisitingCardRunner {
    public static void main(String[] args) {

  VisitingCard v1 = new VisitingCard();
  v1.name = "Motu";
   v1.address = "Furfuri Nagar";
   v1.contactNumber = 123456789;
   v1.profession = "Worker";

   VisitingCard v2 = new VisitingCard();
   v2.name = "Patlu";
   v2.address = "Furfuri Nagar";
   v2.contactNumber = 987654321;
  v2.profession = "Engineer";

   VisitingCard v3 = new VisitingCard();
  v3.name = "Chingam";
    v3.address = "Furfuri Nagar";
   v3.contactNumber = 456789123;
   v3.profession = "Police";

   System.out.println("~~~~~~~ information ~~~~~~~~~");
    System.out.println("v1 name: " + v1.name);
   System.out.println("v1 address: " + v1.address);
   System.out.println("v1 contact: " + v1.contactNumber);
   System.out.println("v1 profession: " + v1.profession);

    System.out.println("~~~~~~~ information ~~~~~~~~~");
   System.out.println("v2 name: " + v2.name);
   System.out.println("v2 address: " + v2.address);
    System.out.println("v2 contact: " + v2.contactNumber);
    System.out.println("v2 profession: " + v2.profession);

    System.out.println("~~~~~~~ information ~~~~~~~~~");
    System.out.println("v3 name: " + v3.name);
    System.out.println("v3 address: " + v3.address);
    System.out.println("v3 contact: " + v3.contactNumber);
   System.out.println("v3 profession: " + v3.profession);

    }
}