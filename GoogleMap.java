class GoogleMap {
  public static void main(String []args){

    System.out.println("Are you providing directions");
    getGoogleMap();
    System.out.println("How many kilometers to travel");
    int cityDistance = 120;
    int villageDistance = 80;
    boolean isTrafficHeavy = true;
    int totalDistance = calculateDistance(cityDistance, villageDistance, isTrafficHeavy);
    System.out.println("Total Distance : " + totalDistance);

    double estimatedTime = getEstimatedTime();
    System.out.println(estimatedTime);
    System.out.println(" Hi GoogleMap what is your estimated time");
  }
  static void getGoogleMap(){
    System.out.println("Yes I provide directions");
  }

  static int calculateDistance(int cityDistance, int villageDistance, boolean isTrafficHeavy){
    System.out.println("Ok I will calculate distance");
    int total = cityDistance + villageDistance;
    System.out.println(isTrafficHeavy);
    return total;
  }
  static double getEstimatedTime(){
    System.out.println("Wait for a moment");
    double time = 3.5;   // hours
    System.out.println("Now I know the estimated time");
    return time;
  }
}