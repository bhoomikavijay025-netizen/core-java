class Camera {

    public static void main(String[] args){

        System.out.println("Are you capturing photos");
        getCamera();
        int indoorPhotos = 80;
        int outdoorPhotos = 150;
        boolean isDigital = true;

        showPhotos(indoorPhotos, outdoorPhotos, isDigital);
        int totalPhotos = calculatePhotos(indoorPhotos, outdoorPhotos);
        System.out.println("Total Photos : " + totalPhotos);
        String brand = getBrand();
        System.out.println("Camera Brand : " + brand);
    }
    static void getCamera(){
        System.out.println("Yes I capture beautiful photos");
    }
    static void showPhotos(int indoorPhotos, int outdoorPhotos, boolean isDigital){
        System.out.println("Indoor Photos : " + indoorPhotos);
        System.out.println("Outdoor Photos : " + outdoorPhotos);
        System.out.println("Digital Camera : " + isDigital);
    }
    static int calculatePhotos(int indoorPhotos, int outdoorPhotos){
        return indoorPhotos + outdoorPhotos;
    }
    static String getBrand(){
        return "Canon";
    }
}