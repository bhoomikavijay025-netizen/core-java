class Fire {
  public static void main(String []args){

    System.out.println("Are you burning");
    getFire();
  
    System.out.println("How much area did you cover");
    int forestArea = 120;
    int fieldArea = 80;
    boolean isDangerous = true;

    measure(forestArea, fieldArea, isDangerous);
 
    double temperatureOfFire = getYourTemperature();
    System.out.println(temperatureOfFire);
    System.out.println(" Hi Fire what is your temperature");
  }

  static void getFire(){
    System.out.println("Yes I am burning");
  }
  static void measure(int forestArea, int fieldArea, boolean isDangerous){
    System.out.println("Ok I will measure");
    int totalArea = forestArea + fieldArea;
    System.out.println(totalArea);
    System.out.println(isDangerous);
  }

  static double getYourTemperature(){
    System.out.println("Wait a minute");
    double temperature = 850.5;
    System.out.println("Now I know my temperature");
    return temperature;
  }
}