 class Keyboard {

    // 5 Static Variables
    static String brand = "Lenova";
    static int keys = 104;
    static double price = 999.99;
    static char type = 'M';   
    static boolean isWireless = true;
    public static void main(String[] args) {

        // 5 Local Variables 
        String brand = "HP";
        int keys = 101;
        double price = 599.50;
        char type = 'N';  
        boolean isWireless = false;

        System.out.println("Local Variables:");
        System.out.println("Brand: " + brand);
        System.out.println("Keys: " + keys);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Is Wireless: " + isWireless);
        System.out.println("\nStatic Variables:");
        System.out.println("Brand: " + Keyboard.brand);
        System.out.println("Keys: " + Keyboard.keys);
        System.out.println("Price: " + Keyboard.price);
        System.out.println("Type: " + Keyboard.type);
        System.out.println("Is Wireless: " + Keyboard.isWireless);
		
    }
}