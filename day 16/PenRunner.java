class PenRunner {

    public static void main(String[] args) {

   System.out.println("Pen Details");
   Pen.getPen();
  Pen.tosay( true);
 String brandName = Pen.getBrand();
 System.out.println("Brand Name: " + brandName);  
  int totalAmount = Pen.totalCost(10, 5);
  System.out.println("Total Cost: " + totalAmount);
    }
}