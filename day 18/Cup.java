class Cup {

   static String brand;
   static int capacity;
   static double price;
   static boolean isDisposable;
   static long productCode;
   static char size;
   static float weight;

   public static void setBrand(String b){
      brand = b;
      System.out.println("Brand: " + brand);
   }

   public static void setCapacity(int c){
      capacity = c;
      System.out.println("Capacity: " + capacity);
   }

   public static void setPrice(double p){
      price = p;
      System.out.println("Price: " + price);
   }

   public static void setIsDisposable(boolean d){
      isDisposable = d;
      System.out.println("Disposable: " + isDisposable);
   }

   public static void setProductCode(long pc){
      productCode = pc;
      System.out.println("Code: " + productCode);
   }

   public static void setSize(char s){
      size = s;
      System.out.println("Size: " + size);
   }

   public static void setWeight(float w){
      weight = w;
      System.out.println("Weight: " + weight);
   }
}