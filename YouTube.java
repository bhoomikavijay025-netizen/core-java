class YouTube {

    String channelName;
    int subscribers;
    String contentType;
    double rating;

    public YouTube(String p1, int p2, String p3, double p4){
        channelName = p1;
        subscribers = p2;
        contentType = p3;
        rating = p4;
    
    }

    void display(){
        System.out.println(channelName);
        System.out.println(subscribers);
        System.out.println(contentType);
        System.out.println(rating);
  
    }
}