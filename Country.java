class Country{
    // Static Variables 
    static String name = "USA";
    static int population = 1300000;
	static boolean isDeveloping = false;
	static double area= 55667.1;
	static char currencySymbol ='$';
    public static void main(String[] args) {

        // Local Variables
    String name = "India";
     int population =2500000;
	  boolean isDeveloping= true;
    double area= 5.5;
    char currencySymbol ='*';


        // Printing Static Variables
        System.out.println("name:" +name);
        System.out.println("population:"+population);
        System.out.println("isDeveloping:" +isDeveloping);
        System.out.println("area:" +area);
        System.out.println("currencySymbol:" +currencySymbol);

        // Printing Local Variables
		   System.out.println("name:" +name);
        System.out.println("population:"+population);
        System.out.println("isDeveloping:" +isDeveloping);
        System.out.println("area:" +area);
        System.out.println("currencySymbol:"+currencySymbol);
   }
   }
   