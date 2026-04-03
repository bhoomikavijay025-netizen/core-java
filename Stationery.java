class Stationery {

    String itemName;
    String brand;
    int price;
    public Stationery(String itemName, String brand, int price) {
        this.itemName = itemName;
        this.brand = brand;
        this.price = price;

   System.out.println("Stationery item added successfully");
  }
    public Stationery(String itemName) {
        this.itemName = itemName;

     System.out.println(itemName + " accessed successfully");
   }
    public Stationery(String itemName, String brand) {
        System.out.println("Item Name: " + itemName);
        System.out.println("Brand: " + brand);
    }
}