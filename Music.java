class Music {

  public static void main(String []args){
    System.out.println("Are you melodious");
    getMusic();

    System.out.println("How many songs did you play");
    int morningSongs = 5;
    int eveningSongs = 4;
    boolean isLiveConcert = true;

    int totalDuration = playSongs(morningSongs, eveningSongs, isLiveConcert);
    System.out.println("Total Duration : " + totalDuration);

    double volumeLevel = getVolumeLevel();
    System.out.println(volumeLevel);
    System.out.println(" Hi Music what is your volume level");
  }

  static void getMusic(){
    System.out.println("Yes I am melodious");
  }
  static int playSongs(int morningSongs, int eveningSongs, boolean isLiveConcert){
    System.out.println("Ok I will calculate duration");
    int duration = morningSongs * eveningSongs; 
    System.out.println(isLiveConcert);
    return duration;
  }

  static double getVolumeLevel(){
    System.out.println("Wait a second");
    double volume = 75.5;
    System.out.println("Now I know my volume level");
    return volume;
  }
  
}