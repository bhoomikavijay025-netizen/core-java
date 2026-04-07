class Phone{

    int getPrice(){
    int price = 15000;
     System.out.println(price);
	 return price;
 }
    void displayBrand(String brand){
      System.out.println( brand);

   int price = getPrice();
   System.out.println( price);
   }
    void showDetails(){
     System.out.println("Phone details");

     displayBrand("motorila");
 }
}