class House{

    String owner;
    String location;
    int price;
    public House(String owner, String location, int price) {
        this.owner = owner;
        this.location = location;
        this.price = price;

        System.out.println("House details added successfully");
    }
    public House(String owner) {
        this.owner = owner;

        System.out.println(owner + " accessed house details");
    }
    public House(String owner, String location) {
        System.out.println("Owner: " + owner);
        System.out.println("Location: " + location);
    }
}