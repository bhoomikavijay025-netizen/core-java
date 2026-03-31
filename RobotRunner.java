class RobotRunner {

    public static void main(String[] args) {

        Robot r1 = new Robot();

        r1.robotId = 101;
        r1.robotName = "RoboX";
        r1.batteryCapacity = 5000.75;
        r1.speed = 12.5f;
        r1.isAutonomous = true;
        r1.version = 'A';
        r1.serialNumber = 9876543210L;

        Robot r2 = new Robot();

        r2.robotId = 102;
        r2.robotName = "MechaBot";
        r2.batteryCapacity = 4200.50;
        r2.speed = 10.2f;
        r2.isAutonomous = false;
        r2.version = 'B';
        r2.serialNumber = 8765432109L;
		
         Robot r3 = new Robot();

        r3.robotId = 103;
        r3.robotName = "AutoDroid";
        r3.batteryCapacity = 6000.00;
        r3.speed = 15.0f;
        r3.isAutonomous = true;
        r3.version = 'C';
        r3.serialNumber = 7654321098L;

        Robot r4 = new Robot();

        r4.robotId = 104;
        r4.robotName = "CyberBot";
        r4.batteryCapacity = 5500.25;
        r4.speed = 13.3f;
        r4.isAutonomous = false;
        r4.version = 'D';
        r4.serialNumber = 6543210987L;

        System.out.println("***** Robot Details *****");

        System.out.println("R1 ID: " + r1.robotId);
        System.out.println("R1 Name: " + r1.robotName);
        System.out.println("R1 Battery: " + r1.batteryCapacity);
        System.out.println("R1 Speed: " + r1.speed);
        System.out.println("R1 Autonomous: " + r1.isAutonomous);
        System.out.println("R1 Version: " + r1.version);
        System.out.println("R1 Serial: " + r1.serialNumber);

        System.out.println("***** Robot Details *****");

        System.out.println("R2 ID: " + r2.robotId);
        System.out.println("R2 Name: " + r2.robotName);
        System.out.println("R2 Battery: " + r2.batteryCapacity);
        System.out.println("R2 Speed: " + r2.speed);
        System.out.println("R2 Autonomous: " + r2.isAutonomous);
        System.out.println("R2 Version: " + r2.version);
        System.out.println("R2 Serial: " + r2.serialNumber);

        System.out.println("***** Robot Details *****");

        System.out.println("R3 ID: " + r3.robotId);
        System.out.println("R3 Name: " + r3.robotName);
        System.out.println("R3 Battery: " + r3.batteryCapacity);
        System.out.println("R3 Speed: " + r3.speed);
        System.out.println("R3 Autonomous: " + r3.isAutonomous);
        System.out.println("R3 Version: " + r3.version);
        System.out.println("R3 Serial: " + r3.serialNumber);

        System.out.println("***** Robot Details *****");

        System.out.println("R4 ID: " + r4.robotId);
        System.out.println("R4 Name: " + r4.robotName);
        System.out.println("R4 Battery: " + r4.batteryCapacity);
        System.out.println("R4 Speed: " + r4.speed);
        System.out.println("R4 Autonomous: " + r4.isAutonomous);
        System.out.println("R4 Version: " + r4.version);
        System.out.println("R4 Serial: " + r4.serialNumber);
    }
}