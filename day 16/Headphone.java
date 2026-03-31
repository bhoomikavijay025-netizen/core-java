class Headphone {

    static void getHeadphone() {
    System.out.println("This is Headphone information");
    }
    static void tosay(String brand, int price, boolean isWireless) {
    System.out.println("Brand: " + brand);
    System.out.println("Price: " + price);
      System.out.println("Wireless: " + isWireless);
 }
 static String getBrand() {
   return "Sony";
  }
   static int totalCost(int price, int quantity) {
     int total = price * quantity;
   return total;
    }
}