class Ring {

  static int checkWeight() {
  int weight = 2;
  System.out.println(weight);
  return weight;
 }
 static void showMaterial(String material) {
   System.out.println(material);

   int w = checkWeight();
   System.out.println(w);
 }
  static void wearRing() {
   System.out.println("Ring worn");

   showMaterial("Gold");
    }
}