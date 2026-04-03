class Chennel {

    String chennelName;
    String language;
    int subscribers;

    public Chennel(String chennelName, String language, int subscribers) {
        this.chennelName = chennelName;
        this.language = language;
        this.subscribers = subscribers;

        System.out.println("Signup for Chennel completed");
  }
    public Chennel(String chennelName) {
        this.chennelName = chennelName;

        System.out.println(chennelName + " signed in successfully");
    }
    public Chennel(String chennelName, String language) {
        System.out.println(chennelName);
        System.out.println(language);
    }
}