class Headphone {

  static int checkPrice() {
     int price = 1500;
     System.out.println(price);
     return price;
 }
  static void showBrand(String brand) {
    System.out.println(brand);

   int p = checkPrice();
   System.out.println(p);
}
  static void useHeadphone() {
  System.out.println("Headphone in use");
    showBrand("Boat");
    }
}