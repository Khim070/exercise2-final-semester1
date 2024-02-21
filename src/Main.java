public class Main {
    public static void main(String[] args) {
        ShoppingCustomer customer = new ShoppingCustomer("Vakhim","normal");
        ShoppingSale s = new ShoppingSale(customer,"21th-February-2024");
        customer.setCustomerType("Premium");
        customer.setCustomerName("LEANG Vakhim");
        s.setServiceExpense(100);
        s.setProductExpense(200);
        s.displayinfo();
    }
}