class Star{

    String firstName = "Stellar";
    String secondName = "Nova";
    Star() {
      this("Stellar", "Nova");
      System.out.println("Star Const 1");
    }
    Star(String firstName, String secondName) {
     System.out.println("Star Const 2");
      System.out.println("firstName : " + firstName);
      System.out.println("secondName : " + secondName);
    }
}

  