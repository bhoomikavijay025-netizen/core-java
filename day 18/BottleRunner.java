class BottleRunner {
   public static void main(String[] args) {

      Bottle.setBrand("Milton");
      Bottle.setCapacity(1000);
      Bottle.setPrice(499.0);
      Bottle.setIsReusable(true);
      Bottle.setProductCode(222222L);
      Bottle.setSize('L');
      Bottle.setWeight(0.8f);
	  
	  Bottle.setBrand("Siri");
      Bottle.setCapacity(500);
      Bottle.setPrice(420.0);
      Bottle.setIsReusable(false);
      Bottle.setProductCode(111122L);
      Bottle.setSize('L');
      Bottle.setWeight(1.8f);
   }
}