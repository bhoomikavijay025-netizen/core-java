class FamilyRunner {

    public static void main(String[] args) {

        System.out.println("Add Family Members");

        Family vijay = new Family("Vijay", "Father", 50);
        Family sowkyarani = new Family("Sowkyarani", "Mother", 37);

        System.out.println("Login");

        Family login1 = new Family("Vijay");
        Family login2 = new Family("Sowkyarani");

        System.out.println("View Details");

        Family view1 = new Family("Vijay", "Father");
        Family view2 = new Family("Sowkyarani", "Mother");
    }
}