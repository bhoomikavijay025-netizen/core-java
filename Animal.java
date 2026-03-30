class Animal {
  public static void main(String []args){

    System.out.println("Are you active");
    getAnimal();
  
    System.out.println("How much food did you eat today");
    int morningFood = 2;
    int nightFood = 3;
    boolean isPet = true;
    tosay(morningFood, nightFood, isPet);
 
    double weightOfAnimal = getYourWeight();
    System.out.println(weightOfAnimal);
    System.out.println(" Hi Animal what is your weight");
  }

  static void getAnimal(){
    System.out.println("Yes I am active");
  }

  static void tosay(int morningFood, int nightFood, boolean isPet){
    System.out.println("Ok I will tell you");
    int totalFood = morningFood + nightFood;
    System.out.println(totalFood);
    System.out.println(isPet);
  }

  static double getYourWeight(){
    System.out.println("Wait a minute");
    double weight = 25.5;
    System.out.println("Now I know my weight");
    return weight;
  }
}