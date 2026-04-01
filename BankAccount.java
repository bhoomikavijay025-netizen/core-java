class BankAccount {

    // Static Variables (Class Variables)
    static String bankName = "SBI";
    static String branchName = "Main Branch";
    static int establishedYear = 1955;
	
    public static void main(String[] args) {

        // Local Variables
        String accountHolderName = "Me";
        int accountNumber = 2474351;
        double balance = 8535;

        // Printing Static Variables
        System.out.println("bankName: " + bankName);
        System.out.println("branchName: " + branchName);
        System.out.println("EstablishedYear: " + establishedYear);

        // Printing Local Variables
        System.out.println("accountHolderName: " + accountHolderName);
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("balance: " + balance);
    }
}