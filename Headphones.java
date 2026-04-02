class Headphones {
    public static void main(String[] args){

        System.out.println("Are you used for listening");

    getHeadphones();

  int musicTime = 120;
     int callTime = 60;
     boolean isWireless = true;

  showUsage(musicTime, callTime, isWireless);

   int totalTime = calculateTime(musicTime, callTime);
  System.out.println("Total Time : " + totalTime);

        String brand = getBrand();
        System.out.println("Headphones Brand : " + brand);
    }
    static void getHeadphones(){
        System.out.println("Yes I help you listen privately");
  }
    static void showUsage(int musicTime, int callTime, boolean isWireless){
        System.out.println("Music Time : " + musicTime);
        System.out.println("Call Time : " + callTime);
        System.out.println("Wireless : " + isWireless);
		}
    static int calculateTime(int musicTime, int callTime){
     return musicTime + callTime;
  }

    static String getBrand(){
     return "Sony";
    }
}