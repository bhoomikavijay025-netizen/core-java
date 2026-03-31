class ClothRunner {

    public static void main(String[] args) {

    System.out.println("Cloth Details");
  Cloth.getCloth();
   Cloth.tosay("Shirt", true);
   String brandName = Cloth.getBrand();
     System.out.println("Brand Name: " + brandName);
     int totalAmount = Cloth.totalCost(1200, 2);
    System.out.println("Total Cost: " + totalAmount);
    }
}