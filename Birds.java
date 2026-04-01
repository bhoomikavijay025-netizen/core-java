class Birds {

    // Static variables
    static int wings = 2;
    static String name = "Parrot";
    static double weight = 1.1;
    static boolean canfly = true;
    static char size = 'M';
    public static void main(String[] args) {

        // Local variables (same names)
        int wings = 2;
        String name = "Penguin";
        double weight = 10.4;
        boolean canfly = false;
        char size = 'L';
        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("wings : " +wings);
        System.out.println("name: " + name);
        System.out.println("weight : " + weight);
        System.out.println("canfly : " + canfly);
        System.out.println("size : " + size);

        // Printing Static Variables
        System.out.println("wings: " + Birds.wings);
        System.out.println("name : " + Birds.name);
        System.out.println("weight: " +Birds.weight);
        System.out.println("canfly: " + Birds.canfly);
        System.out.println("size :" + Birds.size);
    }
}