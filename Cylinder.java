class Cylinder{
   static String [] brandName = {"HP","BHARATh"};
   static String[] customerName ={" john","sandy"};
   static void getbrandName(){

	   System.out.println("BrandName" );
	   
	   for (String brand: brandName){
		   System.out.println(brand);
	   }
	   }
    static String[] getCustomer(){
		return customerName;
	}
   }