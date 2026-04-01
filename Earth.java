class Earth {
  public static void main(String []args){

    System.out.println("Are you rotating");
    getEarth();
  
    System.out.println("How many hours do you rotate");
    int morning = 6;
    int evening = 18;
    boolean isRound = true;
    tosay(morning, evening, isRound);
 
    double distanceFromSun = getYourDistance();
    System.out.println(distanceFromSun);
    System.out.println(" Hi Earth what is your distance from Sun");
  }

  static void getEarth(){
    System.out.println("Yes I am rotating");
  }
  static void tosay(int morning, int evening, boolean isRound){
    System.out.println("Ok I will tell you");
    int hours = evening - morning;
    System.out.println(hours);
    System.out.println(isRound);
  }
static double getYourDistance(){
    System.out.println("Wait a minute");
    double distance = 149600000.0;   // distance in km
    System.out.println("Now I know my distance");
    return distance;
  }
}