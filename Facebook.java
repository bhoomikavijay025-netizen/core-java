class Facebook{

    String name;
    String email;
    String password;
    char gender;

   
   public Facebook( String p1,String p2, String p3, char p4){
 name =p1;
 email = p2;
 password =p3;
 gender =p4;
    }

    void display(){
  System.out.println(name);
 System.out.println(email);
 System.out.println(password);
 System.out.println(gender);
    }
}