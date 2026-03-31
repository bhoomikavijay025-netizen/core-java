class Network {

    // Static Variables (Class Variables)
    static String networkName = "Jio";
    static String country = "India";
    static int maxSpeed = 100;
    public static void main(String[] args) {

        // Local Variables
        byte networkId = 2;
        int totalUsers = 2000000;
       double frequency = 2.5f;

        // Printing Static Variables
        System.out.println("networkName:" +networkName);
        System.out.println("country:" + country);
        System.out.println("maxSpeed:" + maxSpeed);

        // Printing Local Variables
        System.out.println("networkId: " +networkId);
        System.out.println("totalUsers:" +totalUsers);
        System.out.println("frequency:" + frequency);
    }
}