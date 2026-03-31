class Shoes {
 
    static void getShoes() {
        System.out.println("This is Shoes information");
    } 
    static void tosay(String brand, int price) {
     System.out.println("Brand: " + brand);
   System.out.println("Price: " + price);
	}
	
    static String getBrand() {
    return "Nike";
    }
    static int totalPrice(int price, int quantity) {
        int total = price * quantity;
        return total;
    }
	
	
}