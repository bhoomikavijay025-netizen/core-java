class Plate {

   static String brand;
   static int diameter;
   static double price;
   static boolean isSteel;
   static long productCode;
   static char size;
   static float weight;

   public static void setBrand(String b){
	   brand = b;
 System.out.println("Brand: " + brand);
   }
   public static void setDiameter(int d){
  diameter = d;
   System.out.println("Diameter: " + diameter);
 }
public static void setPrice(double p){
   price = p;
   System.out.println("Price: " + price);
 }
   public static void setIsSteel(boolean s){
	   isSteel = s;
   System.out.println("Steel: " + isSteel);
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