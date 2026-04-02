class Webflow {
    String email;
    String password;
    int userId;

    public Webflow(String email, String password, int userId) {
        this.email = email;
        this.password = password;
        this.userId = userId;
 }
 
    public void display() {
        System.out.println(email);
        System.out.println(password);
        System.out.println(userId);
        System.out.println("-------------------");
    }
}