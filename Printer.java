class Printer {

    public static void main(String[] args){

        System.out.println("Are you printing documents");
        getPrinter();

        int blackPrints = 60;
        int colorPrints = 40;
        boolean isWireless = true;
        showPrints(blackPrints, colorPrints, isWireless);

        int totalPrints = calculatePrints(blackPrints, colorPrints);
        System.out.println("Total Prints : " + totalPrints);

        String brand = getBrand();
        System.out.println("Printer Brand : " + brand);
    }
    static void getPrinter(){
        System.out.println("Yes I print documents and images");
    }
   
    static void showPrints(int blackPrints, int colorPrints, boolean isWireless){
        System.out.println("Black Prints : " + blackPrints);
        System.out.println("Color Prints : " + colorPrints);
        System.out.println("Wireless Printer : " + isWireless);
    }
    static int calculatePrints(int blackPrints, int colorPrints){
        return blackPrints + colorPrints;
    }
    static String getBrand(){
        return "HP";
    }
}