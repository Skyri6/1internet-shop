public class Basket {
    private static String items = "";

    public static void main(String[] args) {
        add("milk", 75);
        add("kolbasa", 55);
        add("maslo", 90);
        print("soderjimoe");
        clear();
        print("soderjimoe");
    }

    public static void add(String name, int price) {
        items = items + "\n" + name + " - " + price;
    }

    public static void clear() {
        items = "";
    }

    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("pusto");
        } else {
            System.out.println(items);
        }
    }
}
