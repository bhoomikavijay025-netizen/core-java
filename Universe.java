class Universe {

    String firstName = "world";
    String secondName = "globe";

    Universe() {
     this("world", "globe");
     System.out.println("Universe Const 1");
 }
    Universe(String firstName, String secondName) {
	
    System.out.println("Universe Const 2");	
    System.out.println("firstName : " + firstName);
    System.out.println("secondName : " + secondName);
    }
}