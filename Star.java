class Star {
  public static void main(String []args){

    System.out.println("Are you Twinkling");
    getStar(); 
    System.out.println("When do you appear");
    int evening = 7;
    int midnight = 12;
    boolean isVisible = true;
    tosay(evening, midnight, isVisible);
 
    double brightnessOfStar = getYourBrightness();
    System.out.println(brightnessOfStar);
    System.out.println(" Hi Star what is your brightness");
  }
  static void getStar(){
    System.out.println("Yes I am Twinkling");
  }
  static void tosay(int evening, int midnight, boolean isVisible){
    System.out.println("Ok I will tell you");
    int hours = midnight - evening;
    System.out.println(hours);
    System.out.println(isVisible);
  }
  static double getYourBrightness(){
    System.out.println("Wait for a moment");
    double brightness = 15000.0;
    System.out.println("Now I know my brightness");
    return brightness;
  }
}