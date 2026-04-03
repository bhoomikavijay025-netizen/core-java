class Travelling {

    String name;
    String destination;
    int budget;

    // 1. Full details (booking)
    public Travelling(String name, String destination, int budget) {
        this.name = name;
        this.destination = destination;
        this.budget = budget;

        System.out.println("Travel booked successfully");
    }

    // 2. Only name (login)
    public Travelling(String name) {
        this.name = name;

        System.out.println(name + " logged in successfully");
    }

    // 3. Name + destination (view plan)
    public Travelling(String name, String destination) {
        System.out.println("Name: " + name);
        System.out.println("Destination: " + destination);
    }
}