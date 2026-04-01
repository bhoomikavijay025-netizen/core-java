class ZomatoRunner {

    public static void main(String[] args) {

        Zomato z1 = new Zomato("Udupi Hotel", "Masala Dosa", 80.0, 5, true);
        z1.display();

        Zomato z2 = new Zomato("Empire", "Chicken Biryani", 180.0, 4, false);
        z2.display();

        Zomato z3 = new Zomato("A2B", "Idli", 50.0, 5, true);
        z3.display();

        Zomato z4 = new Zomato("KFC", "Burger", 120.0, 4, false);
        z4.display();

        Zomato z5 = new Zomato("Dominos", "Pizza", 200.0, 5, true);
        z5.display();

        Zomato z6 = new Zomato("Meghana", "Fried Rice", 150.0, 4, false);
        z6.display();

        Zomato z7 = new Zomato("Nandini", "Ice Cream", 60.0, 5, true);
        z7.display();
    }
}