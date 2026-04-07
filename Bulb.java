class Bulb {

    static int checkPower() {
     int power = 60;
     System.out.println(power);
     return power;
  }
  static void showType(String type) {
   System.out.println(type);

  int p = checkPower();
    System.out.println(p);
 }
   static void glowBulb() {
        System.out.println("Bulb glowing");

    showType("LED");
    }
}