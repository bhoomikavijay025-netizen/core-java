class Bulb {

    static void getBulb() {
 System.out.println("This is Bulb information");
    }
    static void tosay(int watt, boolean isLed) {
    System.out.println("Watt: " + watt);
     System.out.println("LED Bulb: " + isLed);
    }
    static String getBrand() {
        return "Philips";
    }
    static int totalPrice(int price, int quantity) {
   int total = price * quantity;
   return total;
    }
}