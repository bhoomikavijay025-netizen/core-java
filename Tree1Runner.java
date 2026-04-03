class Tree1Runner {

    public static void main(String[] args) {

        System.out.println("Add Tree");

        Tree coconut = new Tree("Coconut Tree", 30, "Palm");

        System.out.println("Access Tree");

        Tree t1 = new Tree("Coconut Tree");

        System.out.println("View Tree");

        Tree t2 = new Tree("Coconut Tree", "Palm");
    }
}