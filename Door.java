class Door {

  static int measureHeight() {
  int height = 7;
   System.out.println(height);
   return height;
  }
  static void showMaterial(String material) {
   System.out.println( "material is :"+material);

    int h = measureHeight();
    System.out.println(h);
 }
    static void openDoor() {
     System.out.println("Door opened");

     showMaterial("Wood");
    }
}