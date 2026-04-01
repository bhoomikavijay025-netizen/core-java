class Twitter {

    String handleName;
    int followers;
    String tweetCategory;
    char verificationStatus;
    boolean isActive;

    public Twitter(String p1, int p2, String p3, char p4, boolean p5){
        handleName = p1;
        followers = p2;
        tweetCategory = p3;
        verificationStatus = p4;
        isActive = p5;
    }

    void display(){
        System.out.println(handleName);
        System.out.println(followers);
        System.out.println(tweetCategory);
        System.out.println(verificationStatus);
        System.out.println(isActive);
    }
}