  class ChairRunner {
    public static void main(String[] args) {

        Chair chair1 = new Chair();

        chair1.chairId = 1;
        chair1.maxWeight = 120;
        chair1.brandName = "Nilkamal";
        chair1.material = "Plastic";
        chair1.height = 3.2f;
        chair1.isFoldable = true;
        chair1.size = 'M';
        Chair chair2 = new Chair();

        chair2.chairId = 2;
        chair2.maxWeight = 150;
        chair2.brandName = "Godrej";
        chair2.material = "Wood";
        chair2.height = 3.5f;
        chair2.isFoldable = false;
        chair2.size = 'L';
		    Chair chair3 = new Chair();

        chair3.chairId = 3;
        chair3.maxWeight = 100;
        chair3.brandName = "Cello";
        chair3.material = "Steel";
        chair3.height = 3.0f;
        chair3.isFoldable = true;
        chair3.size = 'S';

        Chair chair4 = new Chair();

        chair4.chairId = 4;
        chair4.maxWeight = 180;
        chair4.brandName = "Durian";
        chair4.material = "Leather";
        chair4.height = 3.8f;
        chair4.isFoldable = false;
        chair4.size = 'L';

        System.out.println("***** Chair Details *****");

        System.out.println("Chair1 ID: " + chair1.chairId);
        System.out.println("Chair1 MaxWeight: " + chair1.maxWeight);
		    System.out.println("Chair1 Brand: " + chair1.brandName);
        System.out.println("Chair1 Material: " + chair1.material);
        System.out.println("Chair1 Height: " + chair1.height);
        System.out.println("Chair1 Foldable: " + chair1.isFoldable);
        System.out.println("Chair1 Size: " + chair1.size);

        System.out.println("***** Chair Details *****");

        System.out.println("Chair2 ID: " + chair2.chairId);
        System.out.println("Chair2 MaxWeight: " + chair2.maxWeight);
        System.out.println("Chair2 Brand: " + chair2.brandName);
        System.out.println("Chair2 Material: " + chair2.material);
        System.out.println("Chair2 Height: " + chair2.height);
        System.out.println("Chair2 Foldable: " + chair2.isFoldable);
        System.out.println("Chair2 Size: " + chair2.size);

        System.out.println("***** Chair Details *****");

        System.out.println("Chair3 ID: " + chair3.chairId);
        System.out.println("Chair3 MaxWeight: " + chair3.maxWeight);
        System.out.println("Chair3 Brand: " + chair3.brandName);
        System.out.println("Chair3 Material: " + chair3.material);
        System.out.println("Chair3 Height: " + chair3.height);
        System.out.println("Chair3 Foldable: " + chair3.isFoldable);
        System.out.println("Chair3 Size: " + chair3.size);

		  System.out.println("***** Chair Details *****");

        System.out.println("Chair4 ID: " + chair4.chairId);
        System.out.println("Chair4 MaxWeight: " + chair4.maxWeight);
        System.out.println("Chair4 Brand: " + chair4.brandName);
        System.out.println("Chair4 Material: " + chair4.material);
        System.out.println("Chair4 Height: " + chair4.height);
        System.out.println("Chair4 Foldable: " + chair4.isFoldable);
        System.out.println("Chair4 Size: " + chair4.size);
    }
}