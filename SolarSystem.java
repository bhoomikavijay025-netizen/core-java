class SolarSystem {

    // Static Variables (Class Variables)
    static int totalPlanets = 8;
    static String galaxyName = "Milky Way";
    static String centralStar = "Sun";
    public static void main(String[] args) {

        // Local Variables
        int totalPlanets = 7;
        String galaxyName = "Milky";
      String centralStar = "moon";

        // Printing Static Variables
        System.out.println("totalPlanets:" + SolarSystem.totalPlanets);
        System.out.println("galaxyName:" +SolarSystem.galaxyName);
        System.out.println("centralStar:" + SolarSystem.centralStar);

        // Printing Local Variables
        System.out.println("totalPlanets: " + totalPlanets);
        System.out.println("galaxyName:" +galaxyName);
        System.out.println("centralStar:" + centralStar);
    }
}