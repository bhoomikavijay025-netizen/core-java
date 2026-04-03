class TravellingRunner {

    public static void main(String[] args) {

        System.out.println("Booking Travel");

        Travelling suhas = new Travelling("Suhas", "Goa", 10000);

        System.out.println("Login");

        Travelling login = new Travelling("Suhas");

        System.out.println("View Plan");

        Travelling plan = new Travelling("Suhas", "Goa");
    }
}