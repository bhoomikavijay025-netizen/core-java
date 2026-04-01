class CartManager {
    public static void main(String[] args) {

          int cartId = 901;
        double totalAmount = 3499.99;
        String customerName = "Kiran";
        boolean isCheckedOut = false;
        char cartStatus = 'A';
        System.out.println("Cart ID: " + cartId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Cart Status: " + cartStatus);

        cartId = 902;
        totalAmount = 4125.50;
        customerName = "Sharu";
        isCheckedOut = true;
        cartStatus = 'C';
        System.out.println("Cart ID: " + cartId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Cart Status: " + cartStatus);
    }
}