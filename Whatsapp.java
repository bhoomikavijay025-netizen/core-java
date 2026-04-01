class Whatsapp {

    String userName;
    String phoneNumber;
    String status;
    char gender;
  

    public Whatsapp(String p1, String p2, String p3, char p4){
        userName = p1;
        phoneNumber = p2;
        status = p3;
        gender = p4;
    
    }

    void display(){
        System.out.println(userName);
        System.out.println(phoneNumber);
        System.out.println(status);
        System.out.println(gender);
    }
}