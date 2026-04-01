class Building {

  public static void main(String []args){

    System.out.println("Are you tall");
    getBuilding();
  
    System.out.println("How many floors do you have");
    int blockA = 10;
    int blockB = 15;
    boolean hasLift = true;
    int totalFloors = calculateFloors(blockA, blockB, hasLift);
    System.out.println("Total Floors : " + totalFloors);
    double heightOfBuilding = getYourHeight();
    System.out.println(heightOfBuilding);
    System.out.println(" Hi Building what is your height");
  }
  static void getBuilding(){
    System.out.println("Yes I am tall");
  }
  static int calculateFloors(int blockA, int blockB, boolean hasLift){
    System.out.println("Ok I will calculate");
    int total = blockA + blockB;
    System.out.println(hasLift);
    return total;
  }
  static double getYourHeight(){
    System.out.println("Wait a minute");
    double height = 150.75;
    System.out.println("Now I know my height");
    return height;
  }
  
}