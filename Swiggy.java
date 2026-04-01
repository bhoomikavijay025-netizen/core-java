class Swiggy {

    String hotelName;
    String dishName;
    int deliveryTime;
    double deliveryCharge;
    boolean isFastDelivery;

    public Swiggy(String p1, String p2, int p3, double p4, boolean p5){
        hotelName = p1;
        dishName = p2;
        deliveryTime = p3;
        deliveryCharge = p4;
        isFastDelivery = p5;
    }

    void display(){
        System.out.println(hotelName);
        System.out.println(dishName);
        System.out.println(deliveryTime);
        System.out.println(deliveryCharge);
        System.out.println(isFastDelivery);
    }
}