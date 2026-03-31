class WaterBottle {

    // Static variables
    static String type = "Steel";
    static int capacity = 1;
    static float price = 350.50f;
    static boolean ht = true;
    static char grade = 'A';

    public static void main(String[] args) {

        // Local variables
        String type = "Plastic";
        int capacity = 2;
        float price = 150.00f;
        boolean ht = false;
        char grade= 'B';

        // Printing Local Variables
     
        System.out.println("type : " + type);
        System.out.println("capacity: " + capacity);
        System.out.println("price : " + price);
        System.out.println("ht : " + ht);
        System.out.println("grade : " + grade);

        // Printing Static Variables
        System.out.println("type : " + WaterBottle.type);
        System.out.println("capacity : " + WaterBottle.capacity);
        System.out.println("price : " + WaterBottle.price);
        System.out.println("ht : " + WaterBottle.ht);
        System.out.println("grade: " + WaterBottle.grade);
    }
}