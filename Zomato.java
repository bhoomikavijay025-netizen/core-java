class Zomato {

    String restaurantName;
    String foodItem;
    double price;
    int rating;
    boolean isVeg;

    public Zomato(String p1, String p2, double p3, int p4, boolean p5){
        restaurantName = p1;
        foodItem = p2;
        price = p3;
        rating = p4;
        isVeg = p5;
    }

    void display(){
        System.out.println(restaurantName);
        System.out.println(foodItem);
        System.out.println(price);
        System.out.println(rating);
        System.out.println(isVeg);
    }
}