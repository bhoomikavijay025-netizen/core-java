class Chair {

    static int getHeight() {
     int height = 4;
      System.out.println(height);
        return height;
  }
    static void displayType(String type) {
       System.out.println( "type is:"+type);
        int h = getHeight();
        System.out.println(h);
 }
    static void sitChair() {
    System.out.println("Sitting on chair");
   displayType("Plastic");
    }
}