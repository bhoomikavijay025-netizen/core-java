class Yahoo {
    String name;
    String email;
    long phone;
    String city;

    public Yahoo(String name, String email, long phone, String city) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public void display() {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(city);
        System.out.println("^^^^^^^^^^^^^");
    }
}