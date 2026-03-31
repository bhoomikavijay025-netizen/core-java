 class Movies {

    // 5 Static Variables 
    static String name = "Duarndar";
    static int duration = 180;
    static double rating = 4.8;
    static char grade = 'A';
    static boolean isHit = true;
    public static void main(String[] args) {
   // 5 Local Variables 
        String name = "RRR";
        int duration = 170;
        double rating = 4.5;
        char grade = 'B';
        boolean isHit = false;

        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Duration: " + duration);
        System.out.println("Rating: " + rating);
        System.out.println("Grade: " + grade);
        System.out.println("Is Hit: " + isHit);

        System.out.println("\nStatic Variables:");
        System.out.println("Name: " + Movies.name);
        System.out.println("Duration: " + Movies.duration);
        System.out.println("Rating: " + Movies.rating);
        System.out.println("Grade: " + Movies.grade);
        System.out.println("Is Hit: " + Movies.isHit);
    }
}