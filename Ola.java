class Ola {

    String driverName;
    String carModel;
    double fare;
    int distance;
    boolean isAC;

    public Ola(String p1, String p2, double p3, int p4, boolean p5){
        driverName = p1;
        carModel = p2;
        fare = p3;
        distance = p4;
        isAC = p5;
    }

    void display(){
        System.out.println(driverName);
        System.out.println(carModel);
        System.out.println(fare);
        System.out.println(distance);
        System.out.println(isAC);
    }
}