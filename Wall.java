class Wall {

    // 5 Static Variables 
    static String color = "White";
    static int height = 10;
    static double width = 15.5;
    static char grade = 'A';
    static boolean isPainted = true;

    public static void main(String[] args) {

        // 5 Local Variables 
        String color = "Blue";
        int height = 8;
        double width = 12.0;
        char grade = 'B';
        boolean isPainted = false;
        System.out.println("Local Variables:");
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Grade: " + grade);
        System.out.println("Is Painted: " + isPainted);

        System.out.println("\nStatic Variables:");
        System.out.println("Color: " + Wall.color);
        System.out.println("Height: " + Wall.height);
        System.out.println("Width: " + Wall.width);
        System.out.println("Grade: " + Wall.grade);
        System.out.println("Is Painted: " + Wall.isPainted);
    }
}