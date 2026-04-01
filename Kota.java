class Kota {
    String username;
    String email;
    String password;

    public Kota(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void display() {
        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
  
    }
}