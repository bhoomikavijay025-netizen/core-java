class Toy {

    static String toyName = "Remote Car"; 
    static int toyId = 101;            
    static double rating = 4.5;           
    static float price = 599.5f;         
    static long totalSold = 20000L;         
    static boolean isBatteryOperated = true;
    static char toyCategory = 'A';         

    static String getToyName(){
   return toyName;
  }
 static int getToyId() {
     return toyId;
 }
 static double getRating() {
  return rating;
 }
  static float getPrice(){
 return price;
  }
    static long getTotalSold(){
   return totalSold;
   }
 static boolean getIsBatteryOperated(){
    return isBatteryOperated;
  }
  static char getToyCategory(){
  return toyCategory;
    }
}