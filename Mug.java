class Mug {

        static int checkCapacity() {
        int cap = 300;
        System.out.println(cap);
        return cap;
 }        static void showColor(String color) {
        System.out.println(color);

        int c = checkCapacity();
        System.out.println(c);
}
    static void useMug() {
        System.out.println("Mug in use");

        showColor("White");
    }
}