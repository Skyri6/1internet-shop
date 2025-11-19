public class Basket {
    private static String items = "";
    private static int totalPrise = 0;

    public static void main(String[] args) {
        add("milk", 75);
        add("kolbasa", 55);
        add("maslo", 90);
        print("soderjimoe");
        System.out.println(getTotalPrise());
        clear();
        print("soderjimoe");
        System.out.println(getTotalPrise());
    }



    public static void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrise = totalPrise + price;
    }

    public static void clear() {
        items = "";
        totalPrise = 0;
    }

    public static int getTotalPrise(){
        return totalPrise;
    }

    public static boolean contains(String name) {
        return (items.contains(name)) ;
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
