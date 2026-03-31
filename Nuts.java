class Nuts {

    // 5 Static Variables (Class Variables)
    static String name = "Almond";
    static int quantity = 200;
    static double price = 850.75;
    static char grade = 'A';
    static boolean isOrganic = true;

    public static void main(String[] args) {

        // 5 Local Variables (Same Names)
        String name = "Cashew";
        int quantity = 150;
        double price = 650.50;
        char grade = 'B';
        boolean isOrganic = false;

        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Organic: " + isOrganic);

        System.out.println("\nStatic Variables:");
        System.out.println("Name: " + Nuts.name);
        System.out.println("Quantity: " + Nuts.quantity);
        System.out.println("Price: " + Nuts.price);
        System.out.println("Grade: " + Nuts.grade);
        System.out.println("Is Organic: " + Nuts.isOrganic);
    }
}


