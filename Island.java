class Island {
  public static void main(String []args){

    System.out.println("Are you surrounded by water");
    getIsland();

    System.out.println("How many tourists visited");
    int localTourists = 500;
    int foreignTourists = 300;
    boolean isPopular = true;

    int totalTourists = countTourists(localTourists, foreignTourists, isPopular);
    System.out.println("Total Tourists : " + totalTourists);

    double area = getArea();
    System.out.println(area);
    System.out.println(" Hi Island what is your area");
  }

  static void getIsland(){
    System.out.println("Yes I am surrounded by water");
  }

  static int countTourists(int localTourists, int foreignTourists, boolean isPopular){
    System.out.println("Ok I will count tourists");
    int total = localTourists + foreignTourists;
    System.out.println(isPopular);
    return total;
  }
  static double getArea(){
    System.out.println("Wait for a moment");
    double areaSize = 1200.75;
    System.out.println("Now I know my area");
    return areaSize;
  }
}

