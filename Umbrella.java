class Umbrella {

    static int findSize() {
      int size = 3;
      System.out.println(size);
       return size;
  }
    static void showColor(String color) {
    System.out.println(color);
	int s = findSize();
     System.out.println(s);
  }
    static void openUmbrella() {
     System.out.println("Umbrella opened");

  showColor("Black");
    }
}