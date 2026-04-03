class HouseRunner {

    public static void main(String[] args) {

        System.out.println("Add House");

        House me = new House("Me", "Mandya", 500000);

        System.out.println("Access House");

        House h1 = new House("Me");

        System.out.println("View House");

        House h2 = new House("Me", "Mandya");
    }
}