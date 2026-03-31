public class Fruits {

    // 5 Static Variables 
    static String name = "Apple";
    static int quantity = 100;
    static double price = 120.50;
    static char grade = 'A';
    static boolean isSeasonal = false;

    public static void main(String[] args) {
        // 5 Local Variables
        String name = "Mango";
        int quantity = 50;
        double price = 80.75;
        char grade = 'B';
        boolean isSeasonal = true;

        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Seasonal: " + isSeasonal);

        System.out.println("\nStatic Variables:");
        System.out.println("Name: " + Fruits.name);
        System.out.println("Quantity: " + Fruits.quantity);
        System.out.println("Price: " + Fruits.price);
        System.out.println("Grade: " + Fruits.grade);
        System.out.println("Is Seasonal: " + Fruits.isSeasonal);
  

  }
}