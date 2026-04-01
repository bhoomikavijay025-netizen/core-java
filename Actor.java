class Actor {

    // 5 Static Variables (Class Variables)
    static String name = "Sudeep";
    static int age = 46;
    static double salary = 500000.75;
    static char grade = 'A';
    static boolean isMarried = true;
    public static void main(String[] args) {

        // 5 Local Variables (Same Names)
        String name = "Danveer";
        int age =38;
        double salary = 300000.50;
        char grade = 'B';
        boolean isMarried = false;

        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Married: " + isMarried);

        System.out.println("\nStatic Variables:");
        System.out.println("Name: " + Actor.name);
        System.out.println("Age: " + Actor.age);
        System.out.println("Salary: " + Actor.salary);
        System.out.println("Grade: " + Actor.grade);

        System.out.println("Is Married: " + Actor.isMarried);
    }
}