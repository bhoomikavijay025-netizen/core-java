class Tree {
  public static void main(String []args){
    System.out.println("Are you growing");
    getTree();
    System.out.println("How many fruits did you produce");
    int mangoFruits = 40;
    int appleFruits = 30;
    boolean isEvergreen = true;

    int totalFruits = countFruits(mangoFruits, appleFruits, isEvergreen);
    System.out.println("Total Fruits : " + totalFruits);

    double heightOfTree = getHeight();
    System.out.println(heightOfTree);
    System.out.println(" Hi Tree what is your height");
  }

  static void getTree(){
    System.out.println("Yes I am growing");
  }
  static int countFruits(int mangoFruits, int appleFruits, boolean isEvergreen){
    System.out.println("Ok I will count fruits");
    int difference = mangoFruits - appleFruits;  
    System.out.println(isEvergreen);
    return difference;
  }
  static double getHeight(){
    System.out.println("Wait for a moment");
    double height = 25.8;
    System.out.println("Now I know my height");
    return height;
  }
}

