class Television {

    public static void main(String[] args){

        System.out.println("Are you showing programs");

        getTelevision();

        int newsHours = 5;
        int movieHours = 8;
        boolean isSmartTV = true;

        showPrograms(newsHours, movieHours, isSmartTV);

        int totalHours = calculateHours(newsHours, movieHours);
        System.out.println("Total Watching Hours : " + totalHours);

        String brand = getBrand();
        System.out.println("TV Brand : " + brand);
    }

    static void getTelevision(){
        System.out.println("Yes I display entertainment");
    }

    static void showPrograms(int newsHours, int movieHours, boolean isSmartTV){
        System.out.println("News Hours : " + newsHours);
        System.out.println("Movie Hours : " + movieHours);
        System.out.println("Smart TV : " + isSmartTV);
    }

    static int calculateHours(int newsHours, int movieHours){
        return newsHours + movieHours;
    }

    static String getBrand(){
        return "LG";
    }
}