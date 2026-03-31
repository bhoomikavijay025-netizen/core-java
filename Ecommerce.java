 class Ecommerce {

    //  Static Variables 
    static String platformName = "Amazon";
    static int totalUsers = 5000000;
    static double revenue = 2500000.75;
    static char grade = 'A';
    static boolean isGlobal = true;

    public static void main(String[] args) {

        //  Local Variables 
        String platformName = "Flipkart";
        int totalUsers = 3000000;
        double revenue = 1500000.50;
        char grade = 'B';
        boolean isGlobal = false;

        System.out.println("Local Variables:");
        System.out.println("Platform Name: " + platformName);
        System.out.println("Total Users: " + totalUsers);
        System.out.println("Revenue: " + revenue);
        System.out.println("Grade: " + grade);
        System.out.println("Is Global: " + isGlobal);

        System.out.println("\nStatic Variables:");
        System.out.println("Platform Name: " + platformName);
        System.out.println("Total Users: " + totalUsers);
        System.out.println("Revenue: " + revenue);
        System.out.println("Grade: " + grade);
        System.out.println("Is Global: " +isGlobal);
    }
}