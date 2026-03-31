class TrainRunner {
    public static void main(String[] args) {

 String name = Train.getTrainName();
  System.out.println(name);

  int number = Train.getTrainNumber();
  System.out.println(number);

    double speed = Train.getSpeed();
  System.out.println(speed);

    float price = Train.getTicketPrice();
   System.out.println(price);

 long passengers = Train.getTotalPassengers();
    System.out.println(passengers);

  boolean ac = Train.getIsAC();
   System.out.println(ac);

   char coach = Train.getCoachType();
    System.out.println(coach);
  }
  }