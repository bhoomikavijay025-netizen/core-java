class Soil{
public static void main(String []args){
  	 short depth;
	 byte fertilityLevel;
	 double phValue;
	 char soilType;
	 boolean isSuitableForFarming;
	 depth = 140;
	 fertilityLevel = 6;
	  phValue = 6.5;
	  soilType = 'P';
	 isSuitableForFarming = true;
	 
  	  System.out.println("depth:" +depth);
	 System.out.println("fertilityLevel:" +fertilityLevel);
	 System.out.println("phValue:" +phValue);
	 System.out.println("soilType:" +soilType);
	 System.out.println("isSuitableForFarming:" +isSuitableForFarming);
	   	 depth = 120;
	 fertilityLevel = 7;
	  phValue = 7.5;
	  soilType = 'L';
	 isSuitableForFarming = false;

  	  System.out.println("depth:" +depth);
	 System.out.println("fertilityLevel:" +fertilityLevel);
	 System.out.println("phValue:" +phValue);
	 System.out.println("soilType:" +soilType);
	 System.out.println("isSuitableForFarming:" +isSuitableForFarming);

  
}
}