class HeadphoneRunner {

    public static void main(String[] args) {
  System.out.println("Headphone Details");

    Headphone.getHeadphone();
    Headphone.tosay("Boat", 2500, true);
   String brandName = Headphone.getBrand();
   System.out.println("Brand Name: " + brandName);
   int totalAmount = Headphone.totalCost(2500, 2);
     System.out.println("Total Cost: " + totalAmount);
    }
}