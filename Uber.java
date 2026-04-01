class Uber {

    String riderName;
    String pickupLocation;
    String dropLocation;
    double tripCost;
    boolean isShared;

    public Uber(String p1, String p2, String p3, double p4, boolean p5){
        riderName = p1;
        pickupLocation = p2;
        dropLocation = p3;
        tripCost = p4;
        isShared = p5;
    }

    void display(){
        System.out.println(riderName);
        System.out.println(pickupLocation);
        System.out.println(dropLocation);
        System.out.println(tripCost);
        System.out.println(isShared);
    }
}