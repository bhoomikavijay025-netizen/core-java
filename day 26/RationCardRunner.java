class RationCardRunner {
    public static void main(String[] args) {

        RationCard card1 = new RationCard();
        card1.cardHolderName = "Luna";
        card1.familyMembers = 4;
        card1.cardType = "APL";
        card1.isActive = true;

        RationCard card2 = new RationCard();
        card2.cardHolderName = "Bruna";
        card2.familyMembers = 3;
        card2.cardType = "BPL";
        card2.isActive = true;

        RationCard card3 = new RationCard();
        card3.cardHolderName = "Minchu";
        card3.familyMembers = 5;
        card3.cardType = "Antyodaya";
        card3.isActive = false;
		
		System.out.println("----- RationCard Details -----");
        System.out.println("card1 holder name: " + card1.cardHolderName);
        System.out.println("card1 family members: " + card1.familyMembers);
        System.out.println("card1 card type: " + card1.cardType);
        System.out.println("card1 active: " + card1.isActive);

		System.out.println("----- RationCard Details -----");
        System.out.println("card2 holder name: " + card2.cardHolderName);
        System.out.println("card2 family members: " + card2.familyMembers);
        System.out.println("card2 card type: " + card2.cardType);
        System.out.println("card2 active: " + card2.isActive);

		System.out.println("----- RationCard Details -----");
        System.out.println("card3 holder name: " + card3.cardHolderName);
        System.out.println("card3 family members: " + card3.familyMembers);
        System.out.println("card3 card type: " + card3.cardType);
        System.out.println("card3 active: " + card3.isActive);

    }
}