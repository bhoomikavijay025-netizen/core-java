class Oil {
   int checkQuantity() {
    int qty = 2;
    System.out.println(qty);
	return qty;
}
   void showName(String name){
   System.out.println(name);
    int q = checkQuantity();
    System.out.println(q);
  }
  void useOil(){
   System.out.println("Oil used");
    showName("Coconut Oil");
 }
}