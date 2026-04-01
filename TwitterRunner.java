class TwitterRunner {

    public static void main(String[] args) {

        Twitter t1 = new Twitter("NewsBuzz", 1000000, "News", 'Y', true);
        t1.display();

        Twitter t2 = new Twitter("SportsLive", 750000, "Sports", 'Y', true);
        t2.display();

        Twitter t3 = new Twitter("MovieTalk", 500000, "Entertainment", 'N', true);
        t3.display();

        Twitter t4 = new Twitter("TechGuru", 300000, "Technology", 'Y', false);
        t4.display();

        Twitter t5 = new Twitter("FoodTweets", 200000, "Food", 'N', true);
        t5.display();

        Twitter t6 = new Twitter("TravelNow", 150000, "Travel", 'N', false);
        t6.display();

        Twitter t7 = new Twitter("EduWorld", 400000, "Education", 'Y', true);
        t7.display();
    }
}