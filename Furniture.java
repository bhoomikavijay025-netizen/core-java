public class Furniture {
    // 5 Static Variables
    static String type = "Chair";
    static int quantity = 50;
    static double price = 2500.75;
    static char qualityGrade = 'A';
    static boolean isWooden = true;

    public static void main(String[] args) {

        // 5 Local Variables 
        String type = "Table";
        int quantity = 20;
        double price = 4500.50;
        char qualityGrade = 'B';
        boolean isWooden = false;

        System.out.println("Local Variables:");
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Is Wooden: " + isWooden);

        System.out.println("\nStatic Variables:");
        System.out.println("Type: " + Furniture.type);
        System.out.println("Quantity: " + Furniture.quantity);
        System.out.println("Price: " + Furniture.price);
        System.out.println("Quality Grade: " + Furniture.qualityGrade);
        System.out.println("Is Wooden: " + Furniture.isWooden);
    }
}