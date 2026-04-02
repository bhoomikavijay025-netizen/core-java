class YahooRunner {
    public static void main(String[] args) {

        Yahoo suma = new Yahoo("suma","suma@yahoo.com",9876543210L,"Hassan");
        Yahoo spoorthi = new Yahoo("spoorthi","spoorthi@yahoo.com",9876543211L,"Bangalore");
        Yahoo vidya = new Yahoo("vidya","vidya@yahoo.com",9876543212L,"Mysore");
        Yahoo siri = new Yahoo("siri","siri@yahoo.com",9876543213L,"Chennai");
        Yahoo sihi = new Yahoo("sihi","sihi@yahoo.com",9876543214L,"Hyderabad");
        Yahoo adi = new Yahoo("adi","adi@yahoo.com",9876543215L,"Pune");
        Yahoo adya = new Yahoo("adya","adya@yahoo.com",9876543216L,"Delhi");

        suma.display();
        spoorthi.display();
        vidya.display();
        siri.display();
        sihi.display();
        adi.display();
        adya.display();
    }
}