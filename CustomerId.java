class CustomerId {

    // Static variables
    static int id = 101;
    static String name = "Ramya";
    static long mobno = 9876543210L;
    static boolean ac = true;
    static char type = 'P';

    public static void main(String[] args) {

        // Local variables (same names)
        int id = 202;
        String name = "Rani";
        long mobno = 9123456789L;
        boolean ac = false;
        char type = 'T';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("id : " + id);
        System.out.println("name: " + name);
        System.out.println("mobno : " + mobno);
        System.out.println("ac : " + ac);
        System.out.println("type : " + type);

        // Printing Static Variables
        System.out.println("id : " + CustomerId.id);
        System.out.println("name : " + CustomerId.name);
        System.out.println("mobno : " + CustomerId.mobno);
        System.out.println("ac : " + CustomerId.ac);
        System.out.println("type : " + CustomerId.typej);
    }
}