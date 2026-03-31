class Train {

 static String trainName = "Tirupathi Express";   
 static int trainNumber = 12001;            
static double speed = 110.5;                    
 static float ticketPrice = 750.50f;            
 static long totalPassengers = 100000L;          
  static boolean isAC = true;               
static char coachType = 'A';                    

 static String getTrainName() {
 return trainName;
 }
static int getTrainNumber(){
  return trainNumber;
    }
 static double getSpeed(){
  return speed;
  }
static float getTicketPrice() {
 return ticketPrice;
    }
  static long getTotalPassengers(){
     return totalPassengers;
 }
    static boolean getIsAC() {
     return isAC;
    }
    static char getCoachType(){
  return coachType;
 }
}