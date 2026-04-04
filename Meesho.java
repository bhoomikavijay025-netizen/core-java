class Meesho {
   String firstName = "Chandu";
    String secondName = "John";

    Meesho() {
    this("Chandu", "John");
     System.out.println("Meesho Const 1");
    }
    Meesho(String firstName, String secondName) {
    System.out.println("Meesho Const 2");
    System.out.println("firstName : " + firstName);
    System.out.println("secondName : " + secondName);
    }
}

 