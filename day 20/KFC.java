class KFC {

    public static int getPrice(String name, int size) {

        if (name == "Smoky Red Chicken" && size == 1) {
            return 150;

        } else if (name == ("Smoky Red Chicken") && size == 2) {
            return 300;

        } else if (name ==("Smoky Hot Chicken") && size == 1) {
            return 120;

        } else if (name ==("Smoky Hot Chicken") && size == 2) {
            return 240;

        } else if (name ==("Smoky Hot Wings") && size == 1) {
            return 100;

        } else if (name == ("Smoky Hot Wings") && size == 2) {
            return 200;

        } else if (name == ("Smoky Hot Wings") && size == 3) {
            return 300;

        } else {
            return 0;
        }
    }
}