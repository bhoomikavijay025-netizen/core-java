class Cake {

    String name;
    String flavor;
    int price;
	
    public Cake(String name, String flavor, int price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;

  System.out.println("Cake order placed successfully");
  }
    public Cake(String name) {
        this.name = name;

        System.out.println(name + " cake selected");
    }
    public Cake(String name, String flavor) {
        System.out.println("Cake Name: " + name);
        System.out.println("Flavor: " + flavor);
    }
}