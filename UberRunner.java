class UberRunner {

    public static void main(String[] args) {

        Uber u1 = new Uber("Anil", "BTM", "Majestic", 350.0, false);
        u1.display();

        Uber u2 = new Uber("Sunil", "Whitefield", "Indiranagar", 420.0, true);
        u2.display();

        Uber u3 = new Uber("Kavya", "Hebbal", "Yelahanka", 200.0, false);
        u3.display();

        Uber u4 = new Uber("Riya", "KR Puram", "Marathahalli", 250.0, true);
        u4.display();

        Uber u5 = new Uber("Vijay", "Jayanagar", "Banashankari", 180.0, false);
        u5.display();

        Uber u6 = new Uber("Deepa", "Electronic City", "Silk Board", 220.0, true);
        u6.display();

        Uber u7 = new Uber("Arvind", "Rajajinagar", "Malleshwaram", 160.0, false);
        u7.display();
    }
}