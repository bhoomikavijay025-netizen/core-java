class Fan{

  static int checkSpeed() {
     int speed = 5;
     System.out.println(speed);
     return speed;
 }
  static void showBrand(String brand) {
    System.out.println(brand);
   int s = checkSpeed();
   System.out.println(s);
  }
  static void startFan() {
    System.out.println("Fan started");
     showBrand("Rally");
  }
}