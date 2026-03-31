 class Ladder {

    // 5 Static Variables 
    static String material = "Aluminum";
    static int height = 12;
    static double price = 3500.75;
    static char grade = 'A';
    static boolean isFoldable = true;

    public static void main(String[] args) {

        // 5 Local Variables 
        String material = "Wood";
        int height = 10;
        double price = 2500.50;
        char grade = 'B';
        boolean isFoldable = false;

        System.out.println("Local Variables:");
        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Foldable: " + isFoldable);

        System.out.println("\nStatic Variables:");
        System.out.println("Material: " + Ladder.material);
        System.out.println("Height: " + Ladder.height);
        System.out.println("Price: " + Ladder.price);
        System.out.println("Grade: " + Ladder.grade);
        System.out.println("Is Foldable: " + Ladder.isFoldable);
    }
}

