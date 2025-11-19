public class Basket {
    private  String items = "";
    private int totalPrise = 0;
    private int limit;

    public Basket() {
        items = "Spisok tovarov";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrise){
        this();
        this.items =  this.items + items;
        this.totalPrise = totalPrise;
    }


    public void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        if (totalPrise+price >= limit){
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
