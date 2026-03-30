class Mountain {

  public static void main(String []args){

    System.out.println("Are you high");
    getMountain();
    System.out.println("How many visitors came");
    int weekdayVisitors = 120;
    int weekendVisitors = 250;
    boolean isSnowy = true;
    int totalVisitors = calculateVisitors(weekdayVisitors, weekendVisitors, isSnowy);
    System.out.println("Total Visitors : " + totalVisitors);

    double heightOfMountain = getHeight(8848);
    System.out.println(heightOfMountain);
    System.out.println("heightOfMountain :"+heightOfMountain);
	

  }
  static void getMountain(){
    System.out.println("Yes I am very high");
  }
  static int calculateVisitors(int weekdayVisitors, int weekendVisitors, boolean isSnowy){
    System.out.println("Ok I will calculate visitors impact");
    int result = weekdayVisitors * 2;   
    System.out.println(isSnowy);
    return result;
  }
  static double getHeight(double height){
    System.out.println("height received");
 
    return height;
  }
  
}