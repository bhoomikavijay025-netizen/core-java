class Telegram {

    String userName;
    String channelName;
    char gender;
    boolean isPremium;

    public Telegram(String p1, String p3, char p4, boolean p5){
        userName = p1;
        channelName = p3;
        gender = p4;
        isPremium = p5;
    }

    void display(){
        System.out.println(userName);
        System.out.println(channelName);
        System.out.println(gender);
        System.out.println(isPremium);
    }
}