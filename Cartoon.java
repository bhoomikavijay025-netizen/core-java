class Cartoon {

    String name;
    String role;
    int age;
    public Cartoon(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;

        System.out.println("Cartoon created successfully");
    }
    public Cartoon(String name){
        this.name = name;

        System.out.println(name + " signed in successfully");
    }
    public Cartoon(String name, String role) {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
}