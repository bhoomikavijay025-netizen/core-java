 class IronBox{

    // Static Variables 
    static String brand;
    static byte temperatureLevel;
    static int price;
	static short warrantyYears;
	static double powerConsumption;
	static float weight;
	static char energyRating;
	static boolean isSteamavailable;
	
    public static void main(String[] args) {
	
        System.out.println("brand:" +brand);
        System.out.println("temperatureLevel:" + temperatureLevel);
        System.out.println("price:" + price);
        System.out.println("warrantyYears: " +warrantyYears);
        System.out.println("powerConsumption:" +powerConsumption);
		 System.out.println("weight:" + weight);
		 		 System.out.println("energyRating:" + energyRating);
        System.out.println("isSteamavailable:" + isSteamavailable);
    }
}