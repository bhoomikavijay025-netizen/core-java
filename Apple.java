class Apple {
   static String[] applePhones = {"iPhone 11","iPhone 12","iPhone 13","iPhone 14","iPhone 15","iPhone SE","iPhone 12 Mini","iPhone 13 Mini"};
  static double[] appleCost = {50000,60000,70000,80000,90000,40000,55000,65000};
    static int[] appleBatteryPower = {3110,2815,3240,3279,3349,2018,2227,2406};
      static int[] appleRamSize = {4,4,4,6,6,3,4,4};
  static int[] appleMemorySize = {64,746,768,756,326,64,128,256};

     public static void main(String[] args){

        String[] phones = getApplePhones();
   double[] cost = getAppleCost();
   int[] battery = getAppleBatteryPower();
    int[] ram = getAppleRamSize();
     int[] memory = getAppleMemorySize();

     for(String p : phones){
     System.out.println(p);
        }
     for(double c : cost){
        System.out.println(c);
     }
for(int b : battery){
		System.out.println(b);
   }
   for(int r : ram){
   System.out.println(r);
    }
        for(int m : memory){
  System.out.println(m);
        }
    }
    static String[] getApplePhones(){
    return applePhones;
 }
  static double[] getAppleCost(){
     return appleCost;
  }
    static int[] getAppleBatteryPower(){
     return appleBatteryPower;
    }
   static int[] getAppleRamSize(){
      return appleRamSize;
    }
  static int[] getAppleMemorySize(){
  return appleMemorySize;
    }
}