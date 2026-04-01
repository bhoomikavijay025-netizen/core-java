class BloodGroup {

    // Static Variables (Class Variables)
    static String color = "Red";
    static String GroupName = "O+";
    static boolean isUniversalDonor = true;
	
    public static void main(String[] args) {

        // Local Variables
        char rhFactor = '+';
        int donorCount = 1200;
       float hemoglobinLevel = 17.5f;

        // Printing Static Variables
        System.out.println("color:" + color);
        System.out.println("GroupName:" + GroupName);
        System.out.println("isUniversalDonor:" + isUniversalDonor);

        // Printing Local Variables
        System.out.println("rhFactor: " + rhFactor);
        System.out.println("donorCount:" + donorCount);
        System.out.println("hemoglobinLevel:" + hemoglobinLevel);
    }
}