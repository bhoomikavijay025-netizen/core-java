class AllMobiles {
         public static void main(String[] args){
System.out.println("Samsung Mobiles");
   String[] samsung = Samsung.getSamsungPhones();
    for(String s : samsung){
     System.out.println(s);
     }
	 System.out.println("Vivo Mobiles");
     String[] vivo = Vivo.getModelNames();
  for(String v : vivo){
      System.out.println(v);
    }
     System.out.println("Oppo Mobiles");
      String[] oppo = Oppo.getOppoModels();
    for(String o : oppo){
         System.out.println(o);
    }
	System.out.println("Realme Mobiles");
    String[] realme = Realme.getRealmeModels();
  for(String r : realme){
    System.out.println(r);
        }
 System.out.println("Sony Mobiles");
      String[] sony = Sony.getSonyModels();
      for(String so : sony){
        System.out.println(so);
	}
}
}