class Football {

  public static void main(String []args){
    System.out.println("Are you ready to play");
    getFootball();
 
    System.out.println("How many goals did you score");
    int firstMatchGoals = 3;
    int secondMatchGoals = 2;
    boolean isCaptain = false;
    tosay(firstMatchGoals, secondMatchGoals, isCaptain);
    double passAccuracy = getYourPassAccuracy();
    System.out.println(passAccuracy);
    System.out.println("Hi Football what is your pass accuracy");
  }
 static void getFootball(){
    System.out.println("Yes I am ready to play");
  }
  static void tosay(int firstMatchGoals, int secondMatchGoals, boolean isCaptain){
    System.out.println("Ok I will tell you");
    int totalGoals = firstMatchGoals + secondMatchGoals;
    System.out.println(totalGoals);
    System.out.println(isCaptain);
  }
  static double getYourPassAccuracy(){
    System.out.println("Wait a minute");
    double passAccuracy = 89.7;
    System.out.println("Now I know my pass accuracy");
    return passAccuracy;
  }
  
}