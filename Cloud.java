class Cloud{

    int getHeight() {
      int height = 1000;
      System.out.println(height);
     return height;
  }
  void getType(String type) {
   System.out.println(type);

     int height = getHeight();
	System.out.println( "height is:" +height);
 }

  void showDetails() {
   System.out.println("Cloud details");

     getType("Cumulus");
    }
}