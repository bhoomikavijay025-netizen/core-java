class Wire{
  static int measureLength() {
     int length = 10;
     System.out.println(length);
     return length;
  }
  static void showType(String type) {
   System.out.println(type);

    int l = measureLength();
    System.out.println(l);
 }
  static void connectWire() {
   System.out.println("Wire connected");
 showType("Copper");
    }
}