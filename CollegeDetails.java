class College {

    // Static Variables (Class Variables)
    static String collegeName = "National Institute";
    static String universityName = "Mumbai";
    static int establishedYear = 2013;
    public static void main(String[] args) {

        // Local Variables
        String studentName = "Bharat";
        int rollNumber = 231;
        double percentage = 85.5;

        // Printing Static Variables
        System.out.println("College Name: " + collegeName);
        System.out.println("University Name: " + universityName);
        System.out.println("Established Year: " + establishedYear);

        // Printing Local Variables
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage);
    }
}