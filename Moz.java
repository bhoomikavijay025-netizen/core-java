class Moz{
    String username;
    String email;
    String password;
    int userId;

    public Moz(){
  }
    public Moz(String username, String email, String password, int userId) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.userId = userId;
  }
    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("User ID: " + userId);
    }
}