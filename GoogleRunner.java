class GoogleRunner {
    public static void main(String[] args) {

        Google impi = new Google("impi", "impi@gmail.com", "123", 9876543210L, "Hassan");
		        impi.display();

        Google ramya = new Google("ramya", "ramya@gmail.com", "123", 9876543211L, "Bangalore");
		        ramya.display();

        Google vidya = new Google("vidya", "vidya@gmail.com", "123", 9876543212L, "Mysore");
		        vidya.display();
        Google sanika = new Google("sanika", "sanika@gmail.com", "123", 9876543213L, "Chennai");
		        sanika.display();

        Google ankita = new Google("ankita", "ankita@gmail.com", "123", 9876543214L, "Hyderabad");
		        ankita.display();

        Google sowmya = new Google("sowmya", "sowmya@gmail.com", "123", 9876543215L, "Pune");
		        sowmya.display();
        Google navya = new Google("navya", "navya@gmail.com", "123", 9876543216L, "Delhi");
        navya.display();
    }
}