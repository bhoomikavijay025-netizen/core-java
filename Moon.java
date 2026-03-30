class Moon {
  public static void main(String []args){

    System.out.println("Are you Shining");
    getMoon();
  
    System.out.println("When do you appear");
    int evening = 6;
    int night = 12;
    boolean isFullMoon = true;
    tosay(evening, night, isFullMoon);
	
    double distanceOfMoon = getYourDistance();
    System.out.println(distanceOfMoon);
    System.out.println(" Hi Moon what is your distance from Earth");
  }
  static void getMoon(){
    System.out.println("Yes I am Shining");
  }
  static void tosay(int evening, int night, boolean isFullMoon){
    System.out.println("Ok I will tell you");
    int time = night - evening;
    System.out.println(time);
    System.out.println(isFullMoon);
  }
  static double getYourDistance(){
    System.out.println("Wait a minute");
    double distance = 384400.0; 
    System.out.println("I know my distance now");
    return distance;
  }
}