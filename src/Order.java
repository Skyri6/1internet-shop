public class Order {
    public void addProduct(Product product){
        //adds products
        if(product.getPrice() > 50){
            product.setPrice(product.getPrice() - 25);
        }
    }
}
