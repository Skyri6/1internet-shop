public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("hui", 90);
        vasyaBasket.add("smazka", 50);

        Basket petyaBasket = new Basket();
        petyaBasket.add("banana", 20);
        petyaBasket.add("niger", 1000 );
        petyaBasket.add("wother",10);

        vasyaBasket.print("korzina Vasyi");
        petyaBasket.print("Korzina Petyi");
    }
}
