class Bag{

    int findCapacity() {
     int capacity = 20;
     System.out.println(capacity);
     return capacity;
 }
  void printBrand(String brand) {
   System.out.println("brand name is:"+brand);
   int c = findCapacity();
   System.out.println(c);
 }
  void openBag() {
   System.out.println("Bag opened");
      printBrand("Mandya tarpaulins");
    }
}