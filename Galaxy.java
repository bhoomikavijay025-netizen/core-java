class Galaxy {

 String firstName = "universe";
  String secondName = "world";

  Galaxy(){
    this("universe", "world");
   System.out.println("Galaxy Const 1");
 }
    Galaxy(String firstName, String secondName) {
    System.out.println("Galaxy Const 2");
   System.out.println(firstName);
   System.out.println(secondName);
    }
}