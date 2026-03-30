class Ocean {
  public static void main(String []args){

    System.out.println("Are you deep");
    getOcean();
    System.out.println("How many waves did you create");
    int morningWaves = 200;
    int nightWaves = 150;
    boolean isStormy = false;

    int averageWaves = analyzeWaves(morningWaves, nightWaves, isStormy);
    System.out.println("Average Waves : " + averageWaves);

    double depthOfOcean = getDepth();
    System.out.println(depthOfOcean);
    System.out.println(" Hi Ocean what is your depth");
  }

  static void getOcean(){
    System.out.println("Yes I am very deep");
  }
  static int analyzeWaves(int morningWaves, int nightWaves, boolean isStormy){
    System.out.println("Ok I will analyze waves");
    int average = (morningWaves + nightWaves) / 2;  
    System.out.println(isStormy);
    return average;
  }

  static double getDepth(){
    System.out.println("Wait for a moment");
    double depth = 10994.0;
    System.out.println("Now I know my depth");
    return depth;
  }
}