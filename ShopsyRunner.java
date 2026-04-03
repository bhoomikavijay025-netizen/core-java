class ShopsyRunner {

    public static void main(String[] args) {

        System.out.println("Signup Page");

        Shopsy bhoomi = new Shopsy("Bhoomi", "bhoomi@gmail.com", "1234");

        System.out.println("Login Page");

        Shopsy login = new Shopsy("Bhoomi");

        System.out.println("Profile Page");

        Shopsy profile = new Shopsy("Bhoomi", "bhoomi@gmail.com");
    }
}