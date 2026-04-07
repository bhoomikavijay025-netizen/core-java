class Car{
    static int getSpeed() {
      int speed = 120;
      System.out.println(speed);
       return speed;
    }

    static void displayModel(String model) {
    System.out.println(model);
     int s = getSpeed();
     System.out.println(s);
    }

    static void driveCar() {
            System.out.println("Car running");

        displayModel("kia");
    }
}