class Google {
    String username;
    String email;
    String password;
    long phoneNumber;
    String location;

    public Google(String username, String email, String password, long phoneNumber, String location) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    public void display() {
        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
        System.out.println(phoneNumber);
        System.out.println(location);
    }
}