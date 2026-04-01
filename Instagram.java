class Instagram {

    String userId;
    int followers;
    boolean isPrivate;

    public Instagram(String p1, int p2, boolean p3){
        userId = p1;
        followers = p2;
        isPrivate = p3;
    }

    void display(){
        System.out.println(userId);
        System.out.println(followers);
        System.out.println(isPrivate);
    }
}