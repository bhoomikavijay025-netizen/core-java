class YouTubeRunner {

    public static void main(String[] args) {

        YouTube y1 = new YouTube("TechWorld", 500000, "Technology", 4.5);
        y1.display();

        YouTube y2 = new YouTube("FoodMania", 250000, "Cooking", 4.3);
        y2.display();

        YouTube y3 = new YouTube("FitLife", 300000, "Fitness", 4.7);
        y3.display();

        YouTube y4 = new YouTube("TravelVlogs", 150000, "Travel", 4.3);
        y4.display();

        YouTube y5 = new YouTube("MusicHub", 800000, "Music", 4.8);
        y5.display();

        YouTube y6 = new YouTube("GameZone", 400000, "Gaming", 4.4);
        y6.display();

        YouTube y7 = new YouTube("StudyPoint", 200000, "Education", 4.6);
        y7.display();
    }
}