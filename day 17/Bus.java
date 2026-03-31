class Bus {

    static String busName = "KSRTC";
    static String source = "Mandya";
    static int busNumber = 101;
    static int seats = 50;
    static long totalPassengers = 50000L;
    static boolean isAC = true;
    static boolean isSleeper = false;

   static String getBusName() {
  return busName;
    }
  static String getSource() {
     return source;
  }
   static int getBusNumber() {
  return busNumber;
  }
  static int getSeats() {
    return seats;
  }
 static long getTotalPassengers() {
     return totalPassengers;
 }
  static boolean getIsAC() {
   return isAC;
 }
    static boolean getIsSleeper() {
  return isSleeper;
    }
}