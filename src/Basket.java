public class Basket {
    private  String items = "";
    private int totalPrise = 0;

    public void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrise = totalPrise + price;
    }

    public  void clear() {
        items = "";
        totalPrise = 0;
    }

    public int getTotalPrise(){
        return totalPrise;
    }

    public  boolean contains(String name) {
        return (items.contains(name)) ;
    }

    public  void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("pusto");
        } else {
            System.out.println(items);
        }
    }
}
