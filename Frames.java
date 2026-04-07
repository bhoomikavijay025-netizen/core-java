class Frames{

    static int getSize() {
      int size = 12;
       System.out.println(size);
       return size;
 }
    static void showType(String type){
      System.out.println(type);
        int s = getSize();
        System.out.println(s);
    }
    static void displayFrame(){
        System.out.println("Frame displayed");

        showType("Photo Frame");
 }
}