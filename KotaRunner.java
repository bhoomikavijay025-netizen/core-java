class KotaRunner {
    public static void main(String[] args) {

        Kota sanju = new Kota("sanju", "sanju@gmail.com", "123");
        Kota leela = new Kota("leela", "leela@gmail.com", "123");
        Kota yashu = new Kota("yashu", "yashu@gmail.com", "123");
        Kota reena = new Kota("reena", "reena@gmail.com", "123");
        Kota kushi = new Kota("kushi", "kushi@gmail.com", "123");
        Kota harshi = new Kota("harshi", "harshi@gmail.com", "123");
        Kota prani = new Kota("prani", "prani@gmail.com", "123");

        sanju.display();
        leela.display();
        yashu.display();
        reena.display();
        kushi.display();
        harshi.display();
        prani.display();
    }
}