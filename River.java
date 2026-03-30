class River {
	
  public static void main(String []args){

    System.out.println("Are you flowing");
    getRiver();
  
    System.out.println("How many kilometers do you flow");
    int stateOneKm = 300;
    int stateTwoKm = 450;
    boolean isClean = true;

    tosay(stateOneKm, stateTwoKm, isClean);
 
    double depthOfRiver = getYourDepth();
    System.out.println(depthOfRiver);
    System.out.println(" Hi River what is your depth");
  }
  static void getRiver(){
    System.out.println("Yes I am flowing");
  }
  static void tosay(int stateOneKm, int stateTwoKm, boolean isClean){
    System.out.println("Ok I will tell you");
    int totalKm = stateOneKm + stateTwoKm;
    System.out.println(totalKm);
    System.out.println(isClean);
  }

  static double getYourDepth(){
    System.out.println("Wait a minute");
    double depth = 35.7;
    System.out.println("Now I know my depth");
    return depth;
  }
  
}