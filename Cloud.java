class Cloud {
  public static void main(String []args){

    System.out.println("Are you floating");
    getCloud();
  
    System.out.println("How much water do you carry");
    int smallCloudLitres = 500;
    int bigCloudLitres = 800;
    boolean isRainy = true;

    int totalWater = calculateWater(smallCloudLitres, bigCloudLitres, isRainy);
    System.out.println("Total Water : " + totalWater);
 
    double heightOfCloud = getYourHeight();
    System.out.println(heightOfCloud);
    System.out.println(" Hi Cloud what is your height");
  }

  static void getCloud(){
    System.out.println("Yes I am floating");
  }
  static int calculateWater(int smallCloudLitres, int bigCloudLitres, boolean isRainy){
    System.out.println("Ok I will calculate");
    int total = smallCloudLitres + bigCloudLitres;
    System.out.println(isRainy);
    return total;
  }
  static double getYourHeight(){
    System.out.println("Wait a minute");
    double height = 2000.5;
    System.out.println("Now I know my height");
    return height;
  }
}

