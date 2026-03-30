 class Musical_Instruments {

    // 5 Static Variables 
    static String name = "Guitar";
    static int quantity = 25;
    static double price = 7500.50;
    static char grade = 'A';
    static boolean isElectric = true;

    public static void main(String[] args) {
        // 5 Local Variables
        String name = "Piano";
        int quantity = 10;
        double price = 55000.75;
        char grade = 'B';
        boolean isElectric = false;jja

        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Electric: " + isElectric);

        System.out.println("\nStatic Variables:");
        System.out.println("Name: " + MusicalInstruments.name);
        System.out.println("Quantity: " + MusicalInstruments.quantity);
        System.out.println("Price: " + MusicalInstruments.price);
        System.out.println("Grade: " + MusicalInstruments.grade);
        System.out.println("Is Electric: " + MusicalInstruments.isElectric);

		}
}