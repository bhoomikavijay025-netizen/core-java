class AutoRunner {

    public static void main(String[] args) {
    String name = Auto.getAutoName();
   System.out.println(name);

   int number = Auto.getAutoNumber();
    System.out.println(number);

	double mileage = Auto.getMileage();
 System.out.println(mileage);

    float fare = Auto.getFarePerKm();
   System.out.println(fare);
    long trips = Auto.getTotalTrips();
     System.out.println(trips);

   boolean available = Auto.getIsAvailable();
   System.out.println(available);
   
     char type = Auto.getAutoType();
     System.out.println(type);
    }
   }
   