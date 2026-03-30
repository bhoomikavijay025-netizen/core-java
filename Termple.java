class Temple {
  public static void main(String []args){

    System.out.println("Are you open for visitors");
    getTemple();
  
    System.out.println("How many devotees visited today");
    int morningVisitors = 150;
    int eveningVisitors = 200;
    boolean hasSpecialPooja = true;
    tosay(morningVisitors, eveningVisitors, hasSpecialPooja);

    double donationAmount = getYourDonationAmount();
    System.out.println(donationAmount);
    System.out.println("Hi Temple what is your donation amount");
  }
  static void getTemple(){
    System.out.println("Yes I am open for visitors");
  }

  static void tosay(int morningVisitors, int eveningVisitors, boolean hasSpecialPooja){
    System.out.println("Ok I will tell you");
    int totalVisitors = morningVisitors + eveningVisitors;
    System.out.println(totalVisitors);
    System.out.println(hasSpecialPooja);
  }
  static double getYourDonationAmount(){
    System.out.println("Wait a minute");
    double donationAmount = 10500.50;
    System.out.println("Now I know my donation amount");
    return donationAmount;
  }
}