class Speaker {
    public static void main(String[] args){

   System.out.println("Are you playing sound");
  getSpeaker();

      int lowVolume = 30;
     int highVolume = 70;
        boolean isBluetooth = true;

    showVolume(lowVolume, highVolume, isBluetooth);

   int totalVolume = calculateVolume(lowVolume, highVolume);
        System.out.println("Total Volume : " + totalVolume);

        String brand = getBrand();
    System.out.println("Speaker Brand : " + brand);
    }
    static void getSpeaker(){
       System.out.println("Yes I produce loud sound");
    }
    static void showVolume(int lowVolume, int highVolume, boolean isBluetooth){
        System.out.println("Low Volume : " + lowVolume);
      System.out.println("High Volume : " + highVolume);
        System.out.println("Bluetooth : " + isBluetooth);
    }

   static int calculateVolume(int lowVolume, int highVolume){
    return lowVolume + highVolume;
    }
    static String getBrand(){
        return "JBL";
    }
}
