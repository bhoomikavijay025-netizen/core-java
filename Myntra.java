class Myntra {

    String firstName = "Siri";
    String secondName = "Sahana";

    Myntra(){
    this("Siri", "Sahana");
    System.out.println("Myntra Const 1");
    }
    Myntra(String firstName, String secondName) {
      System.out.println("Myntra Const 2");
      System.out.println("firstName : " + firstName);
       System.out.println("secondName : " + secondName);
    }
}

