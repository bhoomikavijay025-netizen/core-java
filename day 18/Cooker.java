class Cooker {

   static String brand;
   static int pressure;
   static double capacity;
   static boolean isElectric;
   static long price;
   static char size;
   static float weight;

   public static void setBrand(String brandName){
 brand = brandName;
   System.out.println( brand);
   }
   public static void setPressure(int pressure){
   pressure = pressure;
  System.out.println( pressure);
 }
   public static void setCapacity(double capacity){
 capacity = capacity;
  System.out.println( capacity);
 }
   public static void setIsElectric(boolean electric){
   isElectric = electric;
     System.out.println( isElectric);
 }
   public static void setPrice(long price){
  price = price;
    System.out.println (price);
   }
   public static void setSize(char size){
 size = size;
 System.out.println( size);
   }
   public static void setWeight(float weight){
 weight = weight;
 System.out.println(weight);
   }
}