class Cloth {
    static void getCloth() {
        System.out.println("This is Cloth information");
    }
	
    static void tosay(String type, boolean isCotton) {
        System.out.println("Cloth Type: " + type);
        System.out.println("Is Cotton: " + isCotton);
    }
    static String getBrand() {
        return "Zara";
    }
    static int totalCost(int price, int quantity) {
        int total = price * quantity;
        return total;
    }
}