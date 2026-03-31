class MetroRunner {
    public static void main(String[] args) {

 String name = Metro.getMetroName();
    System.out.println(name);

  int number = Metro.getTrainNumber();
    System.out.println(number);

    double speed = Metro.getSpeed();
  System.out.println(speed);

 float price = Metro.getTicketPrice();
    System.out.println(price);

  long passengers = Metro.getPassengers();
    System.out.println(passengers);

   boolean underground = Metro.getIsUnderground();
    System.out.println(underground);
   }
   }