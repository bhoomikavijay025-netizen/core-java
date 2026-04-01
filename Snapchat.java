class Snapchat {

    String name;
    String email;
    String password;
    int streak;   

    public Snapchat(String p1, String p2, String p3, int p4) {
        name = p1;
        email = p2;
        password = p3;
        streak = p4;
    }

    void display() {
        System.out.println(name);
        System.out.println(email);
        System.out.println(password);
        System.out.println(streak);
    }
}