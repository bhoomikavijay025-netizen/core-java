class KFCRunner {

    public static void main(String[] args) {

        System.out.println(KFC.getPrice("Smoky Red Chicken", 1));
        System.out.println(KFC.getPrice("Smoky Red Chicken", 2));

        System.out.println(KFC.getPrice("Smoky Hot Chicken", 1));
        System.out.println(KFC.getPrice("Smoky Hot Chicken", 2));

        System.out.println(KFC.getPrice("Smoky Hot Wings", 1));
        System.out.println(KFC.getPrice("Smoky Hot Wings", 2));
        System.out.println(KFC.getPrice("Smoky Hot Wings", 3));

     
        System.out.println(KFC.getPrice("Burger", 1));
    }
}