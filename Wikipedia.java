class Wikipedia{
  String username;
  String password;
  String email;
	
   public Wikipedia(){
 }
    public Wikipedia(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
    }
  public void display(){
     System.out.println(username);
     System.out.println(password);
     System.out.println(email);
     System.out.println("-------------------");
    }
}