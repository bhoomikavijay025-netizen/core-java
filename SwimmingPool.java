class SwimmingPool {

    // 5 Static Variables 
    static String name = "Blue Lagoon";
    static int capacity = 200;
    static double depth = 6.5;
    static char grade = 'A';
    static boolean isIndoor = true;

    public static void main(String[] args) {

        // 5 Local Variables 
        String name = "Green Valley Pool";
        int capacity = 100;
        double depth = 4.0;
        char grade = 'B';
        boolean isIndoor = false;

        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Depth: " + depth);
        System.out.println("Grade: " + grade);
        System.out.println("Is Indoor: " + isIndoor);

        System.out.println("\nStatic Variables:");
        System.out.println("Name: " + SwimmingPool.name);
        System.out.println("Capacity: " + SwimmingPool.capacity);
        System.out.println("Depth: " + SwimmingPool.depth);
        System.out.println("Grade: " + SwimmingPool.grade);
        System.out.println("Is Indoor: " + SwimmingPool.isIndoor);
    }
}