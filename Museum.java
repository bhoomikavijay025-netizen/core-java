class Museum {

    // 5 Static Variables 
    static String name = "National Museum";
    static int visitors = 1000;
    static double ticketPrice = 150.75;
    static char grade = 'A';
    static boolean isOpen = true;

    public static void main(String[] args) {
        // 5 Local Variables
        String name = "City Museum";
        int visitors = 500;
        double ticketPrice = 100.50;
        char grade = 'B';
        boolean isOpen = false;

        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Visitors: " + visitors);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Grade: " + grade);
        System.out.println("Is Open: " + isOpen);

        System.out.println("\nStatic Variables:");
        System.out.println("Name: " +name);
        System.out.println("Visitors: " + Museum.visitors);
        System.out.println("Ticket Price: " + Museum.ticketPrice);
        System.out.println("Grade: " + Museum.grade);
        System.out.println("Is Open: " + Museum.isOpen);
    }
}