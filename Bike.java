class Bike {

    int getMileage() {
    int mileage = 60;
     System.out.println(mileage);
       return mileage;
  }
    void displayBrand(String brand) {
     System.out.println(brand);
      int mileage = getMileage();
      System.out.println(mileage);
 }
  void showDetails() {
    System.out.println("Bike details");

     displayBrand("Bullet");
 }
}