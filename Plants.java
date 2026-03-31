class Plants{
public static void main(String []args){
  byte leafCount;
  String plantName;
  char type;
  float height;
  boolean isMedicinal;
  
  leafCount = 40;
  plantName = "Tulsi";
  type = 'F';
  height = 1.3f;
  isMedicinal = true;
  
  System.out.println("leafCount:" +leafCount);
	 System.out.println("plantName:" +plantName);
	 System.out.println("type:" +type);
	 System.out.println("height:" +height);
	 System.out.println("isMedicinal:" +isMedicinal);
	 
	 leafCount = 10;
  plantName = "Bambo";
  type = 'T';
  height = 59.3f;
  isMedicinal = false;
       System.out.println("leafCount:" +leafCount);
	 System.out.println("plantName:" +plantName);
	 System.out.println("type:" +type);
	 System.out.println("height:" +height);
	 System.out.println("isMedicinal:" +isMedicinal);
	 
}
}