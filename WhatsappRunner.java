class WhatsappRunner {

    public static void main(String[] args) {

        Whatsapp w1 = new Whatsapp("Ravi", "9876543210", "Busy", 'M');
        w1.display();

        Whatsapp w2 = new Whatsapp("Sneha", "9123456780", "Available", 'F');
        w2.display();

        Whatsapp w3 = new Whatsapp("Karthik", "9012345678", "At work", 'M');
        w3.display();

        Whatsapp w4 = new Whatsapp("Pooja", "9988776655", "Sleeping", 'F');
        w4.display();

        Whatsapp w5 = new Whatsapp("Manoj", "9090909090", "In meeting", 'M');
        w5.display();

        Whatsapp w6 = new Whatsapp("Nisha", "8887776665", "Happy", 'F');
        w6.display();

        Whatsapp w7 = new Whatsapp("Ajay", "7776665554", "Offline", 'M');
        w7.display();
    }
}