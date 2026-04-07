class Locker{

  static int checkNumber() {
    int number = 101;
    System.out.println(number);
    return number;
 }
   static void displayCode(String code) {
     System.out.println( "code is :"+code);
     int n = checkNumber();
     System.out.println(n);
  }
 static void accessLocker() {
   System.out.println("Locker accessed");

    displayCode("2502");
    }
}