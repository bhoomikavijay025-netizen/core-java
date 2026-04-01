class Desert {

  public static void main(String []args){
    System.out.println("Are you dry");
    getDesert();
    System.out.println("How many days without rain");
    int summerDays = 90;
    int winterDays = 30;
    boolean isHot = true;

    int totalDryDays = calculateDryDays(summerDays, winterDays, isHot);
    System.out.println("Total Dry Days : " + totalDryDays);

    double temperature = getTemperature();
    System.out.println(temperature);
    System.out.println(" Hi Desert what is your temperature");
  }

  static void getDesert(){
    System.out.println("Yes I am very dry");
  }

  static int calculateDryDays(int summerDays, int winterDays, boolean isHot){
    System.out.println("Ok I will calculate dry days");
    int total = summerDays + winterDays;
    System.out.println(isHot);
    return total;
  }
  static double getTemperature(){
    System.out.println("Wait for a moment");
    double temp = 45.5;
    System.out.println("Now I know my temperature");
    return temp;
  }
  
  
}