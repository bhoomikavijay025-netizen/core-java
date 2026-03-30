class Sun {
  public static void main(String []args){

    System.out.println("Are you Brightning");
    getSun();
  
    System.out.println("when will you come");
    int mrng = 7;
    int ngt = 6;
    boolean isEverytime = false;
    tosay(mrng, ngt, isEverytime);
 
    double tempOfSun = getYourtemp();
    System.out.println(tempOfSun);
    System.out.println(" hi Sun what is your temp");
  }

  static void getSun(){
    System.out.println("yes i am Brightning");
  }

  static void tosay(int mrng, int ngt, boolean isEverytime){
    System.out.println("ok i will tell you");
    int answer = mrng / ngt;
    System.out.println(answer);
    System.out.println(isEverytime);
  }

  static double getYourtemp(){
    System.out.println("yes wait a min");
    double temp = 9900.0;
    System.out.println("yes i know my Temp i am ready to tell");
    return temp;
  }
}