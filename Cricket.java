class Cricket {
  public static void main(String []args){

    System.out.println("Are you ready to play");
    getCricket();
    System.out.println("How many runs did you score");
    int firstMatchRuns = 120;
    int secondMatchRuns = 85;
    boolean isCaptain = true;
    tosay(firstMatchRuns, secondMatchRuns, isCaptain);
 
    double strikeRate = getYourStrikeRate();
    System.out.println(strikeRate);
    System.out.println(" Hi Cricket what is your strike rate");
  }
  static void getCricket(){
    System.out.println("Yes I am ready to play");
  }
  static void tosay(int firstMatchRuns, int secondMatchRuns, boolean isCaptain){
    System.out.println("Ok I will tell you");
    int totalRuns = firstMatchRuns + secondMatchRuns;
    System.out.println(totalRuns);
    System.out.println(isCaptain);
  }
  static double getYourStrikeRate(){
    System.out.println("Wait a minute");
    double strikeRate = 145.5;
    System.out.println("Now I know my strike rate");
    return strikeRate;
  }
}