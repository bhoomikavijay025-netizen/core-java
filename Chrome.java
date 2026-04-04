class Chrome{

   String firstName = "Rahul";
    String secondName = "Arjun";

    Chrome(){
    this("Rahul", "Arjun");
     System.out.println("Chrome Const 1");
    }

    Chrome(String firstName, String secondName) {
    System.out.println("Chrome Const 2");
     System.out.println("firstName : " + firstName);
     System.out.println("secondName : " + secondName);
    }
}

