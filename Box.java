class Box {

   static int getVolume() {
     int volume = 100;
     System.out.println("Volume is: " + volume);
      return volume;
  }

  static void setColor(String color) {
   System.out.println("Color is: " + color);
    int volume = getVolume(); 
     System.out.println("Returned Volume");
  }

  static void openBox() {
   System.out.println("Box opened");

     setColor("blue");
  }
}