class Awwwards {
    String username;
    String email;
    String password;
    int age;
    String country;

    public Awwwards(String username, String email, String password, int age, String country) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.country = country;
    }

    public void display() {
        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
        System.out.println(age);
        System.out.println(country);
    }
}