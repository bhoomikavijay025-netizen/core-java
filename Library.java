class Library {

  public static void main(String []args){

    System.out.println("Are you open today");
    getLibrary();
  
    System.out.println("How many books were issued");
    int morningIssued = 45;
    int eveningIssued = 30;
    boolean isOpenOnWeekend = true;
    tosay(morningIssued, eveningIssued, isOpenOnWeekend);

    double fineAmount = getYourFineAmount();
    System.out.println(fineAmount);
    System.out.println("Hi Library what is your fine amount");
  }
  static void getLibrary(){
    System.out.println("Yes I am open today");
  }

  static void tosay(int morningIssued, int eveningIssued, boolean isOpenOnWeekend){
    System.out.println("Ok I will tell you");
    int totalIssued = morningIssued + eveningIssued;
    System.out.println(totalIssued);
    System.out.println(isOpenOnWeekend);
  }
  static double getYourFineAmount(){
    System.out.println("Wait a minute");
    double fineAmount = 250.75;
    System.out.println("Now I know my fine amount");
    return fineAmount;
  }
}