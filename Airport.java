class Airport {

  public static void main(String []args){
    System.out.println("Are flights operating now");
    getAirport();
  
    System.out.println("How many flights departed");
    int morningFlights = 25;
    int eveningFlights = 30;
    boolean hasInternationalTerminal = true;
    tosay(morningFlights, eveningFlights, hasInternationalTerminal);

    double baggageLimit = getYourBaggageLimit();
    System.out.println(baggageLimit);
    System.out.println("Hi Airport what is your baggage limit");
  }
  static void getAirport(){
    System.out.println("Yes flights are operating now");
  }

  static void tosay(int morningFlights, int eveningFlights, boolean hasInternationalTerminal){
    System.out.println("Ok I will tell you");
    int totalFlights = morningFlights + eveningFlights;
    System.out.println(totalFlights);
    System.out.println(hasInternationalTerminal);
  }
  static double getYourBaggageLimit(){
    System.out.println("Wait a minute");
    double baggageLimit = 23.5;
    System.out.println("Now I know my baggage limit");
    return baggageLimit;
  }
}

