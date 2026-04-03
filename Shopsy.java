class Shopsy {

    String username;
    String email;
    String password;

    public Shopsy(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

        System.out.println("Signup completed successfully");
    }
    public Shopsy(String username) {
        this.username = username;
        System.out.println(username + " logged in successfully");
    }
    public Shopsy(String username, String email) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}