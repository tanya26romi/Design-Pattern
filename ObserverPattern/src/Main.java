public class Main {
    public static void main(String[] args) {


        Amazon amazon = Amazon.getInstance();

        Customer customer = new Customer();
        amazon.orderPlaced();
    }
}