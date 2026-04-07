class GitDirectRunner {

    public static void main(String[] args) {

        int price = GitDirect.checkItem("mobile");
        System.out.println("Single Price: " + price);

        int total = GitDirect.totalAmount("mobile", price, 2);
        System.out.println("Total Price: " + total);
    }
}