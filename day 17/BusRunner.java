class BusRunner {
    public static void main(String[] args) {

        String name = Bus.getBusName();
        System.out.println(name);

        String source = Bus.getSource();
        System.out.println(source);

        int number = Bus.getBusNumber();
        System.out.println(number);
        int seats = Bus.getSeats();
        System.out.println(seats);

        long passengers = Bus.getTotalPassengers();
        System.out.println(passengers);

        boolean ac = Bus.getIsAC();
        System.out.println(ac);

        boolean sleeper = Bus.getIsSleeper();
        System.out.println(sleeper);
    }
}