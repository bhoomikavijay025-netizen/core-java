class AC {
      static int checkTemp() {
        int temp = 24;
        System.out.println(temp);
        return temp;
}
   static void showBrand(String brand) {
     System.out.println( "brand name:"+brand);

     int t = checkTemp();
       System.out.println(t);
 }
   static void startAC() {
    System.out.println("AC started");

     showBrand("LG");
    }
}