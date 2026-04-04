class Notepad1{

    String firstName = "Kushi";
   String secondName = "Chari";

    Notepad1() {
    this("Kushi", "Chari");
      System.out.println("Notepad1 Const 1");
    }
    Notepad1(String firstName, String secondName) {
    System.out.println("Notepad1 Const 2");
	
   System.out.println("firstName : " + firstName);
      System.out.println("secondName : " + secondName);
    }
}

