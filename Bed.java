class Bed {

 static int getSize() {
 int size = 6;
  System.out.println(size);
   return size;
  }
  static void showType(String type) {
   System.out.println(type);

   int s = getSize();
   System.out.println(s);
  }
  static void useBed() {
   System.out.println("Bed in use");

   showType("King Size");
 }
}