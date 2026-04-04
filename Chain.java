class Chain {

    String firstName;
    String secondName;

    Chain() {
   this("Mery");
    System.out.println("Const 1");
  }
    Chain(String firstName) {
   this(firstName, "John");
    System.out.println("Const 2");
   }
    Chain(String firstName, String secondName) {
   this(firstName, secondName, 101);
   System.out.println("Const 3");
 }
    Chain(String firstName, String secondName, int id) {
     this.firstName = firstName;
     this.secondName = secondName;

      System.out.println("Const 4");
      System.out.println("firstName : " + firstName);
     System.out.println("secondName : " + secondName);
  System.out.println("id : " + id);
    }
}