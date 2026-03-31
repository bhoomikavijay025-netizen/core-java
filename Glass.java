class Glass {

    // Static Variables (Class Variables)
    static String material = "Glass";
    static String company = "Milton";
    static boolean isRecyclable = true;
    public static void main(String[] args) {

        // Local Variables
        Short capacityInML = 250;
        int price = 200;
       float weight = 2.5;

        // Printing Static Variables
        System.out.println("material:" + material);
        System.out.println("company:" + company);
        System.out.println("isRecyclable:" + isRecyclable);

        // Printing Local Variables
        System.out.println("capacityInML: " + capacityInML);
        System.out.println("price:" + price);
        System.out.println("weight:" + weight);
    }
}