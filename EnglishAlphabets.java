class EnglishAlphabets{

    // Static Variables (Class Variables)
    static int totalLetters = 26;
    static char firstLetter = 'A';
    static char lastLetter = 'Z';
	 
    public static void main(String[] args) {

        // Local Variables
        long alphabetCode = 123456789L;
        float version = 1.0f;
       boolean isUniversal = true;

        // Printing Static Variables
        System.out.println("totalLetters:" + totalLetters);
        System.out.println("firstLetter:" + firstLetter);
        System.out.println("lastLetter:" + lastLetter);

        // Printing Local Variables
        System.out.println("alphabetCode: " + alphabetCode);
        System.out.println("version:" + version);
        System.out.println("isUniversal:" + isUniversal);
    }
}