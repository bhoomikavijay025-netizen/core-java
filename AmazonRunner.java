 class AmazonRunner {

    public static void main(String[] args) {

        int price = Amazon.checkOrder("earphone");
        System.out.println("Single Price: " + price);

        int total = Amazon.checkItem("earphone", price, 2);
        System.out.println("Total Price: " + total);
    }
  
  }
