class Rocket {
  public static void main(String []args){

    System.out.println("Are you ready to launch");
    getRocket();
  
    System.out.println("How far did you travel");
    int phaseOneKm = 500;
    int phaseTwoKm = 800;
    boolean isSuccessful = true;

    calculate(phaseOneKm, phaseTwoKm, isSuccessful);
 
    double speedOfRocket = getYourSpeed();
    System.out.println(speedOfRocket);
    System.out.println(" Hi Rocket what is your speed");
  }

  static void getRocket(){
    System.out.println("Yes I am ready to launch");
  }
  static void calculate(int phaseOneKm, int phaseTwoKm, boolean isSuccessful){
    System.out.println("Ok I will calculate");
    int totalDistance = phaseOneKm + phaseTwoKm;
    System.out.println(totalDistance);
    System.out.println(isSuccessful);
  }

  static double getYourSpeed(){
    System.out.println("Wait a minute");
    double speed = 25000.5;
    System.out.println("Now I know my speed");
    return speed;
  }
  
}
