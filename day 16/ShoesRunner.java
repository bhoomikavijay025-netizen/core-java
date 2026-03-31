class ShoesRunner {

    public static void main(String[] args) {

   System.out.println("Shoes Details");
 Shoes.getShoes();
  Shoes.tosay("Puma", 3500);
    String brandName = Shoes.getBrand();
 System.out.println("Brand Name: " + brandName);
 int totalAmount = Shoes.totalPrice(3500, 2);
   System.out.println("Total Price: " + totalAmount);
    }
}