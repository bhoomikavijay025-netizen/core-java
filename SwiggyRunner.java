class SwiggyRunner {

    public static void main(String[] args) {

        Swiggy s1 = new Swiggy("Saravana Bhavan", "Dosa", 30, 20.0, true);
        s1.display();

        Swiggy s2 = new Swiggy("Pizza Hut", "Pizza", 40, 30.0, false);
        s2.display();

        Swiggy s3 = new Swiggy("McDonalds", "Fries", 25, 15.0, true);
        s3.display();

        Swiggy s4 = new Swiggy("Barbeque Nation", "Grill", 50, 40.0, false);
        s4.display();

        Swiggy s5 = new Swiggy("Subway", "Sandwich", 20, 10.0, true);
        s5.display();

        Swiggy s6 = new Swiggy("Krispy Kreme", "Donut", 35, 25.0, false);
        s6.display();

        Swiggy s7 = new Swiggy("Cafe Coffee Day", "Coffee", 15, 10.0, true);
        s7.display();
    }
}