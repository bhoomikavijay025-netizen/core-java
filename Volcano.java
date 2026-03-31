class Volcano {
  public static void main(String []args){

    System.out.println("Are you active");
    getVolcano();
    System.out.println("How much lava did you release");
    int morningLava = 500;
    int eveningLava = 250;
    boolean isDangerous = true;

    int lavaFlow = measureLava(morningLava, eveningLava, isDangerous);
    System.out.println("Lava Flow Ratio : " + lavaFlow);

    double heightOfVolcano = getHeight();
    System.out.println(heightOfVolcano);
    System.out.println(" Hi Volcano what is your height");
  }
  static void getVolcano(){
    System.out.println("Yes I am active");
  }
  static int measureLava(int morningLava, int eveningLava, boolean isDangerous){
    System.out.println("Ok I will measure lava flow");
    int ratio = morningLava / eveningLava; 
    System.out.println(isDangerous);
    return ratio;
  }

  static double getHeight(){
    System.out.println("Wait for a moment");
    double height = 3465.5;
    System.out.println("Now I know my height");
    return height;
  }
}